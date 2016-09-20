package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class OverloadDemo1 {
    void test(){
        System.out.println("Параматры присутствуют");
    }
    //Перегружаемый метод проверяющий наличие
    //двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }

    //Прегружаемый метод проверяющий наличие
    // параметра типа double
    void test(double a){
        System.out.println("Внутренне преобразование при вызове test (double) a: " + a );
    }


}
