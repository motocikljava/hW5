public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2
        int clientOS = 1;
        int clientDeviceYear =2014;
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            if (clientDeviceYear <2015 && clientOS == 1) {
                System.out.println("установите облегченную версию приложения для Android");
            } else
            if (clientDeviceYear <2015 && clientOS == 0) {
                System.out.println("установите облегченную версию приложения для iOs");
            }

        // выполнение согласно установленным критериям возможно,
        //только если изначально допустить,что значения будут только 0 и 1
        int clientOS1 = 1;
        int clientDeviceYear1 = 2020;
        if (clientOS1 > 0) {
            if (clientDeviceYear1 < 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (clientOS1 == 0) {
            if (clientDeviceYear1 < 2015) {
                System.out.println("Установите версию приложения для iOs по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOs по ссылке");
            }
        }
        // Задание 3
        int year = 2056;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
        // задание 4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay ++;
        }
        if (deliveryDistance > 60) {
            deliveryDay ++;
        }
        if (deliveryDistance >120) {
            deliveryDay ++;
        }
        System.out.println("потребуется дней: " + deliveryDay);
        // задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("такого месяца не существует");

        }
        // задание 6

    }
}
