package collections.demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedL implements ManageCollections{

    List<String> linkedList = new LinkedList<>();

    @Override
    public void addElement(String info) {
        linkedList.add(info);
        System.out.println("Dodano element " + info + "  do LinkedListy");
    }

    @Override
    public void removeElement(String info) {
        linkedList.remove(info);
    }

    @Override
    public void iterate() {
        System.out.println();
        linkedList.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void showProperties() {
        System.out.println("W LinkedLiście możemy dodawać te same elementy kilkukrotnie i mają one swoje indeksy, lecz przy usuwaniu elementu usunięty zostanie pierwszy w szeregu");
    }
}
