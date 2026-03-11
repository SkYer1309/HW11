import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear(2023);
        int currentYear = LocalDate.now().getYear();
        checkDeviceOS(1, 2011);
        countDeliveryDays(95);
    }

    public static void checkYear(int year) {
        System.out.println("Задача 1");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkDeviceOS(int clientOS, int clienDeviceYear) {
        System.out.println("Задача 2");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке:");
        }
        if (clientOS == 0 && clienDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && clienDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        }
    }
    public static void countDeliveryDays(int deliveryDistance){

    }
}






