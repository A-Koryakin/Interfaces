package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class ApartmentHouse extends Building {

    int ApartmentsNumber;
    int PorchsNumber;

    public ApartmentHouse(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Многоквартирный дом");

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();

        System.out.print("  Введите количество этажей: ");
        FloorsNumber = scanner.nextInt();

        System.out.print("  Введите количество квартир: ");
        ApartmentsNumber = scanner.nextInt();

        System.out.print("  Введите количество подъездов: ");
        PorchsNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Свойства многоквартирного дома\n" +
                "   Количество этажей: " + FloorsNumber + "\n" +
                "   Основной материал: " + PrimaryMaterial+ "\n" +
                "   Количество квартир: " + ApartmentsNumber+ "\n" +
                "   Количество подъездов: " + PorchsNumber;
    }
}
