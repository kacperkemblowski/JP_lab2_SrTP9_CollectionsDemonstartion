package collections.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeM implements ManageCollections {

    Map<String, String> treeMap = new TreeMap<>();

    @Override
    public void addElement(String info) {
        System.out.println("Podaj klucz dla jakiego chcesz przypisac wprowadzoną wartość");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        treeMap.put(key, info);
        System.out.println("Dodano element o kluczu " + key + " i wartości " + info + " do TreeMapy");
    }

    @Override
    public void removeElement(String info) {
        treeMap.remove(info.toString());
    }

    @Override
    public void iterate() {
        System.out.println();
        for (Map.Entry<String, String> set : treeMap.entrySet()) {
            System.out.println(set.getKey() + " -> " + set.getValue());
        }
        System.out.println();
    }

    @Override
    public void showProperties() {
        System.out.println("W TreeMapie możemy dodać takie same wartości dla róznych kluczy, jednak podanie tego samego klucza spowoduje nadpisanie jego wartości");
    }
}
