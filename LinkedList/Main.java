package LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        int choice = -1;
        while(choice != 4) {
            System.out.println("1.add\n2.print\n3.delete\n4.exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Yasi daxil et");
                    int age = sc.nextInt();
                    System.out.println("Adi daxil et");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.println("Budceni daxil et");
                    int budget = sc.nextInt();
                    node.add(age, name, budget);
                    System.out.println(name + " elave edildi");
                    break;
                case 2:
                    node.show();
                    break;
                case 3:
                    node.delete();
                    break;
                case 4:
                    System.out.println("Emeliyyat bitdi");
                    break;

            }
        }
    }
}
