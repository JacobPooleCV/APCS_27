/*
 *	Author: Justin Pyo
 *  Date: 10/25/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int done = 0;

        while(done == 0){
        System.out.println("Would you like to play the computer? (yes/no/done)");
        String follow = sc.nextLine();

        if (follow.equalsIgnoreCase("yes")){
            System.out.println("");
            System.out.println("---------------------------------------------------");
            System.out.println("Please enter rock/paper/scissors:");
            String objectP = sc.nextLine();
            int retry = 0;

            while(retry == 0){
            if(!objectP.equalsIgnoreCase("rock") && !objectP.equalsIgnoreCase("paper") && !objectP.equalsIgnoreCase("scissors")){
            System.out.println("Invalid input, please type in rock/paper/scissors:");
            objectP = sc.nextLine();
            }
            else {
            retry = 1;
            }
            }

            String objectC = objectC();
            if(objectP.equalsIgnoreCase(objectC)){
                System.out.println("You tied!");
            }
            else if(objectP.equalsIgnoreCase("rock") && objectC.equals("paper")){
                System.out.println("You lost! :(");
            }
            else if(objectP.equalsIgnoreCase("paper") && objectC.equals("scissors")){
                System.out.println("You lost! :(");
            }
            else if(objectP.equalsIgnoreCase("scissors") && objectC.equals("rock")){
                System.out.println("You lost! :(");
            }
            else if(objectP.equalsIgnoreCase("rock") && objectC.equals("scissors")){
                System.out.println("You won!!!");
            }
            else if(objectP.equalsIgnoreCase("paper") && objectC.equals("rock")){
                System.out.println("You won!!!");
            }
            else if(objectP.equalsIgnoreCase("scissors") && objectC.equals("paper")){
                System.out.println("You won!!!");
            }

            System.out.println();
            System.out.println("---------------------------------------------------");

        }
        else if (follow.equalsIgnoreCase("no")){

        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("How many times would you like the computer to play itself?");
        int playamount = sc.nextInt();
        sc.nextLine();
    
        
        int PaWins = 0;
        int PbWins = 0;
        int Ties = 0;

        while(playamount != 0){

        String objectPa = objectC();
        String objectPb = objectC();

            if(objectPa.equalsIgnoreCase(objectPb)){
                Ties++;
            }
            else if(objectPa.equalsIgnoreCase("rock") && objectPb.equals("paper")){
                PbWins++;
            }
            else if(objectPa.equalsIgnoreCase("paper") && objectPb.equals("scissors")){
                PbWins++;            
            }
            else if(objectPa.equalsIgnoreCase("scissors") && objectPb.equals("rock")){
                PbWins++;
            }
            else if(objectPa.equalsIgnoreCase("rock") && objectPb.equals("scissors")){
                PaWins++;
            }
            else if(objectPa.equalsIgnoreCase("paper") && objectPb.equals("rock")){
                PaWins++;
            }
            else if(objectPa.equalsIgnoreCase("scissors") && objectPb.equals("paper")){
                PaWins++;
            }
            playamount--;
        }

            System.out.println("Player 1 wins: " + PaWins);
            System.out.println("Player 2 wins: " + PbWins);
            System.out.println("Ties: " + Ties);
            System.out.println();
            System.out.println("---------------------------------------------------");

        }
        else if (follow.equalsIgnoreCase("done")){

            done = 1;
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println("Thanks for playing!");
        }
        else {
            System.out.println("You typed an invalid input!");
        }
        }

    }

    public static String objectC(){
        int pickrandom = (int)(Math.random()*3+1);
        if(pickrandom == 1){
            return "rock";
        }
        else if(pickrandom ==2){
            return "paper";
        }
        else {
            return "scissors";
        }
    }



    

}

