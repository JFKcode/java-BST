import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Drzewo");
        System.out.println("2.Lista");
        choice = sc.nextInt();
        IDataStructure dataStructure;
        if(choice == 1) dataStructure = new BinarySearchTree("BST1", 0, null, null);
        else dataStructure = new MyList(0);

        dataStructure.clear(2);

        while (true) {
            System.out.println("1.Dodaj element");
            System.out.println("2.Wyswietl stan listy");
            System.out.println("3.Posortuj liste");
            System.out.println("4.Wyswietl max");
            System.out.println("5.Wyswietl min");
            System.out.println("6.Wyczysc liste");
            System.out.println("7.Zakoncz dzialanie");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Podaj wartosc: ");
                    dataStructure.add(sc.nextDouble());
                    break;
                case 2:
                    System.out.println(dataStructure);
                    break;
                case 3:
                    try {
                        dataStructure.sort();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Najwiekszy element: " + dataStructure.max());
                    break;
                case 5:
                    System.out.println("Najmniejszy element: " + dataStructure.min());
                    break;
                case 6:
                    System.out.println("Podaj nowa wartosc poczatkowa: ");
                    dataStructure.clear(sc.nextDouble());
                    break;
                case 7:
                    return;
            }


        }

    }

}
