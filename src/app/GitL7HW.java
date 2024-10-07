package app;

import java.util.Arrays;
import java.util.Random;

public class GitL7HW {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        System.out.print("Елементи масиву:[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");

        int negativeNumsum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeNumsum += num;
            }
        }
        System.out.print("Сума від'ємних чисел: " + negativeNumsum);
        System.out.println();

        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        int maxElement = 0, minElement = 0;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            } else if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + minElement + "(з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + maxElement + "(з індексом " + maxIndex + ")");

        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних чисел.");
        } else {
            int sumAfterNegative = 0;
            int countAfterNegative = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfterNegative += array[i];
                countAfterNegative++;
            }
            double averageAfterNegative = (double) sumAfterNegative / countAfterNegative;
            System.out.printf
                    ("Середнє арифметичне чисел після першого від'ємного числа:%.2f\n"
                            , averageAfterNegative);
        }

        }
    }
































