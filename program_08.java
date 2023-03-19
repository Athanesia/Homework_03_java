// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class program_08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);

        int min = Collections.min(list);
        int max = Collections.max(list);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double avg = (double) sum / list.size();

        System.out.println("Минимальное значение списка: " + min);
        System.out.println("Максимальное значение списка: " + max);
        System.out.println("Среднее значение списка: " + avg);
    }
}