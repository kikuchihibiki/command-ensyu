import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double height = scanner.nextDouble();
     double weight = scanner.nextDouble();
    double bmi = weight*2 / (height * height)*2;

      System.out.println(Math.round(bmi));
     }
   }
