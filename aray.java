/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
import java.util.Scanner;



public class aray {


    
    public static void main(String[] args) {
        double[]myList=new double[3];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < myList.length; i++)
            myList[i]=scan.nextDouble();
        
     

// Print all the array elements
for (int i = 0; i < myList.length; i++) 
{ System.out.println(myList[i] + " ");

}
// Summing all elements 
double total = 1;
for (int i = 0; i < myList.length; i++) {
total *= myList[i];
}
System.out.println("Total is " + total);
// Finding the largest element 
double small = myList[2];
for (int i = 0; i<myList.length; i++) { 
if (myList[i] < small) small=myList[i];
}
System.out.println(small);
}
    }
    

