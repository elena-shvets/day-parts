package com.ardas.test_task;

/**
 * Class {@link com.ardas.test_task.DayPart}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 12.11.15
 */


public enum DayPart {

    MORNING("morning", "06:00:00", "09:00:00"),
    DAY("day", "09:00:00", "19:00:00"),
    EVENING("evening", "19:00:00", "23:00:00"),
    NIGHT("night", "23:00:00", "06:00:00");

    DayPart(String name, String beginTime, String endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.name = name;
    }

    private String name;

    private String beginTime;

    private String endTime;

    public String getName() {
        return name;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
