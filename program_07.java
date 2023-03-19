// Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;

public class program_07 {
    public static void main(String[] args) {
        // Создаем список целых чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        // Удаляем четные числа
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        
        // Выводим список на экран
        System.out.println(numbers);
    }
}