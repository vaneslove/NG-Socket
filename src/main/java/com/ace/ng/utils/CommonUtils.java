package com.ace.ng.utils;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2014/6/7.
 */
public class CommonUtils {
    public static boolean hasDeclaredMethod(Class c,String name,Class... paramTypes){
        Method[] methods=c.getDeclaredMethods();
        boolean b=true;
        for(Method m:methods){
            b=b&&m.getName().equals(name);
            if(!b){
                continue;
            }
            b=b&&(paramTypes.length==m.getParameterCount());
            if(!b){
                continue;
            }
            Class[] methodParamTypes=m.getParameterTypes();
            for(int i=0;i<methodParamTypes.length;i++){
                b=b&&(methodParamTypes[i]==paramTypes[i]);
                if(!b){
                    return  false;
                }
            }
            if(b){
                return true;
            }
        }
        return false;
    }
    public static String firstToUpperCase(String s){
        return s.replaceFirst( s.substring(0, 1), s.substring(0, 1).toUpperCase());
    }
}
