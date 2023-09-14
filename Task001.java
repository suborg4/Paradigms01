/**
* Дан список целых чисел numbers. Необходимо написать в императивным стиле процедуру для
* сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
*
* код включает в себя конкретные инструкции о том, как сгенерировать числа, как их отсортировать и как обработать исключение
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task001 {

    public static List<Integer> bubbleSort(List<Integer> arr) {
        if (arr.isEmpty()) {
            throw new IllegalArgumentException("На вход должен подаваться непустой список целых чисел");
        }
        Collections.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            numbers.add(rand.nextInt(101)); // Генерируем случайные целые числа от 0 до 100
        }

        System.out.println(numbers);
        System.out.println(bubbleSort(numbers));
    }
}