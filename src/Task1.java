import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите радиусы окружностей (от меньшей к большей)");
        double r1 = setRadius();
        double r2 = setRadius();
        double r3 = setRadius();
        double s = calculateS(r1, r2, r3);
        printS(s);
    }
    private static double setRadius() {
        Scanner Scanner = new Scanner(System.in);
        double r = Scanner.nextDouble()
        return r;
    }
    private static double calculateS1(double r1) {
        return 0.25 * Math.PI * r1 * r1;
    }
    private static double calculateS2(double r1, double r2) {
        return 0.375 * (Math.PI * r2 * r2 - Math.PI * r1 * r1);
    }
    private static double calculateS3(double r2, double r3) {
        return 0.5 * (Math.PI * r3 * r3 - Math.PI * r2 * r2);
    }
    private static double calculateS4(double r3) {
        return 0.625 * (4 * r3 * r3 - Math.PI * r3 * r3);
    }
    private static double calculateS(double r1, double r2, double r3) {
        return calculateS1(r1) + calculateS2(r1, r2) + calculateS3(r2, r3) + calculateS4(r3);
    }
    private static void printS(double s){
        Locale.setDefault(Locale.ROOT);
        System.out.printf("Площадь заштрихованной фигуры равна = %1$.3f", s);
    }
}
