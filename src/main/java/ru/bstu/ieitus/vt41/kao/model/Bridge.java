package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.bstu.ieitus.vt41.kao.utills.ScanningLoop;

import java.util.NoSuchElementException;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Bridge extends Overpass {
    protected Integer mHeight;

    @Override
    public void init(Scanner scanner) throws NullPointerException, NoSuchElementException, IllegalStateException{
        if(scanner == null)
        {
            throw new NullPointerException("Scanner не был определён");
        }

        super.init(scanner);

        ScanningLoop scanningLoop = new ScanningLoop(scanner);

        try{
            System.out.print("  Введите высоту: ");
            mHeight = scanningLoop.scanNotNullInt();
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
        return "Мост: \n" +
                super.toString() +
                "   Высота: " + mHeight + "\n";
    }
}
