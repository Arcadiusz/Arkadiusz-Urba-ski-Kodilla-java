package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("the journey starting using " + using + " to " + where);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        String gpsCurrentLocation = "Atlanta";
        if(gpsCurrentLocation == where) {
            return true;
        }else
            return false;
    }
}
