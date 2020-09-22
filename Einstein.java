//importing the necessary classes
import java.util.Scanner;
import java.lang.Math;
//import java.util.Random;

/**
* This application calculates the amount of energy that could be released.
* from an object
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-22
*/
 
public class Einstein {
  
  //generate a random number
  public static int SentenceNum()  {
    
    //declare min and max values
    int min = 1;
    int max = 6;
    int range = (max - min + 1);
    
    //choose a number to return
    int phraseNum = (int)Math.random() * range + min;
    
    //return the number generated to the function caller
    return phraseNum;
    
  }
  
  //take random number, return a sentence
  public static String SentenceChooser(int randPhraseNum) {
    
    //declare variables
    int chosenNum;
    String message = "Test";
    
    return message;
  }
  
  public static void main(String[] args) {
    
    //ask the user for mass of object
    System.out.println("What is the mass of the object (in kg) you want to obliterate?");
    
    //get the mass from the user
    Scanner input = new Scanner(System.in);
    double mass = input.nextDouble();
    
    //declare variables and constants
    double energy;
    double kiloTon;
    double lightSpeed = 2.998 * (Math.pow(10, 8));
    double kiloTonConv = 4.184 * (Math.pow(10, 12));
    
    //calculate the amount of energy in J and the amount in Kilotons
    energy = mass * lightSpeed;
    kiloTon = energy / kiloTonConv;
    
    //get a random number for the phrase generator
    int randPhraseNum = SentenceNum();
    System.out.println("phrase number chosen: " + randPhraseNum);
    
    //display to the user the amount of energy possible
    System.out.println("If " + mass + "Kg was converted to energy, it would produce " + energy + "J of energy");
  }
  
}