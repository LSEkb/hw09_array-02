import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");

        //int[] expenses = generateRandomArray();
        int[] expenses = {10, 25, 40, 15, 20, 15};
        int sumMonth = 0;
        for (int expens : expenses) {
            sumMonth = sumMonth + expens;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");
    }


    public static void task2() {
        System.out.println("Задача 2");

        //int[] arr = generateRandomArray();
        int[] expenses = {20, 25, 40, 15, 10, 15};
        int maxExpenses = 0;
        int minExpenses = 200_001;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }


    public static void task3() {
        System.out.println("Задача 3");

        //int[] arr = generateRandomArray();
        int[] expenses = {10, 25, 40, 15, 20, 15};

        int sumMonth = 0;
        for (int expens : expenses) {
            sumMonth = sumMonth + expens;
        }
        double midExpenses = 1.00 * sumMonth / expenses.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", midExpenses);
    }


    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };

        // Для симметричного отображения элементов массива меняем значения навстречу друг другу с краёв массива, доходя до середины массива;
        // если количество элементов нечетно, средний и не потребует замены. Чтобы не потерять значение из той ячейки, которую перезаписываем,
        // создаём внутри цикла переменную обмена exchangeVar с тем же типом, что и элементы массива. По завершении цикла массив исправлен.
        for (int i = 0; i < (reverseFullName.length - 1) / 2; i++) {
            char exchangeVar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = exchangeVar;
        }

        System.out.println(Arrays.toString(reverseFullName));
    }

}
