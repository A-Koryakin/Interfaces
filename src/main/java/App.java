import ru.bstu.ieitus.vt41.kao.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int constrNum;
        System.out.print("Введите количество сооружений: ");
        constrNum = scanner.nextInt();

        ArrayList<Construction> constructions = new ArrayList<>();

        for (int i = 0; i < constrNum; i++) {
            int type;
            System.out.print("Введите тип сооружения: 1 - Здание, 2 - Супермаркет, 3 - Частный дом,\n" +
                    "4 - Многоквартирный дом, 5 - Путепровод, 6 - Мост, 7 - Тоннель: ");
            type = scanner.nextInt();

            switch (type) {
                case 1: {
                    System.out.println("Здание:");
                    Building building = new Building();
                    constructions.add(building);
                    break;
                }

                case 2: {
                    System.out.println("Супермаркет:");
                    Supermarket supermarket = new Supermarket();
                    constructions.add(supermarket);
                    break;
                }

                case 3: {
                    System.out.println("Частный дом:");
                    PrivateHouse privateHouse = new PrivateHouse();
                    constructions.add(privateHouse);
                    break;
                }

                case 4: {
                    System.out.println("Многоквартирный дом:");
                    ApartmentHouse apartmentHouse = new ApartmentHouse();
                    constructions.add(apartmentHouse);
                    break;
                }

                case 5: {
                    System.out.println("Путепровод:");
                    Overpass overpass = new Overpass();
                    constructions.add(overpass);
                    break;
                }

                case 6: {
                    System.out.println("Мост:");
                    Bridge bridge = new Bridge();
                    constructions.add(bridge);
                    break;
                }

                case 7: {
                    System.out.println("Тоннель:");
                    Tunnel tunnel = new Tunnel();
                    constructions.add(tunnel);
                    break;
                }
                default: {
                    System.out.println("Что-то пошло не так. Попробуйте ещё раз");
                    i--;
                    break;
                }
            }
        }

        /*String minExp = getMin(constructions).toString();*/

        System.out.println("Сооружение с минимальным сроком эксплуатации:");
        System.out.println(Collections.min(constructions));
    }
}
