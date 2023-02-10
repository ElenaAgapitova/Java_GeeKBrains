package seminars;
// import java.time.LocalDateTime;
import java.util.Arrays;



public class sem1 {
    public static void main(String[] args){

        // System.out.println(LocalDateTime.now());

        // Дан массив двоичных чисел, например [1,1,0,1,1,1,1,1,0,1,1], 
        // вывести максимальное количество подряд идущих 1.

        int[] array = new int[] {1,1,0,1,1,1,1,1,0,1,1};
        int countMax = 0;
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == 1) {
                count ++;
            } else {
                if (count > countMax) {
                    countMax = count;
                } 
                count = 0;
        }
    }
    if (count > countMax) {
        countMax = count;
    }
    // System.out.printf("Макс 1 в массиве: %d\n", countMax);


    // Дан массив nums = [3,2,2,3] и число val = 3. 
    // Eсли в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
    // Таким образом, первые несколько (или все) элементов массива должны быть отличны от 
    // заданного, а остальные - равны ему.

    int[] arr = new int[] {3,2,3,1,3,2,5,5,3,2,3,3};
    int val = 3;
    int rp = arr.length - 1;
    for (int i = 0; i < rp; i++) {
        if (arr[i] == val) {
            int temp = arr[i];
            arr[i] = arr[rp];
            arr[rp] = temp;
            rp--;
            i--;
        }
    }
    // System.out.println(Arrays.toString(arr));

    // Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
    // Если общего префикса нет, вернуть пустую строку "".
 
    String[] arrStr = new String [] {"абврмапвепшлдзщзло","абвв","абвварподы","цабва","вабвоп"};
    String pref = "абв";

    System.out.println(findPref(arrStr, pref));
    
    
}

public static String findPref(String [] array, String pref) {
    int lenMax = pref.length();
    String result = "";
    for (String item : array) {
        if (item.startsWith(pref)) {
            if (item.length() > lenMax) {
                lenMax = item.length();
                result = item;
            }
        }
    }
    return result;
}
}