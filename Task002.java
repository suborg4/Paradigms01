/**
* Дан список целых чисел numbers. Необходимо написать в декларативном стиле процедуру для
* сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
*
* Декларативный стиль программирования  описывает что нужно сделать, а не как это делать.
* Код использует потоки данных для сортировки списка и не содержит явных инструкций о том, как сортировать числа.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DeclarativeBubbleSort {

    public static List<Integer> bubbleSort(List<Integer> arr) {
        if (arr.isEmpty()) {
            throw new IllegalArgumentException("На вход должен подаваться непустой список целых чисел");
        }
        return arr.stream()
                  .sorted(Collections.reverseOrder())
                  .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            numbers.add(rand.nextInt(101));
        }

        System.out.println(numbers);
        System.out.println(bubbleSort(numbers));
    }
}
