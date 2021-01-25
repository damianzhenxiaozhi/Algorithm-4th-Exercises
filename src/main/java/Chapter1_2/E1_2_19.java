package Chapter1_2;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_19 {
    public static void main(String[] args) {
        Transaction t = new Transaction("Turing 5/22/1939 11.99");
        System.out.println(t);

        Date d = new Date("5/22/1939");
        System.out.println(d);
    }

    public static class Transaction {
        private String who;
        private Date when;
        private double amount;

        public Transaction(String t) {
            String[] fields = t.split("\\s+");
            who = fields[0];
            when = new Date(fields[1]);
            amount = Double.parseDouble(fields[2]);
        }

        @Override
        public String toString() {
            return who + " " + when + " " + amount;
        }
    }


    public static class Date {
        private int year;
        private int month;
        private int day;

        public Date(String date) {
            String[] fields = date.split("/");
            month = Integer.parseInt(fields[0]);
            day = Integer.parseInt(fields[1]);
            year = Integer.parseInt(fields[2]);
        }

        @Override
        public String toString() {
            return year + "-" + month + "-" + day;
        }
    }
}
