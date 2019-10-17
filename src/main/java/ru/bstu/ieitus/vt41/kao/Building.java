package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Building extends Construction {
    int FloorsNumber;

    public Building() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    public void init(Scanner scanner) {

        System.out.print("  Введите срок эксплуатации: ");
        ExploitationPeriod = scanner.nextInt();

        System.out.print("  Введите количество этажей: ");
        FloorsNumber = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        PrimaryMaterial = scanner.next();
    }

    @Override
    public int getExploitationPeriod() {
        return ExploitationPeriod;
    }

    @Override
    public String toString() {
        return  "   Срок эксплуатации: " + ExploitationPeriod + "\n" +
                "   Количество этажей: " + FloorsNumber + "\n" +
                "   Основной материал: " + PrimaryMaterial + "\n";
    }
}
