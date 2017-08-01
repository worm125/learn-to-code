import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int bat, pad, battingGloves, keepingGloves, priceOfSix, numberOfSixes;
      bat = sc.nextInt();
      pad = sc.nextInt();
      battingGloves = sc.nextInt();
      keepingGloves = sc.nextInt();
      priceOfSix = sc.nextInt();
      numberOfSixes = sc.nextInt();
      int totalPayment = priceOfSix * numberOfSixes;
      boolean condition1 = totalPayment>=bat;
      boolean condition2 = totalPayment>=pad;
      boolean condition3 = totalPayment>=battingGloves;
      boolean condition4 = totalPayment>=keepingGloves;
      if(condition1 || condition2 || condition3 || condition4) {
        if(condition1)
          System.out.println("Bat");
        if(condition2)
          System.out.println("Pad");
        if(condition3)
          System.out.println("Batting Glove");
        if(condition4)
          System.out.println("Keeping Glove");
      }
      else
        System.out.println("Insufficient");
  }
}
