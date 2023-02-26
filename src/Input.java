import java.util.Scanner;

public class Input {                                    // String импортируется из java.lang автоматически
                                                        // Чтобы восользоваться Scanner необходимо импортировать java.util.Scanner
    public static void main(String[] args){
                                                        // Новые объекты класса String создаются только так
        Scanner s = new Scanner(System.in);             // System.in - стандартный набор входных данных
        System.out.println("Введите что-нибудь");
        String string = s.nextLine();
        System.out.println("Ваше что-нибудь: "+ string);
        System.out.println("Введите целое число");
        int num = s.nextInt();
        System.out.println("Вы ввели "+ num);

    }
}
