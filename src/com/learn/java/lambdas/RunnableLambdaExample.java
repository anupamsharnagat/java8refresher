package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /***
         * Prior to java 8...
         * **/
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable 1");
            }
        };

        new Thread(runnable).start();

        //using lambda

        Runnable runnable1=()->{
            System.out.println("inside Runnable 2");
        };

        Runnable runnable2=()-> System.out.println("inside runnable 3");
        new Thread(runnable2).start();

        new Thread(runnable1).start();

        new Thread(()-> System.out.println("inside runnable 4")).start();

    }
}
