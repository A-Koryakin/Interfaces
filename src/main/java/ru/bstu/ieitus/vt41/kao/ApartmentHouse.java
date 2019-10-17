package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class ApartmentHouse extends Building {
    int apartmentsNumber;
    int porchesNumber;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество квартир: ");
        apartmentsNumber = scanner.nextInt();

        System.out.print("  Введите количество подъездов: ");
        porchesNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Многоквартирный дом\n" +
                super.toString() +
                "   Количество квартир: " + apartmentsNumber + "\n" +
                "   Количество подъездов: " + porchesNumber;
    }
}
