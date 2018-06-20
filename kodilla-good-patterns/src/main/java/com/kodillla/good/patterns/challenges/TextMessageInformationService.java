package com.kodillla.good.patterns.challenges;

public class TextMessageInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("Sending text message notify to " + user.getName() + " " + user.getSurname());
    }
}