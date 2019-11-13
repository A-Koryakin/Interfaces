package ru.bstu.ieitus.vt41.kao;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class ApartmentHouse extends Building {
    protected Integer mApartmentsNumber;
    protected Integer mPorchesNumber;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество квартир: ");
        mApartmentsNumber = scanner.nextInt();

        System.out.print("  Введите количество подъездов: ");
        mPorchesNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Многоквартирный дом\n" +
                super.toString() +
                "   Количество квартир: " + mApartmentsNumber + "\n" +
                "   Количество подъездов: " + mPorchesNumber;
    }
}
