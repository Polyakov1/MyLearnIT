package org.example;

import java.util.Arrays;
import java.util.Scanner;

//
//
// Реализуйте метод, принимающий в качестве аргумента
// целочисленный массив. Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.
public class Main {
    public static void main(String[] args) {

       int[] arr = {-1,2,3,6};
       int[] arr1 = {5,2,6};

       /*
        int[] arr1 = {1, 2, 3, 5, 74, 23232, 11, 32323, 9};
                int[][] arr3 = {
                {2, 3, 4, 5, 56, 7, 8, 906, 3, 2,},
                {3, 1, 5, 7, 9, 0},
                {3, 1, 5, 7, 9, 0},
                {3, 1, 5, 7, 9, 0}};
        int[][] arr4 = {
                {1, 0},
                {0, 3},
        };
        int[][] arr5 = {
                {1, 0},
                null,
        };
        int[] arr2 = null;
        int[][] arr6 = null;*/
//        System.out.println(searchError(arr));
//        System.out.println(searchNumbers(arr, 4 ));
//        client();
        /*task4(arr6);*/
/*        Integer[] arr7 = {1,3,5,7,null,323,null,123,null};
        checkArray(arr7);*/

        System.out.println(Arrays.toString(task6(arr, arr1)));


    }

    public static int searchError(int[] arr) {

        if (arr == null || arr.length < 8) {
            return -1;
        }
        return arr.length;
    }
    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    // Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
    //
    //1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
    //2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    //3. если вместо массива пришел null, метод вернет -3
    //4. Если длина массива больше некоторого заданного минимума -4
    //
    //Напишите метод, в котором реализуйте взаимодействие с пользователем.
    // То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет
    // читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
    //.indexOf("e")

    public static int searchNumbers(int[] arr, int number) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < 20) {
            return -1;
        }
        if (arr.length > 99) {
            return -4;
        }
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -2;
    }

    public static void client() {
        int[] arr = {1, 2, 3, 4214};
        Scanner iscanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int nums = iscanner.nextInt();


        switch (searchNumbers(arr, nums)) {
            case -1:
                System.out.println("Длина массива меньше некоторого заданного минимума");
                throw new RuntimeException();
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            case -4:
                System.out.println("Длина массива больше некоторого заданного минимума");
                break;
            default:
                System.out.println("Элемент найден");
        }
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    // Необходимо посчитать и вернуть сумму элементов этого массива.
    // При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
    // и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
    // метод должен бросить RuntimeException с сообщением об ошибке.
    //
    public static int task4(int[][] arr) {
        int count = 0;
        if (arr == null) {
            throw new RuntimeException("Массив отсутствует");
        }
        for (int[] i : arr
        ) {
            if (i == null) {
                throw new RuntimeException("Есть пустые строки.");
            }

        }
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Работать только с квадратными массивами");
        }
        for (int[] i : arr) {
            for (int j : i) {
                if (j > 1 || j < 0) {
                    throw new RuntimeException("может лежать только значение 0 или 1");
                }
                count += j;
            }

        }
        System.out.println(count);
        return 0;
    }

    //Реализуйте метод checkArray
    //принимающий в качестве аргумента целочисленный одномерный массив.
    //Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:
    //1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    //2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    public static void checkArray(Integer[] arr) {
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println(i + " Пустая ячейка");
            } ;

        }
    }
    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив,
    // каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int[] task6(int[] arr, int[] arr1){
        if(arr.length != arr1.length ){throw new RuntimeException("Первый массив " + arr.length + " Второй массив " + arr1.length + " Плохо");}
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] + arr1[i];

        }

        return newArr;

    }
}
