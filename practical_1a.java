import java.util.Scanner;
 
public class practical_1a {
  public static void main(String[] args) 
  {
 
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter your weight: ");
    double weightOnWeight = input.nextDouble();
 
    double weightOnMoon = weightOnWeight * (16.5 / 100);
    System.out.println("Your weight on moon is: "  + weightOnMoon +" KG");
  }
}
 
