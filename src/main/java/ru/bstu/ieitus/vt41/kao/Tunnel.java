package ru.bstu.ieitus.vt41.kao;

import lombok.Data;

import java.util.Scanner;

public @Data class Tunnel extends Overpass {
    int Depth;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите глубину: ");
        Depth = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Тоннель: \n" +
                super.toString() +
                "   Глубина: " + Depth;
    }
}
