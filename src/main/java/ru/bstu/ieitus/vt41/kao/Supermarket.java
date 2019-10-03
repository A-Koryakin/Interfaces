package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class Supermarket extends Building{
    int NumberOfHalls;
    int NumberOfEntrances; //Количество входов

    public Supermarket(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Супермаркет");

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();

        System.out.print("  Введите количество этажей: ");
        FloorsNumber = scanner.nextInt();

        System.out.print("  Введите количество торговых залов: ");
        NumberOfHalls = scanner.nextInt();

        System.out.print("  Введите количество входов: ");
        NumberOfEntrances = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Свойства супермаркета\n" +
                "   Количество этажей: " + FloorsNumber + "\n" +
                "   Основной материал: " + PrimaryMaterial+ "\n" +
                "   Количество торговых залов: " + NumberOfHalls+ "\n" +
                "   Количество входов: " + NumberOfEntrances;
    }
}
