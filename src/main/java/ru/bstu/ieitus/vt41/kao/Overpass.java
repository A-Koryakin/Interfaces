package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Overpass extends Construction {
    int Length;

    public Overpass() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("  Введите срок эксплуатации: ");
        ExploitationPeriod = scanner.nextInt();

        System.out.print("  Введите протяжённость: ");
        Length = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();
    }

    @Override
    public int getExploitationPeriod() {
        return ExploitationPeriod;
    }

    @Override
    public String toString() {
        return "   Срок эксплуатации: " + ExploitationPeriod + "\n" +
                "   Протяжённость: " + Length + "\n" +
                "   Основной материал: " + PrimaryMaterial + "\n";
    }
}
