package com.gupao.course.demo;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class RunnableDemo implements Runnable{

    public static void main(String[] args) {
        System.out.println("主线程ID:"+ Thread.currentThread().getId());
        RunnableDemo runnableDemo=new RunnableDemo();
        new Thread(runnableDemo).start();
    }

    public void run() {
        System.out.println("子线程ID:"+Thread.currentThread().getId());
    }
}
