package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class PrivateHouse extends Building {
    int RoomsNumber;
    boolean HasGarage;

    public PrivateHouse(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Частный дом");

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();

        System.out.print("  Введите количество этажей: ");
        FloorsNumber = scanner.nextInt();

        System.out.print("  Введите количество комнат: ");
        RoomsNumber = scanner.nextInt();

        System.out.print("  Если есть гараж, введите true, иначе false: ");
        HasGarage = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Свойства частного дома\n" +
                "   Количество этажей: " + FloorsNumber + "\n" +
                "   Основной материал: " + PrimaryMaterial + "\n" +
                "   Количество комнат: " + RoomsNumber + "\n" +
                "   Наличие гаража: " + HasGarage;
    }
}
