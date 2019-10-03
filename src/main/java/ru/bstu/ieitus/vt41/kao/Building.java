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

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();
    }

    @Override
    public String toString() {
        return "Свойства здания \n" +
                "   Количество этажей: " + FloorsNumber + "\n" +
                "   Основной материал: " + PrimaryMaterial;
    }
}
