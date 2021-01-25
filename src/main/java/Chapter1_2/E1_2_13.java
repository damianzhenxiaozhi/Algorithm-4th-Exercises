package Chapter1_2;

import edu.princeton.cs.algs4.Date;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_13 {
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
    }
}
