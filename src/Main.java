import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

   double x=3.14;
   double y= 10;

   double maxi=Math.max(x,y);
        System.out.println("Max value is "+maxi);

   double mini=Math.min(x,y);
        System.out.println("Min value is "+mini);

   double absoluteVal=Math.abs(y);//module of a number
        System.out.println("Absolute value "+absoluteVal);

   double squareRoot=Math.sqrt(y);
        System.out.println("Square root value is "+squareRoot);

   double round=Math.round(x);
        System.out.println("Rounded value is "+round);

   double a;
   double b;
   double c;
   Scanner scanner=new Scanner(System.in);

        System.out.println("Enter side x: ");
        a=scanner.nextDouble();

        System.out.println("Enter side y: ");
        b=scanner.nextDouble();
        c=Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse is "+c);

        scanner.close();


    }
}

