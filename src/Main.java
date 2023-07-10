import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //arrays
        String [] cars={"Camaro","Corvette","Tesla"};
        cars[0]="Mustang";
        System.out.println(cars[0]);

        String[] cars2=new String[3];

        for (int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }

        // 2D arrays
        String[][] cars3=new String[3][3];
        cars3[0][0]="Camaro";

        for(int i=0;i<cars3.length;i++){
            System.out.println();
            for(int j=0;j<cars3[i].length;j++)
            {
                System.out.println(cars3[i][j]+" ");
            }
        }


        //String methods
        String name="Yo";
        boolean r1=name.equals("Yo");//compares 2 strings and returns true or false
        int r2=name.length();//length of the string
        char r3=name.charAt(0);//the character at a certain position in the string
        int r4=name.indexOf("o");//returns the index of  a certain letter
        boolean r5=name.isEmpty();//if the string is null
        String r6=name.toUpperCase();
        String r7=name.toLowerCase();
        String r8=name.trim();//kills all the empty spaces in my string
        String result=name.replace('o','a');






    }
}

