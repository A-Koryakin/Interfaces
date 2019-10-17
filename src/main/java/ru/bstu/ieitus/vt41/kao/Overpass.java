package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Overpass extends Construction {
    int length;

    public Overpass() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("  Введите срок эксплуатации: ");
        exploitationPeriod = scanner.nextInt();

        System.out.print("  Введите протяжённость: ");
        length = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        primaryMaterial = scanner.next();
    }

    @Override
    public int getExploitationPeriod() {
        return exploitationPeriod;
    }

    @Override
    public String toString() {
        return "   Срок эксплуатации: " + exploitationPeriod + "\n" +
                "   Протяжённость: " + length + "\n" +
                "   Основной материал: " + primaryMaterial + "\n";
    }
}
