package com.gupaoedu.michael.demo;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */

@FunctionalInterface
public interface IBufferedReaderInterface {


    String process(BufferedReader bufferedReader) throws IOException;


    //default    static   基于Object的方法重写   hash/ equals

}
