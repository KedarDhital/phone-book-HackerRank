//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class HackerRankJavamap{
    public static void main(String []argh)
    {
        Map<String,String> myMap = new HashMap<String, String>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt(); // reads first input, number of entries
        in.nextLine(); // goes to the next line
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine(); //reads second line, assigned to var String
            String phone=in.nextLine(); // reads third line , assigned to var String
            myMap.put(name, phone); // putting the values to myMap
            // for loop will keep doing the above statements, until i reaches value of n
        }
        while(in.hasNext())
        // loops when there is entry on the next line
        {
            String s=in.nextLine(); // if there is something it will save that to var s
            if(myMap.containsKey(s)){ // if map contains key, which is name, it will print the key and corresponding value, myMap.get(s)) gets the value not the key
                System.out.println(s + "=" +myMap.get(s));

            } else { // else it will print not found if there is no key
                System.out.println("Not found");
            }
        }
    }
}



