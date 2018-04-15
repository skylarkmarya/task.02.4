import javafx.collections.transformation.SortedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List <Stationary> newBie = new ArrayList<>();
        newBie.add( new Stationary("Marker", 104.35));
        newBie.add( new Stationary("Clip", 6.25));
        newBie.add( new Stationary("Album", 404.35));
        newBie.add( new Stationary("Glue", 60.35));
        newBie.add( new Stationary("Pen", 50.35));
        newBie.add( new Stationary("Pencil", 73.45));
        newBie.add( new Stationary("Clip", 5.35));
        newBie.add( new Stationary("Clip", 10.15));

        System.out.println("Sort with name:");
        Collections.sort(newBie, Stationary.CAMPARE_BY_NAME);
        for (Object n: newBie) {
            System.out.println(n);
        }

        System.out.println();

        System.out.println("Sort with name and price:");
        Collections.sort(newBie, Stationary.CAMPARE_BY_NAME_PRICE);
        for (Object n: newBie) {
            System.out.println(n);
        }
    }
}

