import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double height = scanner.nextDouble();
     double height2=scanner.nextDouble();
     double weight = scanner.nextDouble();
     double weight2=scanner.nextDouble();
    double bmi = weight / (height * height);
    double bmi2=weight2 / (height2*height2);

      System.out.println(Math.round(bmi));
      System.out.println(Math.round(bmi2));
     }
   }
