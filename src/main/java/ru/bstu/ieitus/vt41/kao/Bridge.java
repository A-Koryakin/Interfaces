package ru.bstu.ieitus.vt41.kao;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Bridge extends Overpass {
    protected Integer mHeight;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите высоту: ");
        mHeight = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Мост: \n" +
                super.toString() +
                "   Высота: " + mHeight + "\n";
    }
}
