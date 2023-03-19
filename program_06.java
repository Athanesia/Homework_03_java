// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class program_06 {
    
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }
    
    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle); // сортируем левую половину
            mergeSort(arr, helper, middle + 1, high); // сортируем правую половину
            merge(arr, helper, low, middle, high); // слияние двух отсортированных половин
        }
    }
    
    private static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        // копируем вспомогательный массив
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        // слияние двух половин
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        // копируем оставшиеся элементы левой половины, если они есть
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helperLeft + i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}