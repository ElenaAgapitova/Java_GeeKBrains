package lections;
// import java.util.Scanner;
import java.io. *;

/**
 * lec1
 */
public class lec1 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // System.out.println("hi world");  // и снова привет мир
        // short age = 10;
        // int salary = 12345; // занимает 4 байта
        // // System.out.println(age);
        // // System.out.println(salary);
        // float a = 2.7f; // обязательно использовать суфикс  f с float!!!
        // double b = 3.14; // в double есть суфикс D, но он не обязателен double b = 3.14D

        // char ch = '{';
        // char n = 123; // тип char, а не int

        // boolean f = true && false; //  или ||

        // boolean g = true ^ false; // разделительная дизъюнкция "или"? истина когда что-то одно истина

        // String msg = "Hello world";
        // // System.out.println(msg);

        // var i = 123; // неявная типизация, будет подставлен тот тип, который ближе

        // String str_new = "qwerty";
        // a = str_new.charAt(0); // обращение к q по индексу 0, выведет 113 (значение в unicode)
        // // System.out.println(a);

        // int c = 123;
        // System.out.println(c-- - --c); // 2
        // System.out.println(--c - --c); // 1
        // System.out.println(--c-c--); // 0
        
        // Массивы
        int[] array = new int[10];
        System.out.println(array.length);
        array = new int[] {1,2,3,4,5};
        System.out.println(array.length);

        // int[] arr[] = new int[3][5]; // 3 строки и 5 столбцов
        // int[][] arr = new int[3][5];

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("x: ");
        // boolean flag1 = iScanner.hasNextInt();
        // System.out.println(flag1);
        // int x = iScanner.nextInt();
        // System.out.printf("y: ");
        // boolean flag2 = iScanner.hasNextDouble();
        // System.out.println(flag2);
        // double y = iScanner.nextDouble();
        // System.out.printf("%.2f = %d + %.2f ", x+y, x, y);
        // iScanner.close();
        
        int a = 1;
        int b = 2;
        int c;
        if (a>b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        // Упрощенная форма
        // if (a>b) c = a;
        // if (b>a) c = b;

        // Тернарный оператор
        int k = 1;
        int m = 2;
        int min = k < m ? k : m;
        System.out.println(min);

        int res = 122;

        switch (res) {
            case 1: 
                System.out.println('a');
                break;
            case 122: 
                System.out.println(122);
                break;
            default:
                System.out.println("пока");
        }

        int value = 321;
        int count = 0;

        while (value !=0) {
            value/=10;
            count++;
        }
        System.out.println(count);

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) 
                continue; // пойдет дальше 
            System.out.println(i);
        }

        for (int j = 0; j < 10; j++) {
            if(j % 2 != 0) 
                break; // оборвется цикл
            System.out.println(j);
        }

        // continue и break лучше не испоьзовать в коде

        // Цикл for in
        int[] arr = new int[] {1,2,3,4,5};
        for(int item: arr) {
            System.out.println(item); // присвоить или поменять значение нельзя, только по индексу
        }

        // Работа с файлами:
        // запись в файл
        // try (FileWriter fw = new FileWriter("file_lec1.txt", false)) {
        //     fw.write("line 1");
        //     fw.append('\n');
        //     fw.append('2');
        //     fw.append('\n');
        //     fw.write("line 3");
        //     fw.flush();
        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        // }

        BufferedReader br = new BufferedReader(new FileReader("file_lec1.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();


    }
}