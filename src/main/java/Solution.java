import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // first input --------1
        int n = input.nextInt();
        ArrayList<Integer> mylist = new ArrayList<Integer>(n);

        for(int i = 0; i<n; i++){
            // add second input -----------2
            mylist.add(input.nextInt());
        }
        //  number of quary --------3
        int q = input.nextInt();

        for(int i = 0; i<q; i++){
            if(input.next().equals("Insert")){
                int index = input.nextInt();
                int element = input.nextInt();
                mylist.add(index, element);
            }
            else {
                int removeIndex = input.nextInt();
                mylist.remove(removeIndex);
            }
        }
        for(Integer myint: mylist){
            System.out.print(myint+" ");
        }

    }

}