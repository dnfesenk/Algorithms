package com.denisfesenko;

import java.util.Arrays;

/**
 * Этот код сначала находит максимальное и минимальное значения в массиве, чтобы определить диапазон значений.
 * Затем он создает массив подсчета и заполняет его, проходя по входному массиву и увеличивая соответствующий
 * элемент массива подсчета. Затем алгоритм суммирует значения в массиве подсчета, чтобы определить позиции элементов
 * в отсортированном массиве. Затем алгоритм проходит по исходному массиву справа налево, чтобы построить отсортированный
 * массив. Наконец, он копирует отсортированный массив обратно в исходный массив.
 */
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countSort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 3, 3, 4, 8]
    }

    public static void countSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Подсчет количества элементов
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Суммирование значений массива подсчета
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Построение выходного массива
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Копирование отсортированного массива в исходный
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
