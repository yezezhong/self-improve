package com.gupaoedu.dubbo;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class GpHelloImpl implements IGpHello{

    @Override
    public String sayHello(String msg) {
        System.out.println("Server receive:"+msg);
        return "Hello,"+msg;
    }
}
