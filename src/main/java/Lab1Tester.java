import ru.bstu.ieitus.vt41.kao.Building;

import java.util.Scanner;

public class Lab1Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Building building = new Building(scanner);
        System.out.println(building.toString());
    }
}
