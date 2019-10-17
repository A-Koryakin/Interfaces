package ru.bstu.ieitus.vt41.kao;

import java.util.Scanner;

public abstract class Construction {
    String PrimaryMaterial;
    int ExploitationPeriod;

    public abstract void init(Scanner scanner);

    public abstract int getExploitationPeriod();
}
