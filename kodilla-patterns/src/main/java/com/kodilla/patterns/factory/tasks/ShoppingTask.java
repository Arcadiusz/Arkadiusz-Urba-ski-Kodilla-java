package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecuteStarted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("the " + taskName + " is beeing processed");
        isExecuteStarted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean executed;
        if(quantity > 2) {
            executed = true;
            return executed;
        }else
            executed = false;
            return executed;
    }
}
