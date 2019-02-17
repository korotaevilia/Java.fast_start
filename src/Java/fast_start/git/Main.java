package Java.fast_start.git;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите Операцию");
	System.out.println("1.Сложение");
	System.out.println("2.Вычитание");
	System.out.println("3.Умножение");
	System.out.println("4.Деление");
	Scanner scanner = new Scanner (System.in);
	int operation = scanner.nextInt();
	System.out.println("Введите первое число");
	float a = scanner.nextInt();
	System.out.println("Введите второе число");
	float b = scanner.nextInt();
	float result = 0;
	if(operation == 1) {
	    result = a + b;
    } else if(operation == 2) {
	    result = a - b;
    } else if(operation == 3) {
	    result = a * b;
    } else if(operation == 4) {
	    result = a / b;
    } else {
		System.out.println("Необходимо ввести правильный код операции");
	}
	System.out.println("Результат = " + result);
    }
}
