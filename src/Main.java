public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("#1");
        int age = 17;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        //2
        System.out.println("#2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //3
        System.out.println("#3");
        int speed = 50;
        boolean isSpeeding = speed >= 60;
        if (isSpeeding) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //4
        System.out.println("#4");
        age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //5
        System.out.println("#5");
        age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //6
        System.out.println("#6");
        int capacity = 102, seats = 60, passengers = 50;
        if (passengers >= capacity) {
            System.out.println("В поезде уже " + passengers + " пассажиров, мест нет.");
        } else {
            if (passengers >= seats) {
                System.out.println("В поезде " + passengers + " пассажиров, есть стоячие места (" + (capacity - passengers) + ").");
            } else {
                System.out.println("В поезде " + passengers + " пассажиров, есть сидячие места (" + (seats - passengers) + ")");
            }
        }

        //7
        System.out.println("#7");
        int one = 1, two = 2, three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число это " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число это " + two);
        } else {
            System.out.println("Наибольшее число это " + three);
        }
    }
}
