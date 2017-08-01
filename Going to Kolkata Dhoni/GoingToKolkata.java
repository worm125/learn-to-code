import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int totalTime, startTime, bikeTime, taxiTime, bikeCost, taxiCost;
    Scanner sc = new Scanner(System.in);
    totalTime = sc.nextInt();
    startTime = sc.nextInt();
    taxiTime = sc.nextInt();
    bikeTime = sc.nextInt();
    taxiCost = sc.nextInt();
    bikeCost = sc.nextInt();
    int remainingTime = totalTime - startTime;
    if(bikeTime<=remainingTime || taxiTime<=remainingTime) {
      System.out.println("Yes");
      if(bikeTime<taxiTime)
        System.out.println("Bike");
      else if(bikeTime>taxiTime)
        System.out.println("Taxi");
      else {
        if(taxiCost>bikeCost)
          System.out.println("Bike");
        else
          System.out.println("Taxi");
      }
    }
    else
     System.out.println("No");
  }
}
