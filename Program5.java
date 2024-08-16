import java.util.Scanner;
public class Program5{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter name of car:");
    String aN = s.nextLine();
    System.out.println("Enter miles for car:");
    int aM = s.nextInt();
    System.out.println("Enter gallons for car:");
    int aG = s.nextInt();
    
    System.out.println("Enter name of car:");
    String bN = s.next();
    System.out.println("Enter miles for car:");
    int bM = s.nextInt();
    System.out.println("Enter gallons for car:");
    int bG = s.nextInt();
    
    System.out.println("Enter name of car:");
    String cN = s.next();
    System.out.println("Enter miles for car:");
    int cM = s.nextInt();
    System.out.println("Enter gallons for car:");
    int cG = s.nextInt();
    
    System.out.println("Enter name of car:");
    String dN = s.next();
    System.out.println("Enter miles for car:");
    int dM = s.nextInt();
    System.out.println("Enter gallons for car:");
    int dG = s.nextInt();
    
    System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
    double a = aM / aG;
    System.out.println(aN + " averaged " + a + " m//g");
    double b = bM / bG;
    System.out.println(bN + " averaged " + b + " m//g");
    double c cM / cG;
    System.out.println(cN + " averaged"  + a + " m//g");
    System.out.println(dN + " averaged " + a + " m//g");
  }
}
//Paste console output below:
/*

*/
