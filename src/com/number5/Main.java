package com.number5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вместимость сейфа: ");
        Safe safe = new Safe(scanner.nextInt());
        ArrayList<Thing> things = new ArrayList<Thing>();
        System.out.print("Введите количество объектов: ");
        int n = scanner.nextInt();
        System.out.println("Введите объекты (сначала объем, потом цена):");
        for (int i = 0; i < n; i++) {
            things.add(new Thing(scanner.nextInt(), scanner.nextInt()));
        }
        safe.fillThings(things);
        safe.print();
    }
}
/*
Для большего понимания построенной абстракции:
Существует класс контейнера, который имеет свой объем и набор объектов, которые можно туда поместить
Естественно наш сейф является доработаным контейнером
Для решения задачи используется динамическое моделирование, в ходе которого мы по факту постепенно увеличиваем
максимальную вместимость контейнера от 0 до вместимости сейфа, постепенно заполняя его объектами
 */

