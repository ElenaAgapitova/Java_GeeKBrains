package homeworks.homework2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой
        // итерации запишите в лог-файл.

        int[] array = createRandomArray(10, 15);
        System.out.print("Созданный массив: ");
        System.out.println(showArray(array));
        System.out.print("Отсортированный массив: ");
        int[] sortArray = bubbleSort(array);
        System.out.println(showArray(sortArray));
    }

    static int[] createRandomArray(int size, int upperBond) {
        Random rand = new Random();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt(upperBond);
        }
        return array;
    }

    static String showArray(int[] array) {
        return Arrays.toString(array);
    }

    static int[] bubbleSort(int[] array) {
        int[] sortArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sortArray.length / 2 + 1; i++) {
            for (int j = 0; j < sortArray.length - 1; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    int temp = sortArray[j];
                    sortArray[j + 1] = sortArray[j];
                    sortArray[j + 1] = temp;
                }
//                try {
//                    log_result(sortArray);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
            }

        }
        return sortArray;
    }

    static void log_result(int[] array) throws IOException {
        Logger log = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logBubble.txt", true);
        log.addHandler(fh);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        // log.setLevel(Level.INFO);
        log.log(Level.INFO, Arrays.toString(array) + "\n");
    }
}
