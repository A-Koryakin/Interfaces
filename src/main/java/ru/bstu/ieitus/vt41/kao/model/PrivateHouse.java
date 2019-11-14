package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class PrivateHouse extends Building {
    protected Integer mRoomsNumber;
    protected Boolean mHasGarage;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("  Введите количество комнат: ");
        mRoomsNumber = scanner.nextInt();

        System.out.print("  Если есть гараж, введите true, иначе false: ");
        mHasGarage = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Частный дом:\n" +
                super.toString() +
                "   Количество комнат: " + mRoomsNumber + "\n" +
                "   Наличие гаража: " + mHasGarage;
    }
}
