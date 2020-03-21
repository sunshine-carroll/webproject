package com.sunshine.webproject.enums.time;
/**
 * @author sunshine
 * @date :2020/3/21 17:35
 * @description: month
 */
public enum Month {
    /*
     * @author sunshine
     * @date :2020/3/21 17:48
     * 一月 Jan. 二月 Feb. 三月 Mar. 四月 Apr. 五月 May 六月 Jun.
     * 七月 Jul. 八月 Aug. 九月 Sept.十月 Oct.十一月 Nov.十二月 Dec.
     */
    NONE("none."),
    January("Jan");
    ;
    private final String abbreviation;

    Month(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
