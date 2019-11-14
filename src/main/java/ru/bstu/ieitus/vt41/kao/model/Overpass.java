package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.bstu.ieitus.vt41.kao.utills.ScanningLoop;

import java.util.NoSuchElementException;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Overpass extends Construction {
    protected Integer mLength;

    public Overpass() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) throws NullPointerException, NoSuchElementException, IllegalStateException{
        if(scanner == null)
        {
            throw new NullPointerException("Scanner не был определён");
        }

        ScanningLoop scanningLoop = new ScanningLoop(scanner);

        try {
            System.out.print("  Введите срок эксплуатации: ");
            mExploitationPeriod = scanningLoop.scanNotNullInt();

            System.out.print("  Введите протяжённость: ");
            mLength = scanningLoop.scanNotNullInt();

            System.out.print("  Введите основной материал: ");
            mPrimaryMaterial = scanner.next();
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (IllegalStateException e){
            throw new IllegalStateException(e.getMessage());
        };
    }

    @Override
    public int getExploitationPeriod() {
        return mExploitationPeriod;
    }

    @Override
    public String toString() {
        return "   Срок эксплуатации: " + mExploitationPeriod + "\n" +
                "   Протяжённость: " + mLength + "\n" +
                "   Основной материал: " + mPrimaryMaterial + "\n";
    }

    @Override
    public int compareTo(Construction o) throws NullPointerException{
        if (o == null)
        {
            throw new NullPointerException("Строение для сравнения не было определено");
        }

        return this.mExploitationPeriod.compareTo(o.mExploitationPeriod);
    }
}
