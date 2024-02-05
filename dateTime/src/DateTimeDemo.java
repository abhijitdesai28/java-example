import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {

        //current date
        LocalDate today = LocalDate.now();
        System.out.println("today's date :"+today);//today's date :2024-02-02

        //add 1 month to current date
        LocalDate oneMonthLaterDate =today.plus(1, ChronoUnit.MONTHS);
        System.out.println("after 1 month, date will be :"+oneMonthLaterDate);

        //add 28 days in current date
        LocalDate afterAdding28Days = today.plus(28,ChronoUnit.DAYS);
        System.out.println("after adding 28 days in current date :"+afterAdding28Days);

        //28 days ago date from current date
        LocalDate from28DaysBack = today.minusDays(28);
        System.out.println(from28DaysBack);

        //today's current time
        LocalTime todyasTime=LocalTime.now();
        System.out.println("current time :"+todyasTime);

        //today's current time and date
        LocalDateTime todaysTimeAndDate= LocalDateTime.now();
        System.out.println("current date and time :"+todaysTimeAndDate);

        //adding 20 days in current date
        LocalDateTime added20Days = todaysTimeAndDate.plusDays(20);
        System.out.println("after adding 20 days in current date :"+added20Days);

        //5 DAYS AGO DATE WILL BE
        LocalDateTime fiveDaysAgoDateTime =todaysTimeAndDate.minusDays(5);
        System.out.println("5 days ago date will be :"+fiveDaysAgoDateTime);
    }
}