/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
import java.util.Random;

public class Students{
  

    String name;
    String year;
    double gpa;
    int id;
    public Students(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    void grades(){
        if(gpa>3.6){
            System.out.println(name+" is in Honor Roll.");
        }else{
            System.out.println(name+" is not in Honor Roll.");

        }
    }

    
    void lunch(){
        Random random= new Random();

        int randthree=random.nextInt(1000);

        String formatnum= "1" + String.format("%03d", randthree);

        int RandomId=Integer.parseInt(formatnum);

        if(id==RandomId){
            System.out.println(name+ " gets free lunch today");

        }else{
            System.out.println(name+" does not get free lunch");
        }

    }

}