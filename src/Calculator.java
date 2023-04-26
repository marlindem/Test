import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m1 = new Main();
        System.out.println("Введите уравнение в формате: a + b (через пробел), (от 1 до 10). Нажмите Enter.");
        m1.calc(scanner.next(), scanner.next(), scanner.next());

    }
}
