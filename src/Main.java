import java.time.LocalDate;

public class Main {
    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void chooseOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (clientDeviceYear <= currentYear) {
                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Вы ввели год больше текущего!");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else if (clientDeviceYear <= currentYear) {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Вы ввели год больше текущего!");
                }
                break;
            default:
                System.out.println("Вы ввели неизвестную версию ОС");
        }
    }

    public static void calculateDelivery(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        }
    }

    public static void main(String[] args) {

        // Task 1
        int year1 = 1999;
        int year2 = 2000;
        isLeapYear(year1);
        isLeapYear(year2);

        // Task 2
        int clientDeviceYear = 2015;
        chooseOS(1, clientDeviceYear);

        // Task 3
        int deliveryDistance = 95;
        calculateDelivery(deliveryDistance);

    }
}