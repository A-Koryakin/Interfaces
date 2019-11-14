package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Supermarket extends Building {
    protected Integer mNumberOfHalls;
    protected Integer mNumberOfEntrances;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество торговых залов: ");
        mNumberOfHalls = scanner.nextInt();

        System.out.print("  Введите количество входов: ");
        mNumberOfEntrances = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Супермаркет:\n" +
                super.toString() +
                "   Количество торговых залов: " + mNumberOfHalls + "\n" +
                "   Количество входов: " + mNumberOfEntrances;
    }
}
