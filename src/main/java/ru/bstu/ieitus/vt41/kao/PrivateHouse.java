package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class PrivateHouse extends Building {
    int roomsNumber;
    boolean hasGarage;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество комнат: ");
        roomsNumber = scanner.nextInt();

        System.out.print("  Если есть гараж, введите true, иначе false: ");
        hasGarage = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Частный дом:\n" +
                super.toString() +
                "   Количество комнат: " + roomsNumber + "\n" +
                "   Наличие гаража: " + hasGarage;
    }
}
