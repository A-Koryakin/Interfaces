package ru.bstu.ieitus.vt41.kao;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Scanner;

@EqualsAndHashCode(callSuper = true)
@Data
public class Building extends Construction {
    protected Integer mFloorsNumber;

    public Building() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    public void init(Scanner scanner) {

        System.out.print("  Введите срок эксплуатации: ");
        mExploitationPeriod = scanner.nextInt();

        System.out.print("  Введите количество этажей: ");
        mFloorsNumber = scanner.nextInt();

        System.out.print("  Введите основной материал: ");
        mPrimaryMaterial = scanner.next();
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
    public int compareTo(Construction o) {
        return this.mExploitationPeriod.compareTo(o.mExploitationPeriod);
    }
}
