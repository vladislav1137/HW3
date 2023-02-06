public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte q = -128;
        System.out.println("Значение переменной q " + "с типом " + "byte" + " равно " + q);
        short w = 32767;
        System.out.println("Значение переменной w " + "с типом " + "byte" + " равно " + w);
        int e = 2147483647;
        System.out.println("Значение переменной e " + "с типом " + "byte" + " равно " + e);
        long r = 13377410232145L;
        System.out.println("Значение переменной r " + "с типом " + "byte" + " равно " + r);
        float t = 1.0001f;
        System.out.println("Значение переменной t " + "с типом " + "byte" + " равно " + t);
        double y = 1.1234567;
        System.out.println("Значение переменной y " + "с типом " + "byte" + " равно " + y);
        }


    public static void task2 () {
        System.out.println("Задача 2");
        float a  = 27.12f;
        System.out.println(a);
        long s = 987678965549L;
        System.out.println(s);
        double d = 2.786d;
        System.out.println(d);
        int f = 569;
        System.out.println(f);
        short g = -159;
        System.out.println(g);
        short h = 27897;
        System.out.println(h);
        byte j = 67;
        System.out.println(j);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsOfTheFirstTeacher = 23;
        byte studentsOfTheSecondTeacher = 27;
        byte studentsOfTheThirdTeacher = 30;
        int totalNumberStudents = studentsOfTheFirstTeacher + studentsOfTheSecondTeacher + studentsOfTheThirdTeacher;
        short sheetsOfpaper = 480;
        int sheetForEachStudent = sheetsOfpaper / totalNumberStudents;
        System.out.println("На каждого ученика рассчитано "+ sheetForEachStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte performanceMachineInTwoMinutes = 16;
        int performanceMachineinOneMinute = performanceMachineInTwoMinutes / 2;
        int performanceMachineInTwentyMinutes = performanceMachineinOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + performanceMachineInTwentyMinutes + " штук бутылок");
        short quantityMinutesInOneDay = 60 * 24;
        int performanceMachineInOneDay = quantityMinutesInOneDay * performanceMachineinOneMinute;
        System.out.println("За один день машина произвела " + performanceMachineInOneDay + " штук бутылок");
        int quantityMinutesInThreeDays = quantityMinutesInOneDay * 3;
        int performanceMachineInThreeDays = quantityMinutesInThreeDays * performanceMachineinOneMinute;
        System.out.println("За три дня машина произвела " + performanceMachineInThreeDays + " штук бутылок");
        int quantityMinutesInOneMonth = quantityMinutesInOneDay * 30;
        int performanceMachineInOneMonth = quantityMinutesInOneMonth * performanceMachineinOneMinute;
        System.out.println("За один месяц машина произвела " + performanceMachineInOneMonth + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPotsOfPaint = 120;
        byte potOfWhitePaintInOneClassroom = 2;
        byte potOfBrownPaintInOneClassroom = 4;
        int totalPotsOfWhiteAndBrownPaintInOneClassroom = potOfBrownPaintInOneClassroom + potOfWhitePaintInOneClassroom;
        int totalPaintedClassroom = totalPotsOfPaint / totalPotsOfWhiteAndBrownPaintInOneClassroom;
        int totalOfWhitePaintForTotalClassroom = totalPaintedClassroom * potOfWhitePaintInOneClassroom;
        int totalOfBrownPaintForTotalClassroom = totalPaintedClassroom * potOfBrownPaintInOneClassroom;
        System.out.println("В школе, где "+ totalPaintedClassroom + " классов, нужно " + totalOfWhitePaintForTotalClassroom + " банок белой краски и " + totalOfBrownPaintForTotalClassroom + " банок коричневой краски." );
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weigthOfOneBanana = 80;
        int weigthOfBananas = bananas * weigthOfOneBanana;
        byte weigthOfMIlkInOneHundredMl = 105;
        int weigthOfMilkInTwoHudredMl = weigthOfMIlkInOneHundredMl * 2;
        byte icecream = 2;
        byte weigthOfIcecream = 100;
        int weigthTwoPackOfIcecream = icecream * weigthOfIcecream;
        byte eggs = 4;
        byte weigthOfOneEgg = 70;
        int weigthFourEggs = eggs * weigthOfOneEgg;
        int totalWeigthOfCoctailInG = weigthOfBananas + weigthFourEggs + weigthTwoPackOfIcecream + weigthOfMilkInTwoHudredMl;
        float totalGInOneKg = 1000f;
        float totalWeigthOfCoctailInKg = totalWeigthOfCoctailInG / totalGInOneKg;
        System.out.println("Общий вес коктейля " + totalWeigthOfCoctailInG + " грамм");
        System.out.println("Общий вес коктейля " + totalWeigthOfCoctailInKg + " килограмма");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte necessaryWeightInKg = 7;
        short weightGInOneKg = 1000;
        int necessaryWeightInG = necessaryWeightInKg * weightGInOneKg;
        short weightMinInG = 250;
        short weightMaxInG = 500;
        int daysAtMinWeight = necessaryWeightInG / weightMinInG;
        int daysAtMaxWeight = necessaryWeightInG / weightMaxInG;
        int averageWeight = weightMinInG / 2 + weightMaxInG / 2;
        int averageDaysAtAverageWeight = necessaryWeightInG / averageWeight;
        System.out.println("Спортсмен будет худеть " + daysAtMinWeight + " дней на необходимые 7кг при похудении на 250 граммов в день.");
        System.out.println("Спортсмен будет худеть " + daysAtMaxWeight + " дней на необходимые 7кг при похудении на 500 граммов в день.");
        System.out.println("В среднем спортсмен будет худеть " + averageDaysAtAverageWeight + " дней при средней потере веса на " + averageWeight + " граммов в день");
    }
    public static void task8 () {
        System.out.println("Задача 8");

    }
}