package com.gupaoedu.dubbo.demo;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class Thread1 extends Thread{

    private Object lock;

    public Thread1(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            System.out.println("开始执行Thread1");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束执行Thread1");
        }
    }
}