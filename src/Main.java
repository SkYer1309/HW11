public class Main {
    public static void main(String[] args) {
        checkYear(2023);
        checkDeviceOS(1, 2000);
        //task3();
    }

    public static void checkYear(int year) {
        System.out.println("Задача 1");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public  static  void checkDeviceOS(int clientOS, int DeviceYear){
        System.out.println("Задача 2");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке:");
        }
        if (clientOS == 0 && DeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && DeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        } else {
            System.out.println("Установите версию приложения для " + (clientOS == 0 ? "iOS" : "Android")
                    + " по ссылке:");
        }
    }
    }





