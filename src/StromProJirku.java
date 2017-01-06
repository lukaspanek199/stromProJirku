import java.util.Scanner;

public class StromProJirku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej korenovovou hodnotu: ");
        Koren k = new Koren(Integer.parseInt(sc.nextLine()));

        do {
            System.out.print("Zadej cislo: ");
            
            k.insrtNmbr(Integer.parseInt(sc.nextLine()));
            k.print();
        } while (true);
    }
}
