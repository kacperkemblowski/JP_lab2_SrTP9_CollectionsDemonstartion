package collections.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz kolekcję na której chcesz operować: ");
        System.out.println("1. HashSet");
        System.out.println("2. TreeSet");
        System.out.println("3. ArrayList");
        System.out.println("4. LinkedList");
        System.out.println("5. HashMap");
        System.out.println("6. TreeMap");
        System.out.println("Inna opcja -> wyjście");
        System.out.println("====================================");

        switch (scanner.nextInt()) {
            case 1: {
                operateOn(new HashS());
            }
            break;
            case 2: {
                operateOn(new TreeS());
            }
            break;
            case 3: {
                operateOn(new ArrayL());
            }
            break;
            case 4: {
                operateOn(new LinkedL());
            }
            break;
            case 5: {
                operateOn(new HashM());
            }
            break;
            case 6: {
                operateOn(new TreeM());
            }
            break;
            default:
                System.exit(0);

                System.out.println();
        }
    }

    static void operateOn(ManageCollections manageCollections) {
        Scanner scanner = new Scanner(System.in);
        String info;
        int choice;
        while (true) {
            System.out.println("====================================");
            System.out.println("Wybierz operację do wykonania: ");
            System.out.println("1. Dodaj element");
            System.out.println("2. Usuń element");
            System.out.println("3. Przeiteruj po kolekcji");
            System.out.println("4. Wyświetl informacje o wybranej kolekcji danych");
            System.out.println("Inny numer -> wyjście\n");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("====================================");


            switch (choice) {
                case 1: {
                    System.out.println("Wprowadź element (String) do dodania do kolekcji: ");
                    info = scanner.nextLine();
                    manageCollections.addElement(info);
                }
                break;

                case 2: {
                    System.out.println("Wprowadź element (lub klucz w przypadku mapy) do usunięcia z kolekcji: ");
                    info = scanner.nextLine();
                    manageCollections.removeElement(info);
                }
                break;

                case 3: {
                    manageCollections.iterate();
                }
                break;

                case 4: {
                    manageCollections.showProperties();
                }
                break;

                default:
                    System.exit(0);
            }
        }
    }

}