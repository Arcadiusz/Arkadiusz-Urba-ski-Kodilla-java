package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main ( String [] args ){

        RpsGameEngine engine = new RpsGameEngine();

        engine.preGameRoundChoiceAndName();
        engine.preGameInfo();
        engine.newGameOrExit();
    }
}
