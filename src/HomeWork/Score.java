package HomeWork;

/**
 * Created by Евгений on 13.09.2016.
 */
public class Score {
    public static void main(String args[]){
        System.out.println("Самый дешевый магазин!!!");
        int sum = 550;
        int discount;

        if(sum > 500 && sum <=1000)
        discount = 10;
        else if(sum >1000 && sum <=2000)
            discount = 15;
        else if (sum>2000)
            discount = 20;
        else discount = 0;
        System.out.println("Ваша скидка составляет : " + discount +"%");
        System.out.println("Сумма со скидкой " + (sum - (sum*discount)/100)+"$ USD");


    }
}
