package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public abstract class Construction {
    int Height;
    int ExplotiationPeriod;

    public int getExplotiationPeriod() {
        return ExplotiationPeriod;
    }

    public abstract void init(Scanner scanner);
}
