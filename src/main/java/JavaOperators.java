public class JavaOperators {
    public static void main(String[] args) {
        //простые операторы
        int x = 30;
        int y = 40;
        int z = -50;
        int t = -50;
        System.out.println("Простые операторы:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - z = " + (x - z));
        System.out.println("xy = " + (x * y));
        System.out.println("z/y = " + (z / y));
        System.out.println("z % x = " + (z % x));
        System.out.println("++x = " + (++x));
        System.out.println("--y = " + (--y));

        //логические операторы
        System.out.println("Логические операторы:");
        System.out.println("x != y: " + (x != y));
        System.out.println("t == z: " + (t == z));
        System.out.println("x > y : " + (x > y));
        System.out.println("t < z : " + (t < z));
        System.out.println("t <= z: " + (t <= z));
        System.out.println("x >= y: " + (x >= y));

        //переполнение
        System.out.println("Переполнение:");
        int maxInt = Integer.MAX_VALUE;
        int Result = maxInt + 2;
        System.out.println(Result);

        //вычисления комбинаций типов данных (int и double)
        System.out.println("Комбинация типов данных:");
        double a = 4.5;
        int b = 3;
        System.out.println("(a + b) = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("ab = " + a * b);
        System.out.println("a/b = " + a / b);
        System.out.println("a + b = " + a + b);


    }
}
