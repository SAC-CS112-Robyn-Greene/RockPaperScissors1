/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;


/**
 *
 * @author Robyn
 */
public class RockPaperScissors1 {

    /**
     * @param args the command line arguments
     */
        //main method begins this application
    public static void main(String[] args)
{
         // rock beats scissors 0=rock
         // paper beats rock 1=paper
         // scissors beats paper 2=scissor

	String computerChoice;
	String userChoice;

	double random= Math.random();
	//System.out.println(random);     
                
	if (random < 0.33) {
	computerChoice="Rock";
        }
	else if (random < 0.66 ) {
            computerChoice="Paper";
        } 
        else {
        computerChoice="Scissors";
        }
	System.out.println(computerChoice);
	
	System.out.print("Type in your choice ");
 	Scanner myScanner = new Scanner(System.in);                     
    	userChoice = myScanner.nextLine();
        	
    	//if it is a tie
         if(userChoice.equals(computerChoice))
         { System.out.println("It's a tie! We both chose " + computerChoice);
	  return;             
         }
	else 
         { System.out.println("Computer chose " + computerChoice + " You chose " + userChoice);
         }
        switch (userChoice) {
            case "Rock":
                if (computerChoice.equals("Scissors")){
                    System.out.println("You have won!");
                }else {
                    System.out.println("Computer wins!");
                }        break;
            case "Paper":
                if (computerChoice.equals("Rock")){
                    System.out.println("You have won!");
                } else{
                    System.out.println("Computer wins!");
                }        break;
            case "Scissors":
                if (computerChoice.equals("Paper")){
                    System.out.println("You have won!");
                }else{
                    System.out.println("Computer wins!");
                }        break;
            default:
                System.out.println("Unrecognized choice");
                break;
        }
       } 
}

// Good job
