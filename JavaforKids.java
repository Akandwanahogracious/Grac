/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gracious2;

/**
 *
 * @author Admin
 */
import java.util.Scanner; 
public class JavaforKids {
    public static void main(String[] args)   
{  
int a, b, c, smallest, number;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
//reading input from the user  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();   
number=a<b?a:b;  
smallest=c<number?c:number;  
// smallest number  
System.out.println("The smallest number is: "+smallest);  
}  
    
}
