import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstnumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondnumber = new Scanner(System.in).nextInt();
        System.out.println("Сумма чисел: "+ (firstnumber+secondnumber));
        System.out.println("Разница чисел: "+ (firstnumber-secondnumber));
        System.out.println("Произведение чисел: "+(firstnumber*secondnumber));
        System.out.println("Частное чисел: "+ ((double)firstnumber/secondnumber));
    }
}
