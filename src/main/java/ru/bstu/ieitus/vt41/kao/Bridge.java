package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Bridge extends Overpass {
    int height;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите высоту: ");
        height = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Мост: \n" +
                super.toString() +
                "   Высота: " + height + "\n";
    }
}
