import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

      String name= JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog(null,"Hello "+name);
      //input dialog has by default a string input, so we need to convert
      int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
      JOptionPane.showMessageDialog(null, "You are "+age+" y.o");

      double credit=Double.parseDouble(JOptionPane.showInputDialog("Enter your credit score"));
        JOptionPane.showMessageDialog(null,"We got your credit score "+credit);

    }
}

