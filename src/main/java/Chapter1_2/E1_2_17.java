package Chapter1_2;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_17 {
    public static void main(String[] args) {
        E1_2_17.Rational a = new E1_2_17.Rational(2, 4);
        E1_2_17.Rational b = new E1_2_17.Rational(1, 2);

        System.out.println(a.equals(b));
        System.out.println(a.plus(b));
        System.out.println(a.minus(b));
        System.out.println(a.times(b));
        System.out.println(a.divides(b));
    }

    public static class Rational {
        private long numerator;
        private long denominator;

        public Rational(long numerator, long denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("denominator is 0");
            }

            long gcd = gcd(numerator, denominator);

            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        }

        public Rational plus(Rational b) {
            long newDenominator = denominator * b.denominator;
            assert newDenominator > denominator : "not overflow";
            assert newDenominator > b.denominator : "not overflow";
            long newNumerator = numerator * b.denominator + b.numerator * denominator;
            long gcd = gcd(newNumerator, newDenominator);
            return new Rational(newNumerator / gcd, newDenominator / gcd);
        }

        private long gcd(long a, long b) {
            if (b == 0) return a;

            return gcd(b, a % b);
        }

        public Rational minus(Rational b) {
            return plus(new Rational(-b.numerator, b.denominator));
        }

        public Rational times(Rational b) {
            long newDenominator = denominator * b.denominator;
            long newNumerator = numerator * b.numerator;
            long gcd = gcd(newNumerator, newDenominator);
            return new Rational(newNumerator / gcd, newDenominator / gcd);
        }

        public Rational divides(Rational b) {
            return times(new Rational(b.denominator, b.numerator));
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null) return false;
            if (getClass() != o.getClass()) return false;

            Rational that = (Rational) o;
            if (numerator != that.numerator) return false;
            if (denominator != that.denominator) return false;

            return true;
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }
}
