/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please provide the program with a string: ");
        String user_string=sc.nextLine();
        char ch;
        for(int i=0;i<user_string.length();i++){
            ch=user_string.charAt(i);
            System.out.println(ch);
            // I figured out the charAt from class on friday. I chose a for loop to replicate the example we did on friday as well, but it seemed to make the most sense
            // considering we can make i, and set the conditional in the for statement as well. And the char stores the string and charat allows us to retrieve those stored and prinr it out 
        }
      


    }
}
