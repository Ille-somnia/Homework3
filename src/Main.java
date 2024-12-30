public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");

        byte a = 5;
        short b = -109;
        int c = 69;
        long d = 566;
        float e = 8.28f;
        double f = 582.746382926;
        System.out.printf("Значение переменной a с типом byte равно %s%n", a);
        System.out.printf("Значение переменной b с типом short равно %s%n", b);
        System.out.printf("Значение переменной c с типом int равно %s%n", c);
        System.out.printf("Значение переменной d с типом long равно %s%n", d);
        System.out.printf("Значение переменной e с типом float равно %s%n", e);
        System.out.printf("Значение переменной f с типом double равно %s%n", f);

        System.out.println("\nTask 2");
        float a1 = 27.12f;
        long a2 = 987_678_965_549L;
        float a3 = 2.786f;
        short a4 = 569;
        short a5 = -159;
        short a6 = 27897;
        byte a7 = 67;
        System.out.printf("Значение переменной a1 с типом float равно %s%n", a1);
        System.out.printf("Значение переменной a2 с типом long равно %s%n", a2);
        System.out.printf("Значение переменной a3 с типом float равно %s%n", a3);
        System.out.printf("Значение переменной a4 с типом short равно %s%n", a4);
        System.out.printf("Значение переменной a5 с типом short равно %s%n", a5);
        System.out.printf("Значение переменной a6 с типом short равно %s%n", a6);
        System.out.printf("Значение переменной a7 с типом short равно %s%n", a7);


        System.out.println("\nTask 3");

        int ludmilaStudent = 23;
        int annaStudent = 27;
        int ekaterinaStudent = 30;
        int commonPaperAmount = 480;

        int commonStudentAmount = ludmilaStudent + annaStudent + ekaterinaStudent;

        double paperPerStudentAmount = (double) commonPaperAmount / commonStudentAmount;

        System.out.printf("На каждого ученика рассчитано %s листов бумаги%n", paperPerStudentAmount);

        System.out.println("\nTask 4");
        int machineCapasityTwoMinutes = 16;
        int machineCapasityOneMinutes = machineCapasityTwoMinutes / 2;

        int machineCapasityTwentyMinutes = machineCapasityOneMinutes * 20;
        int machineCapasityOneDay = machineCapasityOneMinutes * 60 * 24;
        int machineCapasityThreeDays = machineCapasityOneDay * 3;
        int machineCapasityOneMonth = machineCapasityOneDay * 31;

        System.out.printf("За 20 минут машина произвела %s единиц бутылок.%n", machineCapasityTwentyMinutes);
        System.out.printf("За день машина произвела %s единиц бутылок.%n", machineCapasityOneDay);
        System.out.printf("За 3 дня машина произвела %s единиц бутылок.%n", machineCapasityThreeDays);
        System.out.printf("За месяц машина произвела %s единиц бутылок.%n", machineCapasityOneMonth);

        System.out.println("\nTask 5");
        int commonCantAmount = 120;
        int whitePaintPerClass = 2;
        int brounPaintPerClass = 4;

        int commonPaintPerClassAmount = whitePaintPerClass + brounPaintPerClass;
        int classesAmount = commonCantAmount / commonPaintPerClassAmount;
        int commonWhitePaintPerClassesAmount = classesAmount * whitePaintPerClass;
        int commonBrounPaintPerClassesAmount = classesAmount * brounPaintPerClass;

        System.out.printf("В школе, где %S классов, нужно %s банок белой краски и %s банок коричневой краски.%n",
                classesAmount, commonWhitePaintPerClassesAmount, commonBrounPaintPerClassesAmount);

        System.out.println("\nTask 6");

        int bananasAmount = 5;
        int bananasWeight = 80;
        int commonBananasWeight = bananasAmount * bananasWeight;

        int milkAmount = 200;
        int milkWeight = 105;
        int commonMilkWeight = milkAmount / 100 * milkWeight;

        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int commonIceCreamWeight = iceCreamAmount * iceCreamWeight;

        int eggsAmount = 4;
        int eggsWeight = 70;
        int commonEggsWeight = eggsAmount * eggsWeight;

        int commonProductsWeightGr = commonBananasWeight + commonMilkWeight + commonIceCreamWeight + commonEggsWeight;
        double commonProductsWeightKg = (double) commonProductsWeightGr / 1000;

        System.out.printf("Для завтрака требуется %s грамм или %s килограмм продуктов.%n", commonProductsWeightGr, commonProductsWeightKg);

        System.out.println("\nTask 7");

        int weightGoalKg = 7;
        int weightGoalGg = weightGoalKg * 1000;
        int minWeightLossAmount = 250;
        int maxWeightLossAmount = 500;

        double minDaysWeightLossAmount = (double) weightGoalGg / minWeightLossAmount;
        double maxDaysWeightLossAmount = (double) weightGoalGg / maxWeightLossAmount;

        double avgDaysAmount = (minDaysWeightLossAmount + maxDaysWeightLossAmount)/2;

        System.out.printf("Если спортсмен будет терять по %s грамм каждый день, то ему потребуется %s дней, чтобы похудеть на %s кг.%n",
                minWeightLossAmount, minDaysWeightLossAmount, weightGoalKg);
        System.out.printf("Если спортсмен будет терять по %s грамм каждый день, то ему потребуется %s дней, чтобы похудеть на %s кг.%n",
                maxWeightLossAmount, maxDaysWeightLossAmount, weightGoalKg);
        System.out.println("Среднее количество дней для похудения - " + avgDaysAmount);


        System.out.println("\nTask 8");

        double indexation = 1.1;
        double mashaSalaryPerMonth = 67760;
        double denisSalaryPerMonth = 83690;
        double khristinaSalaryPerMonth = 76230;

        double mashaSalaryRaise = mashaSalaryPerMonth * indexation;
        double denisSalaryRaise = denisSalaryPerMonth * indexation;
        double khristinaSalaryRaise = khristinaSalaryPerMonth * indexation;

        double mashaSalaryPerYear = mashaSalaryPerMonth * 12;
        double denisSalaryPerYear = denisSalaryPerMonth * 12;
        double khristinaSalaryPerYear = khristinaSalaryPerMonth * 12;

        double mashaSalaryRaisePerYear = mashaSalaryRaise * 12;
        double denisSalaryRaisePerYear = denisSalaryRaise * 12;
        double khristinaSalaryRaisePerYear = khristinaSalaryRaise * 12;

        double mashaSalaryDifference = mashaSalaryRaisePerYear - mashaSalaryPerYear;
        double denisSalaryDifference = denisSalaryRaisePerYear - denisSalaryPerYear;
        double khristinaSalaryDifference = khristinaSalaryRaisePerYear - khristinaSalaryPerYear;

        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                mashaSalaryRaise, mashaSalaryDifference);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                denisSalaryRaise, denisSalaryDifference);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",
                khristinaSalaryRaise, khristinaSalaryDifference);



    }
}