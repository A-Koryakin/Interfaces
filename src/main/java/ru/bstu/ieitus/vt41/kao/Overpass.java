package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class Overpass extends Construction{
    int Length;

    public Overpass(Scanner scanner){
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Путепровод");

        System.out.print("  Введите протяжённость: ");
        Length = scanner.nextInt();

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();
    }

    @Override
    public String toString() {
        return "Свойства Путепровода \n" +
                "   Протяжённость: " + Length + "\n" +
                "   Основной материал: " + PrimaryMaterial;
    }
}
