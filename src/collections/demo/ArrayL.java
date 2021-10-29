package collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayL implements ManageCollections {

    List<String> arrayList = new ArrayList<>();

    @Override
    public void addElement(String info) {
        arrayList.add(info);
        System.out.println("Dodano element " + info + " do ArrayListy");
    }

    @Override
    public void removeElement(String info) {
        arrayList.remove(info);
    }

    @Override
    public void iterate() {
        System.out.println();
        arrayList.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void showProperties() {
        System.out.println("W ArrayLiście możemy dodawać te same elementy kilkukrotnie i mają one swoje indeksy, lecz przy usuwaniu elementu usunięty zostanie pierwszy w szeregu");
    }
}
