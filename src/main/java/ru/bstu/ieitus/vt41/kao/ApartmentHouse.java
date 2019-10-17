package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class ApartmentHouse extends Building {
    int ApartmentsNumber;
    int PorchesNumber;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество квартир: ");
        ApartmentsNumber = scanner.nextInt();

        System.out.print("  Введите количество подъездов: ");
        PorchesNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Многоквартирный дом\n" +
                super.toString() +
                "   Количество квартир: " + ApartmentsNumber + "\n" +
                "   Количество подъездов: " + PorchesNumber;
    }
}
