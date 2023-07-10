import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    String name="";
    String surname="";

    while(name.isBlank())
    {
        System.out.println("Enter name ");
        name=scanner.nextLine();
    }


    do{
        System.out.println("Enter your surname ");
        surname=scanner.nextLine();
    }while (surname.isBlank());

        System.out.println("Hello "+name+" "+surname);

    //for loop
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }

    //nested
        Scanner scan=new Scanner(System.in);
        int rows, columns;
        String symbol=" ";

        System.out.println("Enter # of rows ");
        rows=scan.nextInt();
        System.out.println("Enter 3 of columns ");
        columns=scan.nextInt();
        System.out.println("Enter symbol to use");
        symbol=scan.next();

        for(int i=1;i<=rows; i++)
        {   System.out.println();
            for(int j=1;j<=columns;j++)
            {
                System.out.print(symbol);
            }
        }

    }
}

