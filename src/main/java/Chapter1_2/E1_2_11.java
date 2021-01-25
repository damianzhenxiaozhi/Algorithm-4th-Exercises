package Chapter1_2;

import java.security.InvalidParameterException;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_11 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("enter year, month, day");
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int day = Integer.parseInt(args[2]);
        SmartDate date = new SmartDate(year, month, day);
        System.out.println(date);
    }

    public static class SmartDate {
        private int year;
        private int month;
        private int day;

        private static final int[] normalDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private static final int[] leapDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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

        @Override
        public String toString() {
            return String.format("%d/%d/%d", day, month, year);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null) return false;
            if (getClass() != o.getClass()) return false;

            SmartDate that = (SmartDate) o;
            if (year != that.year) return false;
            if (month != that.month) return false;
            if (day != that.day) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int[] arr = new int[] {year, month, day, 17};
            return hashCode(arr, 0, arr.length - 1);
        }

        private int hashCode(int[] a, int low, int high) {
            if (low == high) {
                return a[low];
            }

            return (a[low] + 31 * hashCode(a, low + 1, high)) % Integer.MAX_VALUE;
        }
    }
}
