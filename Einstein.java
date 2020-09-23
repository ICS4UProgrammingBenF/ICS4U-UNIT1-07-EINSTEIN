//importing the necessary classes
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

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
    int phraseNum = (int)Math.random() * (max - min +1 ) + min;
    //int phraseNum = rand.nextInt(max);
    
    //return the number generated to the function caller
    return phraseNum;
    
  }
  
  //take random number, return a sentence
  public static String SentenceChooser(int randPhraseNum) {
    
    //declare variables
    String randPhrase1 = "Message1";
    String randPhrase2 = "Message2";
    String randPhrase3 = "Message3";
    String randPhrase4 = "Message4";
    String randPhrase5 = "Message5";
    String message = "";
    
    if (randPhraseNum == 1) {
      message = randPhrase1;
    }
    else if (randPhraseNum == 2) {
      message = randPhrase2;
    }
    else if (randPhraseNum == 3) {
      message = randPhrase3;
    }
    
    else if (randPhraseNum == 4) {
      message = randPhrase4;
    }
    
    else if (randPhraseNum == 5) {
      message = randPhrase5;
    }
    
    
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
    
    //send the random number to the sentence chooser
    String badIdea = SentenceChooser(randPhraseNum);
    
    //display to the user the amount of energy possible
    System.out.println("If " + mass + "Kg was converted to energy, it would produce " + energy + "J of energy");
    
    //tell the user it's a bad idea
    System.out.println(badIdea);
  }
  
}