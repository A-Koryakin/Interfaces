package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.bstu.ieitus.vt41.kao.utills.ScanningLoop;

import java.util.NoSuchElementException;
import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Building extends Construction {
    protected Integer mFloorsNumber;

    public Building() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    public void init(Scanner scanner) throws NullPointerException, NoSuchElementException, IllegalStateException{
        if(scanner == null)
        {
            throw new NullPointerException("Scanner не был определён");
        }

        ScanningLoop scanningLoop = new ScanningLoop(scanner);

        try {
            System.out.print("  Введите срок эксплуатации: ");
            mExploitationPeriod = scanningLoop.scanNotNullInt();

            System.out.print("  Введите количество этажей: ");
            mFloorsNumber = scanningLoop.scanNotNullInt();

            System.out.print("  Введите основной материал: ");
            mPrimaryMaterial = scanner.next();
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException("Сканеру не удалось распознать вводимые символы " + e.getMessage());
        }
        catch (IllegalStateException e){
            throw new IllegalStateException("Сканер не может сейчас отработать " + e.getMessage());
        }
    }

    @Override
    public int getExploitationPeriod() {
        return mExploitationPeriod;
    }

    @Override
    public String toString() {
        return  "   Срок эксплуатации: " + mExploitationPeriod + "\n" +
                "   Количество этажей: " + mFloorsNumber + "\n" +
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
