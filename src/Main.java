import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //pseudo-random tho
        Random random= new Random();
        int x=random.nextInt(6)+1;//random number between 1 and 6, if we were not adding +1, it would've been between 0 and 5
        double y=random.nextDouble();
        boolean z=random.nextBoolean();
        System.out.println(z);

        //if statements
        int age=18;
        if(age>=18){
            System.out.println("Person is an adult");
        }
        else {
            System.out.println("Person is still a minor");
        }


        //switch statements

        String day="Friday";

        switch(day)
        {
            case "Sunday":
                System.out.println("It is sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Friday":
                System.out.println("It is friday");
                break;
            default:
                System.out.println("There s no such day");
        }




    }
}

