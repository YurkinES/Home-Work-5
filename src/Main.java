public class Main {
    public static void main(String[] args) {
    //Task #1-2
    byte clientOS = 1;
    short releaseYear = 2015;
    if (clientOS == 0 && releaseYear >= 2015 ) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 0 && releaseYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    if (clientOS == 1 && releaseYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clientOS == 1 && releaseYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    }
}