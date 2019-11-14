package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.bstu.ieitus.vt41.kao.utills.ScanningLoop;

import java.util.NoSuchElementException;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class PrivateHouse extends Building {
    protected Integer mRoomsNumber;
    protected Boolean mHasGarage;

    @Override
    public void init(Scanner scanner) throws NullPointerException, NoSuchElementException, IllegalStateException{
        if(scanner == null)
        {
            throw new NullPointerException("Scanner не был определён");
        }

        super.init(scanner);

        ScanningLoop scanningLoop = new ScanningLoop(scanner);

        try {
            System.out.print("  Введите количество комнат: ");
            mRoomsNumber = scanningLoop.scanNotNullInt();

            System.out.print("  Если есть гараж, введите Y, Д или 1, иначе N, Н или 0: ");
            mHasGarage = scanningLoop.scanBooleanFromString();
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (IllegalStateException e){
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Частный дом:\n" +
                super.toString() +
                "   Количество комнат: " + mRoomsNumber + "\n" +
                "   Наличие гаража: " + mHasGarage;
    }
}
