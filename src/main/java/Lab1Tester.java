import ru.bstu.ieitus.vt41.kao.*;

import java.util.Scanner;

public class Lab1Tester {
    public static Construction getMin(Construction[] constructions) {
        Construction construction = null;
        int min = 2000;
        for (Construction constr : constructions) {
            if (constr.getExplotiationPeriod() < min) {
                construction = constr;
                min = constr.getExplotiationPeriod();
            }
        }
        return construction;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int constrNum;
        System.out.print("Введите количество сооружений: ");
        constrNum = scanner.nextInt();

        Construction[] constructions = new Construction[constrNum];

        for (int i = 0; i < constrNum; i++) {
            int type;
            System.out.print("Введите тип сооружения: ");
            type = scanner.nextInt();

            switch (type) {

                case 1: {
                    Building building = new Building(scanner);
                    constructions[i] = building;
                    break;
                }

                case 2: {
                    Supermarket supermarket = new Supermarket(scanner);
                    constructions[i] = supermarket;
                    break;
                }

                case 3: {
                    PrivateHouse privateHouse = new PrivateHouse(scanner);
                    constructions[i] = privateHouse;
                    break;
                }

                case 4: {
                    ApartmentHouse apartmentHouse = new ApartmentHouse(scanner);
                    constructions[i] = apartmentHouse;
                    break;
                }

                case 5: {
                    Overpass overpass = new Overpass(scanner);
                    constructions[i] = overpass;
                    break;
                }

                case 6: {
                    Bridge bridge = new Bridge(scanner);
                    constructions[i] = bridge;
                    break;
                }

                case 7: {
                    Tunnel tunnel = new Tunnel(scanner);
                    constructions[i] = tunnel;
                    break;
                }
                default: {
                    System.out.println("Что-то пошло не так. Попробуйте ещё раз");
                    i--;
                    break;
                }
            }
        }

        String minExp = getMin(constructions).toString();

        System.out.println("Сооружение с минимальным сроком эксплуатации:");
        System.out.println(minExp);
    }
}
