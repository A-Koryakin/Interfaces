package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Building extends Construction {
    int floorsNumber;

    public Building() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    public void init(Scanner scanner) {

        System.out.print("  Введите срок эксплуатации: ");
        exploitationPeriod = scanner.nextInt();

        System.out.print("  Введите количество этажей: ");
        floorsNumber = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        primaryMaterial = scanner.next();
    }

    @Override
    public int getExploitationPeriod() {
        return exploitationPeriod;
    }

    @Override
    public String toString() {
        return  "   Срок эксплуатации: " + exploitationPeriod + "\n" +
                "   Количество этажей: " + floorsNumber + "\n" +
                "   Основной материал: " + primaryMaterial + "\n";
    }
}
