public class Main {
    public static void main(String[] args) {
        // Zadacha 1 //
        System.out.println("Задача 1");
        int age = 20;
        if (age < 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        } else
        {
            System.out.println("Если возраст человека рвен "  + age + ", то он достиг совершеннолетия");
        }

        // Zadacha 2 //
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5)
        {
            System.out.println(" На улице холодно: "  + temperature + " градусов, нужно надеть шапку");
        } else System.out.println("Сегодня тепло: " + temperature + " градусов, можно идти без шапки");

        // Zadacha 3 //
        System.out.println("Задача 3");
        int speed = 100;
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        else
            {
            System.out.println("Если скорость " + speed + " км/ч, то можно ехать спокойно");
        }
        // Zadacha 4 //
        System.out.println("Задача 4");
        int ageOfPerson = 5;
        if (ageOfPerson <= 6) {
            System.out.println("Если человеку " + ageOfPerson + " лет, то ему надо ходить в детский сад");
        }else if (ageOfPerson > 6 && ageOfPerson <= 18) {
            System.out.println(" Если человеку " + ageOfPerson + " лет, то ему надо ходить в школу");
        }else if (ageOfPerson > 18 && ageOfPerson <= 24) {
            System.out.println("Если человеку " + ageOfPerson + " лет, то ему надо ходить в университет");
        }else System.out.println("Если человеку " + ageOfPerson + " лет, то ему надо ходить на работу");

        //zadacha 5 //
        System.out.println("Задача 5");
        int child = 10;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему нельзя кататься на аттракционе");
        } else if (child < 14){
            System.out.println("Если возраст ребенка равен " + child + ", можно кататься на аттракционе в сопровождении");
        } else System.out.println("Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        //zadacha 6//
        System.out.println("Задача 6");
        int capacity = 102;
        int sit = 60;
        int stand = capacity - sit;
        int place = 50;
        if (place < 60){
            System.out.println("В вагоне " + (capacity - place) + " свободных мест, из них " + (capacity - stand - place) + " сидячих и " + stand + " стоячих");
        } else if (place >= 60 && place < 102){
            System.out.println("В вагоне нет сидячих мест, но есть " + (stand - (place - sit)) + " стоячих мест");
        } else System.out.println("В вагоне нет мест");

        // zadacha 7 //
        System.out.println("Задача 7");
        int one = 99000;
        int two = 1000000;
        int three = 10000;
        if (one > two)
        {
            if (one > three)
            {

                System.out.println(one);

            }
            else if(one == three)
            {
                System.out.println(three + ", " + one);
            } else System.out.println(three);
        } else if(two > three)
        {
            System.out.println(two);
        } else if (two == three)
        {
            System.out.println(two + ", " + three);
        }

             else System.out.println(three);
        }






        }




