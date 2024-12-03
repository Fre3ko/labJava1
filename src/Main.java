import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество строк
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Считываем оставшийся символ новой строки

        String shortestString = null; // Переменная для хранения самой короткой строки

        // Считываем n строк
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            String inputString = scanner.nextLine();

            // Проверяем, является ли текущая строка самой короткой
            if (shortestString == null || inputString.length() < shortestString.length()) {
                shortestString = inputString;
            }
        }

        // Выводим результат
        if (shortestString != null) {
            System.out.println("Самая короткая строка: \"" + shortestString + "\"");
            System.out.println("Длина самой короткой строки: " + shortestString.length());
        } else {
            System.out.println("Не было введено ни одной строки.");
        }

        scanner.close(); // Закрываем сканер
    }
}