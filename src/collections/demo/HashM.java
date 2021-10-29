package collections.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashM implements ManageCollections {

    Map<String, String> hashMap = new HashMap<>();

    @Override
    public void addElement(String info) {
        System.out.println("Podaj klucz dla jakiego chcesz przypisac wprowadzoną wartość");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        hashMap.put(key, info);
        System.out.println("Dodano element o kluczu " + key + " i wartości " + info + " do HashMapy");
    }

    @Override
    public void removeElement(String info) {
        hashMap.remove(info);
    }

    @Override
    public void iterate() {
        System.out.println();
        for (Map.Entry<String, String> set : hashMap.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }
        System.out.println();
    }

    @Override
    public void showProperties() {
        System.out.println("W HashMapie możemy dodać takie same wartości dla róznych kluczy, jednak podanie tego samego klucza spowoduje nadpisanie jego wartości");
    }
}
