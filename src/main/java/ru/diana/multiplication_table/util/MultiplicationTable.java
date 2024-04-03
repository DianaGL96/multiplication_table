package ru.diana.multiplication_table.util;

public class MultiplicationTable {
    public void startMultiplication(int number) {
        if (number < 2 || number > 5) {
            System.out.println("Ошибка! Вы ввели число вне допустимого диапазона.");
        }
        else {
            System.out.println("Таблица умножения для числа " + number + "\n");
            for (int i = 1; i <= 10; i++) {
                    int product = number * i;
                    System.out.println(i + " * " + number + " = " + product);
            }
        }
    }
}
