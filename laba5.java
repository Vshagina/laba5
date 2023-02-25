package com.company;

import java.util.Scanner;

public class laba5 {
    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество значений в массиве: ");
        int mas = in.nextInt();
        int num[] = new int[mas];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < mas; i++) {
            num[i] = in.nextInt();
        }
        bubbleSort(num);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < mas; i++) {
            System.out.println(num[i] + "");
        }
    }
}
/*        int[] sortArr = {12, 6, 4, 1, 15, 10};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }*/
