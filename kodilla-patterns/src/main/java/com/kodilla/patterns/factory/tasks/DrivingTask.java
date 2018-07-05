package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isExecuteStarted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("the journey starting using " + using + " to " + where);
        isExecuteStarted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        String gpsCurrentLocation = "Atlanta";
        if(gpsCurrentLocation == where) {
            isExecuteStarted = true;
            return isExecuteStarted;
        }else
            isExecuteStarted = false;
            return isExecuteStarted;
    }
}
