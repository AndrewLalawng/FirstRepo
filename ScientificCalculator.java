import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class ScientificCalculator {

    private static final MathContext MC = MathContext.DECIMAL64;

    /*
     * =========================
     * ARITHMETIC (BigDecimal)
     * =========================
     */

    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b, MC);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b, MC);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b, MC);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {

        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a.divide(b, MC);
    }

    /*
     * =========================
     * SCIENTIFIC (float-based)
     * =========================
     */

    public float sqrt(float x) {
        return (float) Math.sqrt(x);
    }

    public float power(float base, float exp) {
        return (float) Math.pow(base, exp);
    }

    public float sin(float x) {
        return (float) Math.sin(Math.toRadians(x));
    }

    public float cos(float x) {
        return (float) Math.cos(Math.toRadians(x));
    }

    public float tan(float x) {
        return (float) Math.tan(Math.toRadians(x));
    }

    public float log10(float x) {
        return (float) Math.log10(x);
    }

    public float ln(float x) {
        return (float) Math.log(x);
    }

    /*
     * =========================
     * MAIN METHOD
     * =========================
     */

    public static void main(String[] args) {

        ScientificCalculator calc = new ScientificCalculator();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
            System.out.println("1. Add (BigDecimal)");
            System.out.println("2. Subtract (BigDecimal)");
            System.out.println("3. Multiply (BigDecimal)");
            System.out.println("4. Divide (BigDecimal)");
            System.out.println("5. Sqrt (float)");
            System.out.println("6. Power (float)");
            System.out.println("7. Sin (float)");
            System.out.println("8. Cos (float)");
            System.out.println("9. Tan (float)");
            System.out.println("10. Log10 (float)");
            System.out.println("11. Natural Log (float)");
            System.out.println("0. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("A: ");
                    BigDecimal a = sc.nextBigDecimal();
                    System.out.print("B: ");
                    BigDecimal b = sc.nextBigDecimal();

                    System.out.println("Result: " + calc.add(a, b));
                }

                case 2 -> {
                    System.out.print("A: ");
                    BigDecimal a = sc.nextBigDecimal();
                    System.out.print("B: ");
                    BigDecimal b = sc.nextBigDecimal();

                    System.out.println("Result: " + calc.subtract(a, b));
                }

                case 3 -> {
                    System.out.print("A: ");
                    BigDecimal a = sc.nextBigDecimal();
                    System.out.print("B: ");
                    BigDecimal b = sc.nextBigDecimal();

                    System.out.println("Result: " + calc.multiply(a, b));
                }

                case 4 -> {
                    System.out.print("A: ");
                    BigDecimal a = sc.nextBigDecimal();
                    System.out.print("B: ");
                    BigDecimal b = sc.nextBigDecimal();

                    try {
                        System.out.println("Result: " + calc.divide(a, b));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 5 -> {
                    System.out.print("Value: ");
                    float x = sc.nextFloat();
                    System.out.println("Result: " + calc.sqrt(x));
                }

                case 6 -> {
                    System.out.print("Base: ");
                    float b = sc.nextFloat();
                    System.out.print("Exponent: ");
                    float e = sc.nextFloat();
                    System.out.println("Result: " + calc.power(b, e));
                }

                case 7 -> {
                    System.out.print("Angle: ");
                    float x = sc.nextFloat();
                    System.out.println("Result: " + calc.sin(x));
                }

                case 8 -> {
                    System.out.print("Angle: ");
                    float x = sc.nextFloat();
                    System.out.println("Result: " + calc.cos(x));
                }

                case 9 -> {
                    System.out.print("Angle: ");
                    float x = sc.nextFloat();
                    System.out.println("Result: " + calc.tan(x));
                }

                case 10 -> {
                    System.out.print("Value: ");
                    float x = sc.nextFloat();
                    System.out.println("Result: " + calc.log10(x));
                }

                case 11 -> {
                    System.out.print("Value: ");
                    float x = sc.nextFloat();
                    System.out.println("Result: " + calc.ln(x));
                }

                case 0 -> {
                    System.out.println("Exiting calculator...");
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}