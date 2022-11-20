public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для " + " iOS " + " по ссылке ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для " + "Android " + " по ссылке ");
        }
    }

    public static void task2() {
        System.out.println("Задание №2");
        int clientOS = 0;
        int clientDeviceYear = 2004;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + " iOS " + " по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + "iOS" + " по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + "Android " + " по ссылке ");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + "Android" + " по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задание №3");
        int year = 2030;
        boolean leapyear = ((year > 1584 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        if (leapyear) {
            System.out.println("этот год " + year + " високосный");
        } else {
            System.out.println("этот год " + year + " не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задание №4 ");
        int deliveryDistance = 1;
        int day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        } else if(deliveryDistance <=20) {
            day = day;
            System.out.println("Потребуется дней :" + day);
        }else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней :" + day);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется дней :" + day);

        }
    }
    public static void task5(){
        System.out.println("Задание №5 ");
        int monthNumber =13;
        int winter = 1;
        int spring = 2;
        int summer = 3;
        int autumn = 4;
        switch(monthNumber){
            case 1:
                System.out.println("Январь " + "-" + winter );
                break;
            case 2:
                System.out.println("Феварль" + "-" + winter);
                break;
            case 3:
                System.out.println("Март" + "-" + spring);
                break;
            case 4:
                System.out.println("Апрель" + "-" + spring);
                break;
            case 5:
                System.out.println("Май" + "-" + spring);
                break;
            case 6:
                System.out.println("Июнь" + "-" + summer);
            case 7:
                System.out.println("Июль" + "-" + summer);
                break;
            case 8:
                System.out.println("Август" + "-" + summer);
                break;
            case 9:
                System.out.println("Сентябрь" + "-" + autumn);
                break;
            case 10:
                System.out.println("Октябрь" + "-" + autumn);
                break;
            case 11:
                System.out.println("Ноябрь" + "-" + winter);
                break;
            case 12:
                System.out.println("Декабрь" + "-" + winter);
                break;
            case 13:
                System.out.println("Такого месяца не существует =(");
                break;
        }
    }
}