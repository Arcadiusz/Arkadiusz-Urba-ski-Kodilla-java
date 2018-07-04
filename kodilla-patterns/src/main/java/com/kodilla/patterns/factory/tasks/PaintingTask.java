package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Starting to execute " + taskName + ". Thing to paint : " + whatToPaint + " wanted color is " + color);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean isWhatToPaintFullyPainted = true;
        if (isWhatToPaintFullyPainted) {
            return true;
        }else
            return false;
    }
}
