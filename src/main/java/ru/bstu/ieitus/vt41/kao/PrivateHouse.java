package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class PrivateHouse extends Building {
    int RoomsNumber;
    boolean HasGarage;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество комнат: ");
        RoomsNumber = scanner.nextInt();

        System.out.print("  Если есть гараж, введите true, иначе false: ");
        HasGarage = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Частный дом:\n" +
                super.toString() +
                "   Количество комнат: " + RoomsNumber + "\n" +
                "   Наличие гаража: " + HasGarage;
    }
}
