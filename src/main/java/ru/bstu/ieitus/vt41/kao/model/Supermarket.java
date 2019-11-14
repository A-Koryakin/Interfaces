package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.bstu.ieitus.vt41.kao.utills.ScanningLoop;

import java.util.NoSuchElementException;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Supermarket extends Building {
    protected Integer mNumberOfHalls;
    protected Integer mNumberOfEntrances;

    @Override
    public void init(Scanner scanner) throws NullPointerException, NoSuchElementException, IllegalStateException{
        if(scanner == null)
        {
            throw new NullPointerException("Scanner не был определён");
        }

        super.init(scanner);

        ScanningLoop scanningLoop = new ScanningLoop(scanner);

        try{
            System.out.print("  Введите количество торговых залов: ");
            mNumberOfHalls = scanningLoop.scanNotNullInt();

            System.out.print("  Введите количество входов: ");
            mNumberOfEntrances = scanningLoop.scanNotNullInt();
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
        return "Супермаркет:\n" +
                super.toString() +
                "   Количество торговых залов: " + mNumberOfHalls + "\n" +
                "   Количество входов: " + mNumberOfEntrances;
    }
}
