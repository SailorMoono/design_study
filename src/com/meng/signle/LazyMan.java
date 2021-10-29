package com.meng.signle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyMan {

   private static volatile LazyMan lazyMan;

   public LazyMan(){
        synchronized (LazyMan.class){
            if(lazyMan == null){
                throw new RuntimeException("防止反射创建");
            }
        }
   }

    public static LazyMan getLazyMan(){

//        双重检测
        if(lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                    /*
                    * 1.分配内存空间
                    * 2.执行构造方法
                    * 3.把这个对象指向这个空间
                    *
                    * 如果不按123执行
                    *A线程执行13(没有完成构造) 刚好B线程执行到判断拿到空值
                    *
                    *
                    * synchronized不能把整个run方法锁了，只能锁run中调用的方法
                    * */
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) throws NoSuchMethodException {
//        for(int i = 0;i < 100; i++){
//            new Thread(
//                ()->{
//                    LazyMan lazyMan = LazyMan.getLazyMan();
//                    System.out.println(lazyMan.hashCode());
//                }
//            ).start();
//        }
        LazyMan lazyMan = LazyMan.getLazyMan();
//反射创建测试
        Constructor<? extends LazyMan> declaredConstructor = lazyMan.getClass().getDeclaredConstructor(null);
        try {
            LazyMan lazyMan1 = declaredConstructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
