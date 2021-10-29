package collections.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeS implements ManageCollections{

    Set<String> treeSet = new TreeSet<>();

    @Override
    public void addElement(String info) {
    treeSet.add(info);
        System.out.println("Dodano element  " + info + " do TreeSetu");

    }

    @Override
    public void removeElement(String info) {
        treeSet.remove(info);
    }

    @Override
    public void iterate() {
        System.out.println();
        treeSet.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void showProperties() {
        System.out.println("W HashSecie nie możemy dodać drugiego takiego samego elementu");
    }
}
