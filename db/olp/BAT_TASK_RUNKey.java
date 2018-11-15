package com.bea.olp;

public class BAT_TASK_RUNKey {
    private String taskNo;

    private String taskDate;

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate == null ? null : taskDate.trim();
    }
}