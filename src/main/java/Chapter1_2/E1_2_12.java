package Chapter1_2;

import java.security.InvalidParameterException;
import java.time.LocalDate;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_12 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("enter year, month, day");
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int day = Integer.parseInt(args[2]);
        E1_2_12.SmartDate date = new E1_2_12.SmartDate(year, month, day);
        System.out.println(date.dayOfTheWeek());
    }

    public static class SmartDate {
        private int year;
        private int month;
        private int day;

        private static final int[] normalDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private static final int[] leapDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        private static final String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        private static final int twentyCenturyFirstDayOfWeek = 5;
        private static final int twentyCenturyYear = 2000;

        public SmartDate(int year, int month, int day) {
            if (year < 0) {
                throw new InvalidParameterException("year:" + year);
            }

            if (month < 1 || month > 12) {
                throw new InvalidParameterException("month:" + month);
            }

            int dayOfMonth = isLeapYear(year) ? leapDays[month] : normalDays[month];
            if (day < 1 || day > dayOfMonth) {
                throw new InvalidParameterException("day:" + day);
            }

            this.year = year;
            this.month = month;
            this.day = day;
        }

        private boolean isLeapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0) return true;
            if (year % 400 == 0) return true;
            return false;
        }

        public int month() {
            return month;
        }

        public int day() {
            return day;
        }

        public int year() {
            return year;
        }

        public String dayOfTheWeek() {
            int days = 0;
            for (int i = twentyCenturyYear; i < year; i++) {
                if (isLeapYear(i)) {
                    days += 366;
                } else {
                    days += 365;
                }
            }

            for (int i = 1; i < month; i++) {
                if (isLeapYear(year)) {
                    days += leapDays[i];
                } else {
                    days += normalDays[i];
                }
            }

            days += (day - 1);

            return dayOfWeek[(twentyCenturyFirstDayOfWeek + days) % 7];
        }
    }
}
