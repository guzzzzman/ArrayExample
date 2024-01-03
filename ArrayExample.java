// Jose Guzman
// November 19, 2023
// File name: ArrayExample.java
// To Compile in terminal type: javac ArrayExample.java
// To Run in terminal type: ArrayExample 

import java.util.Scanner;   

class ArrayExample
{
  public static void main(String[] args)
  {
    int numgrades;
    int grades [];
    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many grades do you want to enter?");
    numgrades = keyboard.nextInt();
    grades = new int[numgrades];

    System.out.println("Created a  " + numgrades + " integer array.");
    System.out.println("The values in the array are initialized to:");
    for (int i = 0; i < numgrades; i++)
      System.out.println("grades["+i+"]=" + grades[i]);

  int myArray[] = new int[4];

// enter values into an array
for (int i = 0; i < myArray.length; i++)
{
   System.out.print("Enter array value " + (i+1) +":");
   myArray[i] = keyboard.nextInt();
}

// show the array values forward
System.out.println("Array forward:");
for (int i = 0; i < myArray.length; i++)
   System.out.println("myArray[" + i + "]=" + myArray[i] );

// show the array values backward
System.out.println("Array backward:");
for (int i = myArray.length-1; i >= 0; i--)
   System.out.println("myArray[" + i + "]=" + myArray[i] ); 
  }
}



/*
The values in the array are initialized to:
grades[0]=0
grades[1]=0
grades[2]=0
grades[3]=0
grades[4]=0
grades[5]=0
grades[6]=0
grades[7]=0
grades[8]=0
grades[9]=0
Enter array value 1:1
Enter array value 2:5
Enter array value 3:3
Enter array value 4:7
Array forward:
myArray[0]=1
myArray[1]=5
myArray[2]=3
myArray[3]=7
Array backward:
myArray[3]=7
myArray[2]=3
myArray[1]=5
myArray[0]=1
/*