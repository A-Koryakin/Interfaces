import ru.bstu.ieitus.vt41.kao.exceptions.IllegalConstructionTypeNumber;
import ru.bstu.ieitus.vt41.kao.model.Construction;
import ru.bstu.ieitus.vt41.kao.enums.ConstructionType;
import ru.bstu.ieitus.vt41.kao.utills.ScanningLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScanningLoop scanningLoop = new ScanningLoop(scanner);
        int constrNum; //количество сооружений
        ArrayList<Construction> constructions = new ArrayList<>();

        System.out.println("Доступные типы сооружений:");
        System.out.print(ConstructionType.show());

        System.out.print("Введите количество сооружений: ");
        constrNum = scanningLoop.scanInt();

        for (int i = 0; i < constrNum; i++) {
            System.out.print("Введите номер типа сооружения: ");
            ConstructionType constructionType;
            while (true)
            {
                try {
                    int type = scanningLoop.scanInt();
                    constructionType = ConstructionType.getByIndex(type);
                    break;
                }
                catch (IllegalConstructionTypeNumber e){
                    System.out.print("Введённый номер не соответсвует ни одному из типов, попробуйте ещё раз: ");
                }
                catch (NoSuchElementException | IllegalStateException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }

            constructions.add(constructionType.create());
        }

        if(constrNum != 0)
        {
            System.out.println("Сооружение с минимальным сроком эксплуатации:");
            System.out.println(Collections.min(constructions));
        }
    }
}
