package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Bridge extends Overpass {
    int Height;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите высоту: ");
        Height = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Мост: \n" +
                super.toString() +
                "   Высота: " + Height + "\n";
    }
}
