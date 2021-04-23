package java核心技术;

import org.junit.Test;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Date和LocalDate {

    /**
     * Date类，表示时间点
     */
    @Test
    public void test() {
        Date date = new Date();
        System.out.println(date);
    }

    /**
     * LocalDate，是一个日历类
     */
    @Test
    public void testLocalDate() {
        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
//        System.out.println("month = " + month);
//        System.out.println("today = " + today);
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
    }
}
