package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class Bridge extends Overpass {

    int Height;

    public Bridge(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Мост");

        System.out.print("  Введите протяжённость: ");
        Length = scanner.nextInt();

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();

        System.out.print("  Введите высоту: ");
        Height = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Свойства Моста \n" +
                "   Протяжённость: " + Length + "\n" +
                "   Высота: " + Height + "\n" +
                "   Основной материал: " + PrimaryMaterial;
    }
}
