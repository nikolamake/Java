package Seminar_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaxMinValue();
    }

    //    1. Задать одномерный массив и найти в нем
//    минимальный и максимальный элементы
    private static void MaxMinValue() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
        int maxValue = array[0];
        int minValue = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > maxValue) {
                maxValue = array[j];
            }
            if (array[j] < minValue) {
                minValue = array[j];
            }
        }
        System.out.println("Массив из случайных чисел :\n" + Arrays.toString(array));
        System.out.println("Минимальное число в массиве :" + minValue);
        System.out.print("Максимальное число в массиве :" + maxValue);
    }

    //    2. Написать метод, который определяет, является ли введенный пользователем год
//    високосным, и возвращает в консоль boolean (високосный - true, не високосный - false).
//    Каждый 4-й год является високосным,
//    кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void LeapYear() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Integer.parseInt(iScanner.nextLine());
        System.out.println(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
    }

//    3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы
//        в конец массива.Таким образом, первые несколько (или все) элементов
//        массива должны быть отличны от заданного, а остальные - равны ему.

    private static void MoveEnd() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //получение случайного массива
            array[i] = random.nextInt(5);
        }
        int num = new Random().nextInt(array.length);
        int rndNumber = array[num]; //случайный элемент из массива array
        int[] newArray = new int[array.length];
        int indexRight = 0; //индекс с начала массива
        int indexLeft = array.length - 1; //индекс с конца массива
        while (indexRight < indexLeft){
            if (array[indexRight] == rndNumber && array[indexLeft] != rndNumber){
                newArray[indexLeft] = array[indexRight];
                newArray[indexRight] = array[indexLeft];
                indexRight++;
                indexLeft--;
            }
            if (array[indexRight] != rndNumber && array[indexLeft] != rndNumber){
                newArray[indexLeft] = array[indexLeft];
                newArray[indexRight] = array[indexRight];
                indexRight++;
            }
            if (array[indexRight] != rndNumber && array[indexLeft] == rndNumber){
                newArray[indexLeft] = array[indexLeft];
                newArray[indexRight] = array[indexRight];
                indexRight++;
                indexLeft--;
            }
            if (array[indexRight] == rndNumber && array[indexLeft] == rndNumber){
                array[indexRight+1] =array[indexRight];
                indexLeft=-1;
            }

        }
        System.out.println("Массив из случайных чисел :\n" + Arrays.toString(array));
        System.out.println("Случайный элемент массива :" + rndNumber);
        System.out.println("Массив форматированный :\n" + Arrays.toString(newArray));


    }
}