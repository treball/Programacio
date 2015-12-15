

import java.util.Arrays;

public class Program {


    public String copyArray(int[] arrayOrigin,int originPosition,int lengthArray) {
        
        return Arrays.toString(Arrays.copyOfRange(arrayOrigin,originPosition,lengthArray));
    }
     
    public static void main(String[] args) {
        int[] ages = {8,18,2,13,47,88,95};
        String sortAges;
        Program p = new Program();
        System.out.println("Ages: "+ p.copyArray(ages,0,3));
        Arrays.sort(ages);
        System.out.println("Sort Ages: "+ Arrays.toString(ages));
    }

}
