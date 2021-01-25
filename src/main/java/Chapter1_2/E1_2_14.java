package Chapter1_2;

import edu.princeton.cs.algs4.Date;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_14 {
    public static void main(String[] args) {
        Transaction a = new Transaction("xiaoming", new Date("1/1/2000"), 13.0);
        Transaction b = new Transaction("xiaoming", new Date("1/1/2000"), 13.0);
        System.out.println(a.equals(b));
    }

    public static class Transaction {
        private String who;
        private Date when;
        private double amount;

        public Transaction(String who, Date when, double amount) {
            this.who = who;
            this.when = when;
            this.amount = amount;
        }

        public String who() {
            return who;
        }

        public Date when() {
            return when;
        }

        public double amount() {
            return amount;
        }

        @Override
        public String toString() {
            return when + " " + who + "amount:" + amount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null) return false;
            if (getClass() != o.getClass()) return false;
            Transaction that = (Transaction) o;

            if (!when.equals(that.when)) return false;
            if (!who.equals(that.who)) return false;
            if (amount != that.amount) return false;

            return true;
        }
    }
}
