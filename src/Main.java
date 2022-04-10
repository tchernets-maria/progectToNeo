import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Конвертация чисел!\n---------------------------");
            System.out.println("1. Перевод из 10-ричной системы счисления в 16-ричную");
            System.out.println("2. Перевод из 10-ричной системы счисления в 2-ую");
            System.out.println("3. Перевод из 2-ой системы счисления в 10-ричную");
            System.out.println("0. Завершение программы");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Введите число: ");
                    System.out.println("Результат:\n" + new Number(scanner.next(), 10).get(16)
                            + "\n---------------------------");
                    break;
                case 2:
                    System.out.println("Введите число: ");
                    System.out.println("Результат:\n" + new Number(scanner.next(), 10).get(2)
                            + "\n---------------------------");
                    break;
                case 3:
                    System.out.println("Введите число: ");
                    System.out.println("Результат:\n" + new Number(scanner.next(), 2).get(10)
                            + "\n---------------------------");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Нет такой команды!");
            }
        }
    }
}