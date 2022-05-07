import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Csv csv = new Csv();
        Data fileData = new Data();
        Scanner scanner = new Scanner(System.in);
        // Выводим меню.
        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            // Обработка ввода пользователя.
            switch (userInput) {
                case 1:
                    csv.readMonthFile();
                    break;
                case 2:
                    csv.readYearFile();
                    break;
                case 3:
                    fileData.compareReports();
                    break;
                case 4:
                    fileData.dataMonth();
                    break;
                case 5:
                    fileData.dataYear();
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Не верный ввод");
                    break;
            }

        }

    }

    // Метод вывода меню.
    private static void printMenu() {
        System.out.println("Что вы хотите сделать?: ");
        System.out.println("1: Считать все месячные отчёты");
        System.out.println("2: Считать годовой отчёт");
        System.out.println("3: Сверить данные о месячных и годовых отчётах");
        System.out.println("4: Вывести информацию о всех месячных отчётах");
        System.out.println("5: Вывести информацию о годовом отчёте");
        System.out.println("6: Выйти из приложения");
    }
}
