Вариант 1
Создать абстрактный класс Construction (сооружение)
public abstract void init(Scanner scanner) // считывание параметров с консоли
public int getExploitationPeriod(); // возвращает срок эксплуатации сооружения
public String toString() // возвращается состояние объекта в виде строки
// (определяется только в наследниках, т.к.
определен в
// Object)
Построить иерархию классов:
Сооружение → Здание
→ Супермаркет
→ Частный дом
→ Многоквартирный дом
→ Путепроводное сооружение
→ Мост
→ Туннель
Написать программу, которая:1) Считывает с консоли количество сооружений.
2) В цикле считывает параметры. Сначала спрашивается тип сооружения и создается
объект нужного класса.
Затем у объекта вызывается метод init() и вводятся характеристики объекта (основной
материал, из которого сделано сооружение, срок экплуатации и т.д.).
Метод init() разный у разных классов.
3) Считанные объекты помещаются в массив.
4) Ищется сооружение с минимальным сроком эксплуатации и выводится на экран (вывод
через toString())