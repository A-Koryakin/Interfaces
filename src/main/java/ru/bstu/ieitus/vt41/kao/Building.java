package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class Building extends Construction {

    int FloorsNumber;

    public Building(Scanner scanner)
    {
        init(scanner);
    }

    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Здание");
        System.out.print("  Введите количество этажей: ");
        FloorsNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Количество этажей: " + FloorsNumber;
    }
}
