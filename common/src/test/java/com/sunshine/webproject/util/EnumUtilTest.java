package com.sunshine.webproject.util;

import com.sunshine.webproject.utils.EnumUtil;
import org.junit.Assert;
import org.junit.Test;

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
}
