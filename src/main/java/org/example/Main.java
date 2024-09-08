package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9: ");
        int number = sc.nextInt();
        String[] names = {"Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"};
        if (number >= 0 & number <=9) {
            System.out.println(number + " ---- " + names[number]);
        }
        else {
            System.out.println("Некорректный ввод ");
        }
    }
}