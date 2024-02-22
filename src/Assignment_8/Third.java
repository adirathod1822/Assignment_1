package Assignment_8;

interface SquareRoot {
    double calculate(double x);
}

public class Third {
    public static void main(String[] args) {
        SquareRoot sq = new SquareRoot() {
            @Override
            public double calculate(double x) {
                return Math.sqrt(x);
            }
        };

        System.out.println(sq.calculate(9));
    }
}
