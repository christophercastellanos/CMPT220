/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your first number to be added");
        int firstInput = sc.nextInt();
        System.out.println("Enter your second number to be added");
        int secondInput = sc.nextInt();
        sc.nextLine();

        //remember this method is returning, so we need to print it out
        System.out.println("The sum of "+firstInput+" and "+secondInput+" is " + add(firstInput,secondInput));

        SumOfFI(firstInput);
        SumOfSI(secondInput);
        Factorial(firstInput);
        Factorial2(secondInput);

        System.out.println("Please provide the program with a string: ");
        String user_string=sc.nextLine();
        reverseWord(user_string);
        

        
    
        
      
    }

   
    public static int add(int zyx, int tuv){


        return(zyx + tuv);
    }

  
    public static void Factorial(int firstInput){
        int factorial=1;
            for (int i = 1; i <= firstInput; i++){
                factorial=factorial*i;
                
    }
    System.out.println("The factorial of "+ firstInput+ " is "+factorial);


  
    }
    public static void Factorial2(int secondInput){
        int factorial=1;
            for (int i = 1; i <= secondInput; i++){
                factorial=factorial*i;
                
            }  
            System.out.println("The factorial of "+ secondInput+ " is "+factorial);


    }  
    public static void SumOfFI(int firstInput){
        int sum=0;
        for (int i=1;i<=firstInput;i++){
                sum=sum+i;

    }
    System.out.println("The sum of all the numbers in "+firstInput+ " is " +sum);
    
    }


    public static void SumOfSI(int secondInput){
        int sum=0;
        for (int i=1;i<=secondInput;i++){
                sum=sum+i;

    }
    System.out.println("The sum of all the numbers in "+secondInput+ " is " +sum);
    
    }

    
    public static void reverseWord(String user_string){
            String reverse = "";
            char ch;
            for (int i=0;i<user_string.length();i++){
                ch=user_string.charAt(i);
                reverse=ch +reverse;



    }
    System.out.println("The string reversed is "+reverse);
   
    }
}