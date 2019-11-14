package ru.bstu.ieitus.vt41.kao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
    public void init(Scanner scanner) {
        System.out.print("  Введите срок эксплуатации: ");
        mExploitationPeriod = scanner.nextInt();

        System.out.print("  Введите протяжённость: ");
        mLength = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        mPrimaryMaterial = scanner.next();
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
    public int compareTo(Construction o) {
         return this.mExploitationPeriod.compareTo(o.mExploitationPeriod);
    }
}
