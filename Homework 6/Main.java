//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String line="";
        List <String> list=new ArrayList<String>();
        List <Double> grades=new ArrayList<Double>();
        //do you need something to start?
        File inputfile = new File("/Users/chris/Documents/practice.txt");
        int count=-9;
        try(Scanner input= new Scanner(inputfile)){
    
            while(input.hasNext()){
                line=input.nextLine();
                list.add(line);
                count++;

                try{
                    double gpa= Double.parseDouble(line);

                    if(gpa>3.5){
                        grades.add(gpa);
                    }
                }catch(NumberFormatException e){

                }
            }
            
                
                //what do we do at every line of the file?

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
      //optional if you want to keep this, just to show what the indices are of the list you created
        System.out.println(grades);
        System.out.println("There are "+count+ " names.");
    }
}
// I could not figure out how to print the names with gpas larger than 3.5
// and i figured the count would have to do with that so  just started the count at -9 so it would subtract the amount of lines in the file.
// 
