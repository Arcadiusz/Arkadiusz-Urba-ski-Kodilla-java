package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println("Mentor " + name + ": New task from " + homeworkQueue.getName() + "\n" +
                " (total: " + homeworkQueue.getTasks().size() + " tasks from " + homeworkQueue.getName() + ")");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}