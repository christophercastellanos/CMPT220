//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int score=0;
        System.out.println("What's my favorite color? Purple, Red, or Blue?");
        String color=sc.nextLine();

        if (color.equals("Purple")||color.equals("purple")){
            System.out.println("You're right, 2 more to go!");
            score++;

        }else{
            System.out.println("Hmm that's not right. NO POINTS!");
        }

        System.out.println("Who's the best superhero? Batman, Superman, or Spider-man?");
        String superhero=sc.nextLine();

        if (color.equals("Purple")&&superhero.equals("Batman")|| superhero.equals("batman")){
            System.out.println("And why is it Batman! 1 more!!!");
            score++;
        }else{
            System.out.println("I love them too but that's not right. . . IDC if it's biased!");
            
        }
        System.out.println("In Pokemon, what is the only pokemon that has no weaknesses? Is it Eelektross, Shedinja, or Malamar? ");
        String pokemon=sc.nextLine();
        if(pokemon.equals("Eelektross")||pokemon.equals("eelektross")){
            System.out.println("You're a Pokemon Master! The whole evolution line has no weakness because they have the ability levitate, making them immune from Ground type moves.");
            score++;

        }else{
            System.out.println("Incorrect. The entire Eelektross evolution line has no weakness because they have the ability levitate, making them immune from Ground type moves. Ash would be disappointed. ");
        }
        System.out.println("Your total score was "+score+". Thank you for playing have a great day!");
        }
    }
// used chat gpt to figure out how to keep track of score.


