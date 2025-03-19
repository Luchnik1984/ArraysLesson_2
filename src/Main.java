public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        int[] accountingBook = {7000, 3000, 2545, 41010, 10070};
        int amountOfExpenses = 0;
        for (int monday : accountingBook) {
            amountOfExpenses += monday;
        }
        System.out.println("Сумма трат за месяц составила: " +
                amountOfExpenses + " рублей");

        // Задача 2.
        System.out.println("\nЗадача 2.");
        int[] weekExpenses = {70, 300, 25, 40, 100};
        int maximumExpenses = weekExpenses[0];
        int minimumExpenses = weekExpenses[0];
        for (int expenses : weekExpenses) {
            if (expenses > maximumExpenses) {
                maximumExpenses = expenses;
            }
            if (expenses < minimumExpenses) {
                minimumExpenses = expenses;
            }
        }
        System.out.println("Минимальная сумма затрат за неделю составила "
                + minimumExpenses + " рублей ");
        System.out.println("Максимальная сумма затрат за неделю составила "
                + maximumExpenses + " рублей ");

        // Задача 3.
        System.out.println("\nЗадача 3.");
        int[] monthExpenses = {21000, 11300, 25000, 47000, 10007};
        double averageWeekExpenses = 0;
        for (int weekExpenes : monthExpenses) {
            averageWeekExpenses += weekExpenes;
        }
        averageWeekExpenses = averageWeekExpenses / monthExpenses.length;
        System.out.println("Средняя сумма трат в неделю за месяц составила "
                + averageWeekExpenses + " рублей");

        // Задача 4.
        System.out.println("\nЗадача 4.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}