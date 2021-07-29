package Lection02;

public class Lection02 {
    public static void main(String[] args) {
        System.out.println(logSummTwoInt(5,20));
        System.out.println(numPositiveOfNegative(-45));
        System.out.println(logReturn(-67));
        strPrint("Я Программирую на Java!!!",5);
        System.out.println(yearLeapOfNotLeap(1612));

    }

    public static boolean logSummTwoInt(int firstNum, int secondNum) {

        int thirdNum = firstNum + secondNum;

        if(thirdNum > 10 & thirdNum < 20) {
            return true;
        }else {
            return false;
        }
    }

    public static String numPositiveOfNegative(int num) {
        if(num >= 0) {
            return "Число положительное!";
        }else {
            return "Число отрицательное!";
        }

    }

    public static boolean logReturn (int num) {
        if(num > 0) {
            return false;
        }else {
            return true;
        }
    }

    public static void strPrint(String str, int num){
        for(int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean yearLeapOfNotLeap(int year) {

        if(year % 4 == 0 || year % 100 != 0 & year % 400 == 0) {
            return  true;
        }else {
            return false;
        }
    }
}
