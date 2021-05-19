//Trinh To, CS141, Fall 2019, Section A
//Homework Assignment 17, 11/15/19

//This program's behavior is allow the user to type in single lines,
// analyzing each line and print out its count.  The program should 
// stop when the user types the word "STOP" by itself.

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HW17 {//open class
   public static void main(String[] args) 
   {//open main 
	
      
	   
	   Scanner input = new Scanner(System.in);//scanning for user input
	   	   
	   System.out.print("Enter your line:  ");
      String n = input.nextLine(); //input for n  
      
      
      while(!n.equals("STOP")){//before the user say "STOP"
         int[] N = new int[5];//create new array
         N=vowelCount(n);//call method
         
         System.out.println(Arrays.toString(N));//print array as string
         
         System.out.print("Enter your line:  ");
         n = input.nextLine();
         //ask user again and again
         
      }
      
   }//end main
      
    public static int[] vowelCount(String s)
   {//open method
            
      int[] N = new int[5];
      //create new array 
      
      int countA=0;
      int countE=0;
      int countI=0;
      int countO=0;
      int countU=0;
      
      
       
         for (int j=0; j<s.length();j++){
            if (s.charAt(j)=='A' || s.charAt(j)=='a'){
               countA++;
            }
         }
         //for loop to count A
         N[0]=countA;
         //assign to index 0
         
         for (int j=0; j<s.length();j++){
            if (s.charAt(j)=='E' || s.charAt(j)=='e'){
               countE++;
            }
         }
         //for loop to count E
         N[1]=countE;
         //assign to index 1
         
         for (int j=0; j<s.length();j++){
            if (s.charAt(j)=='I' || s.charAt(j)=='i'){
               countI++;
            }
         }
         //for loop to count I
         N[2]=countI;
         //assign to index 2
         
         for (int j=0; j<s.length();j++){
            if (s.charAt(j)=='U' || s.charAt(j)=='u'){
               countU++;
            }
         }
         //for loop to count U
         N[4]=countU;
         //assign to index 4
         
         for (int j=0; j<s.length();j++){
            if (s.charAt(j)=='O' || s.charAt(j)=='o'){
               countO++;
            }
         }
         //for loop to count O
         N[3]=countO;
         //assign to index 3
            
      return N;              
   }//close method

}//close main
