package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public abstract class Construction implements Comparable<Construction> {
    protected String mPrimaryMaterial;
    protected Integer mExploitationPeriod;

    public abstract void init(Scanner scanner);

    public abstract int getExploitationPeriod(); //По заданию к лабораторной
}
