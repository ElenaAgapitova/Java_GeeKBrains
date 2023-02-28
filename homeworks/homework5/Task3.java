package homeworks.homework5;


import java.util.Arrays;

public class Task3 {
    // *Реализовать алгоритм пирамидальной сортировки (HeapSort)
    public static void main(String[] args) {
        int[] array = {1, 24, 3, 56, 789, -5, 12, 45};

        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.print("HeapSort: ");
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void heapSort(int[] array) {
        int n = array.length;

        // Строим кучу (heap) - 789 станет на вершину пирамиды
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Извлекаем элементы из кучи (heap) по одному
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify на уменьшенной куче (heap)
            heapify(array, i, 0);
        }
    }

    static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && array[left] > array[largest])
            largest = left;

        // Если правый потомок больше, чем наибольший элемент на данный момент
        if (right < n && array[right] > array[largest])
            largest = right;

        // Если наибольший элемент не корень
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Рекурсивно heapify поддерево
            heapify(array, n, largest);

        }
    }

}
