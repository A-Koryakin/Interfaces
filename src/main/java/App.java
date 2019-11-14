import ru.bstu.ieitus.vt41.kao.model.Construction;
import ru.bstu.ieitus.vt41.kao.enums.ConstructionType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int constrNum;

        ArrayList<Construction> constructions = new ArrayList<>();

        System.out.println("Доступные типы сооружений:");
        System.out.print(ConstructionType.show());

        System.out.print("Введите количество сооружений: ");
        constrNum = scanner.nextInt();

        for (int i = 0; i < constrNum; i++) {
            int type;
            System.out.print("Введите номер типа сооружения: ");
            type = scanner.nextInt();
            constructions.add(ConstructionType.getByIndex(type).create());
        }

        System.out.println("Сооружение с минимальным сроком эксплуатации:");
        System.out.println(Collections.min(constructions));
    }
}
