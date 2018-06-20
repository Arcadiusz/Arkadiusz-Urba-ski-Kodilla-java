package com.kodillla.good.patterns.challenges;

public class MailInformationService implements InformationService {

    @Override
    public void inform(User user){
        System.out.println("sending mail to " + user);
    }

}
