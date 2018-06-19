package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RpsGameEngine {

        private int score = 0;
        private int compScore = 0;
        private int round = 1;
        private int winRounds;
        private String name;
        private int choice;

        private final int KAMIEN = 1;
        private final int PAPIER = 2;
        private final int NOZYCE = 3;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> lista = new ArrayList<>();{
        lista.add("Kamien");
        lista.add("Papier");
        lista.add("Nozyce");
        }

        public void preGameInfo(){
            System.out.println("this is the basic information how to operate the game");
            System.out.println();
            System.out.println("to pick rock type ' 1 '");
            System.out.println("to pick paper type ' 2 '");
            System.out.println("to pick scissors type ' 3 '");
            System.out.println("To exit a game type ' x '");
            System.out.println("To start a new game type ' n '");
        }

        public void preGameRoundChoiceAndName() {
            System.out.println("Welcome to | Rock Paper Scissors | ");
            System.out.println("Give Player's name :");
            name = scanner.next();
            System.out.println("Welcome " + name);
            System.out.println();

        }

        public void showWinner() {
            if ( compScore == winRounds) {
                System.out.println("the winner is Computer "  );
            }
            else if ( score == winRounds) {
                System.out.println("The winner is " + name  );
            }

        }

        public void newGameOrExit(){
            System.out.println();
            System.out.println("Start a new game or exit?");
            String choice = scanner.next();
            System.out.println();
            if (choice.equals("n")){
                winsNumber();
                theGame();
                newGameOrExit();
            }else if (choice.equals("x")){
                definitiveExit();
            }else{
                System.out.println("Wrong key");
                newGameOrExit();
            }
        }

        public void definitiveExit(){
            System.out.println("Are you sure you want to exit a game ?");
            if (scanner.next().equals("x")) {
                System.exit(0);
            }else{
                newGameOrExit();
            }
        }

        public int giveANumber() {
            choice = scanner.nextInt();
            if ( choice < lista.size() + 1 && choice > 0){
                System.out.print("You picked: " + lista.get(choice-1) + " | ");
            } else{
                System.out.println("Wrong Number");
                giveANumber();
            }
            return choice;
        }

        public void winsNumber(){
            System.out.println("Decide how many wins are needed to finish a game: ");
            winRounds = scanner.nextInt();
        }

        public void theGame() {

            Boolean end = false;

            while ( !end) {

                int computerChoice = random.nextInt(3) + 1;


                System.out.println();

                System.out.println("Make your choice");

                giveANumber();


                System.out.print("Computer picked " + lista.get(computerChoice - 1) + " | ");


                if (computerChoice == 1  && choice == 1 ){
                    System.out.println("Draw");
                }

                if (computerChoice == PAPIER && choice == KAMIEN ) {
                    System.out.println("Computer won "  + round + " round");
                    compScore += 1;
                }

                if (computerChoice == NOZYCE && choice == KAMIEN ) {
                    System.out.println("You won " + round + " round");
                    score += 1;
                }

                if ( computerChoice == KAMIEN && choice == PAPIER) {
                    System.out.println("You won "  + round + " round");
                    score += 1;
                }

                if ( computerChoice == PAPIER && choice == PAPIER) {
                    System.out.println("Draw ");
                }

                if ( computerChoice == NOZYCE && choice == PAPIER) {
                    System.out.println("Computer won "  + round + " round");
                    compScore += 1;
                }

                if ( computerChoice == KAMIEN && choice == NOZYCE) {
                    System.out.println("Computer won "  + round + " round");
                    compScore += 1;
                }

                if ( computerChoice == PAPIER && choice == NOZYCE) {
                    System.out.println("You won "  + round + " round");
                    score += 1;
                }

                if ( computerChoice == NOZYCE && choice == NOZYCE) {
                    System.out.println("Draw ");
                }

                round += 1;
                System.out.println("Actual score is: " + name +":" + " " + score + " | " + "Computer: " + compScore);
                if (compScore == winRounds || score == winRounds) {
                    end = true;
                    showWinner();
                }
            }
        }
}

