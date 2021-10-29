package collections.demo;

import java.util.HashSet;
import java.util.Set;

public class HashS implements ManageCollections {

    Set<String> hashSet = new HashSet<>();

    @Override
    public void addElement(String info) {
        hashSet.add(info);
        System.out.println("Dodano element " + info + "  do HashSetu");
    }

    @Override
    public void removeElement(String info) {
        hashSet.remove(info);
    }

    @Override
    public void iterate() {
        System.out.println();
        hashSet.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void showProperties() {
        System.out.println("W HashSecie nie możemy dodać drugiego takiego samego elementu");
    }
}
