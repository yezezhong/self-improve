package com.gupao.course.demo.chonggou;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class FilterWithSexStrategy implements FilterStrategy{

    @Override
    public boolean check(Teacher teacher) {
        return "男".equals(teacher.getSex());
    }
}
