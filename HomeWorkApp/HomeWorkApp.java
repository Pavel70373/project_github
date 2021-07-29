package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c > 0) {
            System.out.println(c);
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 17;
        if (value <= 0) {
            System.out.print("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.print("Жёлтый");
        } else if (value > 100) {
            System.out.print("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 25;
        int b = 99;
        if (a>=b) {
            System.out.print("a >= b");
        }else {
            System.out.print("a < b");
        }
    }

}
