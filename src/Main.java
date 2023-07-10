import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

      Boolean a= false;
      Character b='@';
      Integer c=123;
      Double d=3.14;
      String e="Bianca";

      if(a==true){
          System.out.println("its true");
      }

      //Array List= resizable array that works with reference data types

      ArrayList<String> food=new ArrayList<String>();
      food.add("pizza");
      food.add("hamburger");
      food.add("hotdog");

      food.set(0,"sushi");
      food.remove(2);
      food.clear();

      for(int i=0;i<food.size();i++)
      {
          System.out.println(food.get(i));
      }

      ArrayList<ArrayList<String>> shop=new ArrayList();

      ArrayList<String> shoppingList=new ArrayList();
          shoppingList.add("donuts");
          shoppingList.add("milk");
          shoppingList.add("bonbons");

      ArrayList<String> secondList=new ArrayList();
        secondList.add("flour");
        secondList.add("blabla");
        secondList.add("bonbons");

        ArrayList<String> thirdList=new ArrayList();
        thirdList.add("donuts");
        thirdList.add("coke");
        thirdList.add("soda");

        shop.add(shoppingList);
        shop.add(secondList);
        shop.add(thirdList);




      System.out.println(shop);
      System.out.println(shop.get(0).get(0));









    }
}

