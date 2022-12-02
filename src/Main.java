public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

    }

    private static void task1() {
        System.out.println("Задача1");
        int a = 10000;
        byte b = 12;
        short c = 30000;
        long d = 1000000L;
        float e = 3.5f;
        double l = 30.5f;
        System.out.println("значение переменной  int с типом а равна" +a);
        System.out.println("значение переменной byte с типом b равна" +b);
        System.out.println("значение переменной short с типом с равна"+c);
        System.out.println("значение перенной long c типом d равна"+d);
        System.out.println("значение переменной float с типом e равно "+e);
        System.out.println("значение переменной double с типом l равна"+ l);


    }

    private static void task2() {
        System.out.println("Задача2");
        byte a = 67;
        short b = -159;
        short k = 27897;
        int c = 569;
        long d = 987678965549l;
        float i = 2.786f;
        double e = 27.12;
System.out.println("bute a ="+ a);
System.out.println("short b ="+ b);
System.out.println("short k =" +k);
System.out.println("int c ="+ c);
System.out.println("Long d ="+ d);
System.out.println("float i ="+ i);
System.out.println("double e ="+e);





        
    }

    private static void task3() {
        System.out.println("задача 3");
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeyevna = 27;
        byte EkaterinaAndreevna = 30;
        short paper = 480;
        int totalStudents = LyudmilaPavlovna + AnnaSergeyevna + EkaterinaAndreevna;
        System.out.println("всего учеников"+ totalStudents);
        int answer = paper / totalStudents;
        System.out.println("На каждого ученика расчитано "+ answer+ " листов бумаги");

        
    }

    private static void task4() {
        System.out.println("задача 4");
        byte bottlesMinute = 16 / 2;
        int Minute20 = bottlesMinute * 20;
        int day = bottlesMinute * 1440;
        int day3 = (1440 * 3) * bottlesMinute;
        int month = (1440 * 30) * bottlesMinute;
        System.out.println("За 20 минут машина изготовит "+ Minute20 +" бутылок");
        System.out.println("За день машина изготовит "+ day + " бутылок");
        System.out.println("За три дня машина изготовитт " + day3 +" бутылок");
        System.out.println(" за месяц машина изготовит " + month+ " бутылок");

    }

    private static void task5() {
        System.out.println("задача 5");
        byte paints = 120;
        byte white = 2;
        byte brown = 4;
        int totalColors = white + brown;
        int classes = paints / totalColors;
        int whiteNeed = classes * white;
        int brownNeed = classes * brown;
         System.out.println("В школе где " + classes +" классов, нужно "+ whiteNeed +" банок белой красски и "+ brownNeed+ " банок коричневой краски");
    }

    private static void task6() {
        System.out.println("задача 6");
        byte banana = 5;
        int bananaWeight = banana * 80;
        short milk = 200;
        int milkWeight = milk * 105;
        byte iceCream = 2;
        int allIceCream = iceCream * 100;
        byte egg = 4;
        int eggWeight = egg * 70;
        int weightGrams = bananaWeight + milkWeight + allIceCream + eggWeight;
        float weightKilo = weightGrams / 1000f;
        System.out.println(weightKilo+"кг");

        
    }

    private static void task7() {
        System.out.println("задача 7");
        byte kg = 7;
        float kgLoss = 250 / 1000f;
        float kgLoss1 = 500 / 1000f ;
        float days = kg / kgLoss ;
        float days1 = kg / kgLoss1 ;
        float answer = (days1+ days) / kg ;
        System.out.println(" в среднем понядобиться"+ answer+ "дней");

    }

    private static void task8() {
        System.out.println("задача 8");
       int Masha = 67760 ;
        int Denis = 83690 ;
        int Kristina = 76230 ;
        int Masha10 = Masha * 10 /100;
        int MashaSalary = Masha + Masha10;
        int Denis10 = Denis * 10 / 100;
        int DenisSalary = Denis + Denis10;
        int Kristina10 = Kristina * 10 /100;
        int KristinaSalary = Kristina + Kristina10;
        long annualIncomeM = Masha * 12;
        long annualIncomeD = Denis * 12;
        long annualIncomeK = Kristina * 12;
        long incomeIncreaseM = MashaSalary *12;
        long incomeIncreaseD = DenisSalary * 12;
        long incomeIncreaseK = KristinaSalary * 12;
        long differenceM = incomeIncreaseM - annualIncomeM;
        long differenceD = incomeIncreaseD - annualIncomeD;
        long differenceK = incomeIncreaseK -annualIncomeK;

        System.out.println("После поывшения зарплаты на 10 % Маша будет получать" + MashaSalary + ", Денис" + DenisSalary+ ", Кристина"+ KristinaSalary+" в месяц." +
                " Разница в годовом доходе у маши будет "+ incomeIncreaseM+ " у Дениса " + incomeIncreaseD+ ", а у Кристины " + incomeIncreaseK+ "");

    }


}