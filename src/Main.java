import Task_1_2_3.User;
import Task_1_2_3.User2;
import Task_1_2_3.User3;
import Task_7_8.GenericMatrix;
import Task_7_8.MinMax;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("-Задание 1-");
        User u1 = new User("АБВ", "123");
        u1.createQuery();
        User.Query q1 = u1.new Query();
        q1.printToLog();
        User.Query q2 = new User("asd", "999").new Query();
        q2.printToLog();
        // Задание 2
        System.out.println("-Задание 2-");
        User2 u2 = new User2("ддд", "ooo");
        u2.createQuery2();
        // Задание 3
        System.out.println("-Задание 3-");
        User3.Query3 q3 = new User3.Query3("FFF", "555");
        q3.printToLog();
        // Задание 4
        System.out.println("-Задание 4-");
        Printer p1 = new Printer() {
            @Override
            public void print() {
                System.out.println("Вывод анонимный");
            }
        };
        p1.print();
        // Задание 5
        System.out.println("-Задание 5-");
        Food f1 = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str + " Аноноимно");
            }
        };
        f1.prepare(cookable, "Готовим");
        // Задание 6
        System.out.println("-Задание 6-");
        Animal animal1 = new Animal();
        Task6 test6 = new Task6<>(1, animal1, 3 );
        test6.showTypes();
        System.out.println("Значение T: " + test6.getObT());
        System.out.println("Значение V: " + test6.getObV());
        System.out.println("Значение K: " + test6.getObK());
        // Задание 7
        System.out.println("-Задание 7-");
        Integer[][] matrix1 = {{1, 1, 1}, {7, 3, 19}, {-1, 9, 0}};
        Double[][] matrix2 = {{7.1, 8.8, 9.6}, {1.9, 2.2, 3.2}, {-1.0, 11.22, 5.1}};
        Integer num = 5;
        System.out.println("Матрица №1");
        GenericMatrix.printMatrix(matrix1);
        System.out.println("Матрица №2");
        GenericMatrix.printMatrix(matrix2);
        System.out.println("Сложенме матриц");
        GenericMatrix matrix11 = new GenericMatrix(matrix1);
        Double[][] matrix111 = matrix11.sumMatrix(matrix2);
        GenericMatrix.printMatrix(matrix111);
        // Задание 8
        System.out.println("-Задание 8-");
        MinMax matrix3 =  new MinMax<>(new Integer[][]{{1, 1, 1}, {7, 3, 19}, {-1, 9, 0}});
        System.out.println(matrix3.Max());
        System.out.println(matrix3.Min());
        // Задание 9
        System.out.println("-Задание 9-");
        System.out.println(Калькулятор.add(5, 2.1));
        System.out.println(Калькулятор.multiply(5, 2.1));
        System.out.println(Калькулятор.divide(17, 4.1));
        System.out.println(Калькулятор.subtraction(5, 2.1));
    }
}


