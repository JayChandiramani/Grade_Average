package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	String FName,LName,Subject,Level;
	int G1,G2,G3,G4,G5,average;
	Scanner Average=new Scanner(System.in);

	//Inputting Student info
        System.out.println("\\Student Information");
        System.out.println("PLease enter the student's first and last name.");
        System.out.print("First Name: ");
        FName= Average.nextLine();
        System.out.print("Last Name: ");
        LName= Average.nextLine();
        System.out.println();

    //Inputting the subject info
        System.out.println("\\Subject Information");
        System.out.println("Please enter the name of the subject and the level that the student has chosen.");
        System.out.print("Subject Name: ");
        Subject= Average.nextLine();
        System.out.print("Level: ");
        Level= Average.nextLine();
        System.out.println();
        System.out.println("Please enter the student's grade as a percentage.");
        System.out.print("Grade 1: ");
        G1= Average.nextInt();
        System.out.print("Grade 2: ");
        G2= Average.nextInt();
        System.out.print("Grade 3: ");
        G3= Average.nextInt();
        System.out.print("Grade 4: ");
        G4= Average.nextInt();
        System.out.print("Grade 5: ");
        G5= Average.nextInt();
        System.out.println();

    //Calculating the average
        average=(G1+G2+G3+G4+G5)/5;

    //Final Summary
        System.out.println(FName+" "+LName+" has an average of "+average+ "% in "+Subject+" "+Level+".");
    }
}
