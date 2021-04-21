package Reflect;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class MyReflect {

    private int num;

    public MyReflect(int num) {
        this.num = num;
    }

    public static void main(String[] args) throws  Exception {
        Class<?> clazz = Class.forName("Reflect.MyReflect");
        System.out.println(Arrays.toString(clazz.getMethods()));
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
//        MyReflect o = (MyReflect) clazz.newInstance();
        Constructor<?> constructor = clazz.getConstructor(int.class);
        MyReflect o =(MyReflect) constructor.newInstance(1);
        System.out.println(o.num);

    }



}
