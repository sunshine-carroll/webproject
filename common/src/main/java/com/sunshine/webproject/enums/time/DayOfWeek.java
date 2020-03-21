package com.sunshine.webproject.enums.time;
/**
 * @author sunshine
 * @date :2020/3/21 17:35
 * @description: day
 */
public enum DayOfWeek {
    SUNDAY("Jan"),
    MONDAY("Feb"),
    TUESDAY(""),
    WEDNESDAY(""),
    THURSDAY(""),
    FRIDAY(""),
    SATURDAY(""),
    ;
    private final String abbreviation;

    DayOfWeek(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
