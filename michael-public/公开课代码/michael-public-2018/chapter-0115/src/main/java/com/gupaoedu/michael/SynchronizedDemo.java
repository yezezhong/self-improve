package com.gupaoedu.michael;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class SynchronizedDemo {

    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class){

        }
    }

    public void demo(){
        synchronized (this){

        }
    }
}
