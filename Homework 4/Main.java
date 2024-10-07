import java.util.HashMap;
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Main {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};

        HashMap<Integer, Integer> countMap =new HashMap<>();

        for (int i:myArray){
            countMap.put(i,countMap.getOrDefault(i,0)+1);
        }
        for (int j=0;j<myArray.length;j++){
            if (countMap.containsKey(myArray[j]) && countMap.get(myArray[j])>1){
                System.out.println(myArray[j]+" appears "+ countMap.get(myArray[j]) + " times. ");
            }
        }
    
    
        //you cannot use the array util. Do this one by hand :(
    }
}
// Idk if this is what you were looking for, but it's the only solution I found while looking for help with this assignment 