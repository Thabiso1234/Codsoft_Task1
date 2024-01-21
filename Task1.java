package task.pkg1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Thabiso <your.name at your.org>
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random random = new Random();
        
        int generatedNum = random.nextInt(99 - 1) + 1;
        int counter = 0;
        int guessedNum = 0;
        int score = 100;
                 try{
                Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 0 - 99"));
                 }
                 catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
        
        if(guessedNum <= 99 && guessedNum >= 0)
        {
        
        if(guessedNum != generatedNum)
        {
          while(guessedNum != generatedNum && counter < 10)
          {
              counter++;
              try
              {
             if(guessedNum < generatedNum)
             {     
             guessedNum = Integer.parseInt(JOptionPane.showInputDialog("Number is too low ! Try Again..." + "\n" + "Guess again"));
             }
             else if(guessedNum > generatedNum)
             {     
             guessedNum = Integer.parseInt(JOptionPane.showInputDialog("Number is too high ! Try Again..." + "\n" + "Guess again"));
             }
              }
              catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
           
          }
          score -= counter * 10;
          JOptionPane.showMessageDialog(null, "Correct! You are a genius !" + "\n" + "Your score is " + score);
        }
        else if(generatedNum == guessedNum)
        {
           JOptionPane.showMessageDialog(null, "Correct! You are a genius !" + "\n" + "Your score is " + score);
        }
        else 
        {
            
           int response = 0;
           try
           {
             response = Integer.parseInt(JOptionPane.showInputDialog("Do you wish to continue" + "\n" + "1. Yes " + "\n" + "2. No"));
           }
           catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
           if(response == 1)
           {
               
             while(guessedNum != generatedNum && counter < 10)
          {
              counter++;
              try
              {
             guessedNum = Integer.parseInt(JOptionPane.showInputDialog("Incorrect! Try Again " + "\n" + "Guess a number between 0 - 99"));
              }
              catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
              if(guessedNum <= 99 && guessedNum >= 0)
               {
                   try
                   {
                 response = Integer.parseInt(JOptionPane.showInputDialog("Do you wish to continue" + "\n" + "1. Yes " + "\n" + "2. No")); 
                   }
                   catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
                   
               }
        }
          }
          JOptionPane.showMessageDialog(null, "Correct! You are a genius !" + "\n" + "Your score is " + score); 
        }
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Number out of range !");
           
           int response = 0;
           try
           {
             response = Integer.parseInt(JOptionPane.showInputDialog("Do you wish to continue" + "\n" + "1. Yes " + "\n" + "2. No"));
           }
           catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
           if(response == 1)
           {
               
             while(guessedNum != generatedNum && counter < 10)
          {
              counter++;
              try
              {
             guessedNum = Integer.parseInt(JOptionPane.showInputDialog("Incorrect! Try Again " + "\n" + "Guess a number between 0 - 99"));
              }
              catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
              if(guessedNum <= 99 && guessedNum >= 0)
               {
                   try
                   {
                 response = Integer.parseInt(JOptionPane.showInputDialog("Do you wish to continue" + "\n" + "1. Yes " + "\n" + "2. No")); 
                   }
                   catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(null, "Enter a valid number");
           }
           catch(NullPointerException e)
           {
              JOptionPane.showMessageDialog(null, "Invalid Input");
           }
                   
               }
        }
          }
          JOptionPane.showMessageDialog(null, "Correct! You are a genius !" + "\n" + "Your score is " + score); 
           }
        }
    }
    

