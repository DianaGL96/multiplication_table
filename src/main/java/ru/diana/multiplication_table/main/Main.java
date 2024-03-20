package ru.diana.multiplication_table.main;

import ru.diana.multiplication_table.util.MultiplicationTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 2 до 5 для вывода таблицы умножения: ");
        int number = scanner.nextInt();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.startMultiplication(number);
    }
}
