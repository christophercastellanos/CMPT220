
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


            //P1: This one only prints 0-9, can you fix it so it prints 1-10?
            // System.out.println("Problem 1");
            // for (int i = 0; i <= 10; i++){
            //     System.out.println(i);
            // }

            //P2: Ask the user for a number. Create a loop to find the factorial of it
            //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
            // Scanner sc = new Scanner(System.in);
        
            // System.out.println("Problem 2");
            // System.out.println("Enter a number and I will tell you the fatorial: ");
            // int user_num= sc.nextInt();
            // int factorial=1;
            // //here's a hint
            // for (int i = 1; i <= user_num; i++){
            //     factorial=factorial*i;
            //     System.out.println(factorial);

            // }

            // Scanner sc = new Scanner(System.in);
            // //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
            // System.out.println("Problem 3");
            // System.out.println("Enter a number and I will tell you the sum of every other number: ");
            // int user_num2= sc.nextInt();
            // int sum=0;
            // //No hint! what do you need to complete this task?
            // for (int i=1;i<=user_num2;i++){
            //     sum=sum+i;
            //     System.out.println(sum);

            // }


            //P4: Why does this loop never stop!
            //what can you do to break out of the loop after it prints once?
            // System.out.println("Problem 4");
            // boolean run = true;
            // while (run == true){
            //     System.out.println("I printed once!");
            //     break;
            // }

            // //P5: Take a string from the user and print them the reverse!
            System.out.println("Problem 5");
            //hint
            String reverse = "";
            char ch;
            Scanner sc= new Scanner(System.in);
            System.out.println("Please provide the program with a string: ");
            String user_string=sc.nextLine();
            for (int i=0;i<user_string.length();i++){
                ch=user_string.charAt(i);
                reverse=ch +reverse;

        }
        System.out.println(reverse);
    }
}