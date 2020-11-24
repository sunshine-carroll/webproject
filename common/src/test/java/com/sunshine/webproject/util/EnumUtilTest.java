package com.sunshine.webproject.util;

import com.sunshine.webproject.concurrency.annotations.GuardBy;
import com.sunshine.webproject.utils.EnumUtil;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * @author: sunshine
 * @date: 2020/3/21 17:15
 * @description : 测试EnumUtil
 */

public class EnumUtilTest {

    public enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    @Test
    public void testGetEnum(){
        Day day = EnumUtil.getEnum(Day.class,0);
        Assert.assertEquals(day,Day.SUNDAY);
        day = EnumUtil.getEnum(Day.class,1);
        Assert.assertEquals(day,Day.MONDAY);
        day = EnumUtil.getEnum(Day.class,2);
        Assert.assertEquals(day,Day.TUESDAY);
        day = EnumUtil.getEnum(Day.class,3);
        Assert.assertEquals(day,Day.WEDNESDAY);
        day = EnumUtil.getEnum(Day.class,4);
        Assert.assertEquals(day,Day.THURSDAY);
        day = EnumUtil.getEnum(Day.class,5);
        Assert.assertEquals(day,Day.FRIDAY);
        day = EnumUtil.getEnum(Day.class,6);
        Assert.assertEquals(day,Day.SATURDAY);
    }

    @Test
    public void test(){
        String s="/a11/b1%#/../c/./d";
        String rex = "/[\\d\\w\\%\\#]*/\\.\\.";
        String rex1="/\\.";
        String a=s.replaceAll(rex,"");
        String b=a.replaceAll(rex1,"");
        System.out.println(b);
    }

    class test implements GuardBy{

        private String description;
        @Override
        public String description() {
            return description;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return GuardBy.class;
        }
    }
}
