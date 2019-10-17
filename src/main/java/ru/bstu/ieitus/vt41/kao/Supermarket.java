package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Supermarket extends Building {
    int numberOfHalls;
    int numberOfEntrances;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество торговых залов: ");
        numberOfHalls = scanner.nextInt();

        System.out.print("  Введите количество входов: ");
        numberOfEntrances = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Супермаркет:\n" +
                super.toString() +
                "   Количество торговых залов: " + numberOfHalls + "\n" +
                "   Количество входов: " + numberOfEntrances;
    }
}
