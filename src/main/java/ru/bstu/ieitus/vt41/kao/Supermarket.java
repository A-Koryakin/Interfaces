package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Supermarket extends Building {
    int NumberOfHalls;
    int NumberOfEntrances;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество торговых залов: ");
        NumberOfHalls = scanner.nextInt();

        System.out.print("  Введите количество входов: ");
        NumberOfEntrances = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Супермаркет:\n" +
                super.toString() +
                "   Количество торговых залов: " + NumberOfHalls + "\n" +
                "   Количество входов: " + NumberOfEntrances;
    }
}
