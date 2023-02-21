public class Main {
    public static void main(String[] args) {
    //Task #1-2
    byte clientOS = 1;
    byte iOS = 0;
    byte androidOS = 1;
    short clientDeviceYear = 2015;
    if (clientOS == iOS && clientDeviceYear >= 2015 ) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == iOS && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    if (clientOS == androidOS && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clientOS == androidOS && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    //Task #3
    int year = 2021;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " год является високосным");
    } else { System.out.println(year + " год не является високосным");}
    }
}