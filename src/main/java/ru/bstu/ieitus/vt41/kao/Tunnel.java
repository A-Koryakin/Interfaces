package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public class Tunnel extends Overpass {
    int Depth;

    public Tunnel(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Инициализация объекта Тоннель");

        System.out.print("  Введите протяжённость: ");
        Length = scanner.nextInt();

        System.out.print("  Введите срок эксплуатации: ");
        ExplotiationPeriod = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();

        System.out.print("  Введите глубину: ");
        Depth = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Свойства Тоннеля \n" +
                "   Протяжённость: " + Length + "\n" +
                "   Глубина: " + Depth + "\n" +
                "   Основной материал: " + PrimaryMaterial;
    }
}
