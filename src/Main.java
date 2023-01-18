import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int airTemperature = -15;
        if (airTemperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int speed = 90;
        if (speed <= 60) {
            System.out.println("Если ваша скорость " + speed + "км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если ваша скорость " + speed + "км/ч, то  придется заплатить штраф.");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 26;
        boolean infantAge = age > 0 && age < 2;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (infantAge) {
            System.out.println("В этом возрасте ребенок должен развиваться дома.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно учиться в университете.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        boolean withAnAdult = false;
        if (withAnAdult && age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе только в сопровождении родителей.");
        } else if (age >= 5 && age < 14) {
            System.out.println("В этом возрасте кататься на аттракционе без взрослых запрещено!");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослых.");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int occupiedSeatsPlaces = 42;
        int occupiedStandingPlaces = 4;
        int occupiedPlaces = occupiedSeatsPlaces + occupiedStandingPlaces;
        int railwayCarriageCapacity = 102;
        int seatPlace = 60;
        int standingPlaces = railwayCarriageCapacity - seatPlace;
        boolean thereAreNoPlace = occupiedPlaces >= railwayCarriageCapacity;
        boolean noSeating = occupiedSeatsPlaces >= seatPlace;
        if (thereAreNoPlace) {
            System.out.println("Свободных мест нет.");
        } else {
            System.out.println("Свободных мест " + (railwayCarriageCapacity - occupiedPlaces) + ".");
        }
        if (noSeating) {
            System.out.println("Сидячих мест нет.");
        } else {
            System.out.println("Cидячих мест - " + (seatPlace - occupiedSeatsPlaces) + ".");
        }
        if (standingPlaces < occupiedStandingPlaces) {
            System.out.println("Стоячих мест нет!");
        } else {
            System.out.println("Стоячих мест - " + (standingPlaces - occupiedStandingPlaces) + ".");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int one = -105;
        int two = -7;
        int three = -105;
        if (one >= two && one > three || one > two && one >= three) {
            System.out.println("Большее число " + one + ".");
        } else if (one == two && one == three) {
            System.out.println("Все числа равны.");
        } else if (two >= one && two > three || two > one && two >= three) {
            System.out.println("Большее число " + two + ".");
        } else if (three >= one && three > two || three > one && three >= two) {
            System.out.println("Большее число " + three + ".");
        }
    }
}
