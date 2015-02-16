/*
package com.mkyong.config.core;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

*/
/**
 * Created by deepali on 10/30/14.
 *//*

public class ReflectApp {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AppTest appTest = new AppTest(10);
        */
/*Field appTEstPrivateField = AppTest.class.getDeclaredField("counter");*//*

        Method appTestPrivateMEthod = AppTest.class.getDeclaredMethod("getCounter", null);
        appTestPrivateMEthod.setAccessible(true);
        int a = (Integer) appTestPrivateMEthod.invoke(appTest,null);
        System.out.println(a);
  */
/*      appTEstPrivateField.setAccessible(true);
        Integer fieldValue = (Integer) appTEstPrivateField.get(appTest);
    *//*
   */
/* System.out.println("Field's value :"+fieldValue);*//*

        try {
            Class cls = Class.forName("com.mkyong.config.core.AppTest");
            Method [] methods = cls.getMethods();

            for(Method method : methods){
                if(isGetter(method)) System.out.println("getter : "+ method);
                if(isSetter(method)) System.out.println("setter : "+ method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
      */
/*  //no param        Class noparams[] = {};

        //string parameter
        Class[] stringParam = new Class[1];
        stringParam[0] = String.class;

        //int param
        Class[] intParam = new Class[1];
        intParam[0] = Integer.TYPE;

        //Load the AppTest at runtime
        try {
            Class cls = Class.forName("com.mkyong.config.core.AppTest");
            Object obj = cls.newInstance();

            Method method = cls.getDeclaredMethod("printIt", noparams);
            method.invoke(obj, null);

            method = cls.getDeclaredMethod("printItString",stringParam);
            method.invoke(obj, new String("dee"));

            method = cls.getDeclaredMethod("printItInt", intParam);
            method.invoke(obj, new Integer(100));

            method = cls.getDeclaredMethod("setCounter", intParam);
            method.invoke(obj, new Integer(30));

            method = cls.getDeclaredMethod("printCounter", noparams);
            method.invoke(obj, null);

        } catch (Exception c) {
            c.printStackTrace();
        }*//*

    }

    private static boolean isSetter(Method method) {
        if(!method.getName().startsWith("get"))      return false;
        if(method.getParameterTypes().length != 0)   return false;
        if(void.class.equals(method.getReturnType())) return false;
        return true;

    }

    private static boolean isGetter(Method method) {
        if(!method.getName().startsWith("set")) return false;
        if(method.getParameterTypes().length != 1) return false;
        return true;
    }
}
*/
