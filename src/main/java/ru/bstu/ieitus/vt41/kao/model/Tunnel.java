package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Tunnel extends Overpass {
    protected Integer mDepth;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите глубину: ");
        mDepth = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Тоннель: \n" +
                super.toString() +
                "   Глубина: " + mDepth;
    }
}
