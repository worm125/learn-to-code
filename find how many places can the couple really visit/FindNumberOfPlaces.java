import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
public class Main {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    String startTime, endTime;
    int parkTime, hotelTime, beachTime, theatreTime;
    int timeSpend = 0;
    startTime = sc.nextLine();
    endTime = sc.nextLine();
    parkTime = sc.nextInt();
    hotelTime = sc.nextInt();
    beachTime = sc.nextInt();
    theatreTime = sc.nextInt();
    SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
    Calendar c = Calendar.getInstance();
    c.setTime(format.parse(startTime));
    long startMillis = c.getTimeInMillis();
    c.setTime(format.parse(endTime));
    long endMillis = c.getTimeInMillis();
    int totalTime = (int)((endMillis-startMillis)/60000);
    timeSpend+=parkTime;
    if(timeSpend<=totalTime)
      System.out.println("Park");
    timeSpend+=hotelTime;
    if(timeSpend<=totalTime)
      System.out.println("Hotel");
    timeSpend+=beachTime;
    if(timeSpend<=totalTime)
      System.out.println("Beach");
    timeSpend+=theatreTime;
    if(timeSpend<=totalTime)
      System.out.println("Theatre");
  }
}
