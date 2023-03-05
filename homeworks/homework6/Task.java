package homeworks.homework6;

import java.util.*;

public class Task {
    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP Pavilion", 8, 512,
                "Windows 10", "серебристый"));
        laptops.add(new Laptop("Apple MacBook Air", 16, 512,
                "MacOS", "серый"));
        laptops.add(new Laptop("Asus ROG Zephyrus", 32, 1024,
                "Windows 10", "черный"));
        laptops.add(new Laptop("Lenovo IdeaPad", 8, 256,
                "Windows 11", "красный"));
        laptops.add(new Laptop("Thunderobot 911 MT Pro D", 16, 512,
                "не установлена", "черный"));
        // showAll(laptops);
        Laptop needLaptop = requestLaptop();
        System.out.println("========= Параметры запроса ==========\n" + needLaptop);
        Set<Laptop> filteredLaptops = filteredLaptops(laptops, needLaptop);
        showAll(filteredLaptops);


    }

    static void showAll(Set<Laptop> laptops) {
        System.out.println("============= Все модели ===============");
        for (Laptop elem : laptops) {
            System.out.println(elem);
        }
    }

    static Laptop requestLaptop() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название модели или нажмите ввод: ");
        String name = input.nextLine();
        System.out.print("Введите желаемый цвет или нажмите ввод: ");
        String color = input.nextLine();
        System.out.print("Введите операционную систему или нажмите ввод: ");
        String operatingSystem = input.nextLine();
        Integer ssd = null;
        while (true) {
            System.out.print("Введите объем жесткого диска или нажмите ввод: ");
            String inputString = input.nextLine();
            if (inputString.equals("")) {
                break;
            }
            try {
                ssd = Integer.parseInt(inputString);
                if (ssd > 0) {
                    break;
                } else {
                    System.out.print("Введите положительное число: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Введите целое число или нажмите ввод: ");
            }
        }
        Integer ram = null;
        while (true) {
            System.out.print("Введите размер оперативной памяти или нажмите ввод: ");
            String inputString = input.nextLine();
            if (inputString.equals("")) {
                break;
            }
            try {
                ram = Integer.parseInt(inputString);
                if (ram > 0) {
                    break;
                } else {
                    System.out.print("Введите положительное число: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Введите целое число или нажмите ввод: ");
            }
        }
        input.close();
        return new Laptop(name, ram, ssd, operatingSystem, color);
    }

    static Set<Laptop> filteredLaptops(Set<Laptop> laptops, Laptop needLaptop) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop elem: laptops ) {
            if (elem.compareTo(needLaptop)){
                filteredLaptops.add(elem);
            }
        }
        return filteredLaptops;
    }
}

