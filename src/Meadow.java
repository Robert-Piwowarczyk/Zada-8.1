import java.util.Scanner;

public class Meadow {
    public static void main(String[] args) {

        Insect[] insects = new Insect[3];
        insects[0] = new Insect("Mucha", 6);
        insects[1] = new Insect("Pszczoła", 6);
        insects[2] = new Insect("Chrabąszcz", 4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwy owadów, zakończ enterem: ");
        for (int i = 0; i < 100; i++) {
            String name1 = sc.next();
            String name2 = sc.next();
            String name3 = sc.next();
            if (name1.equals(name2) || name1.equals(name3) || name2.equals(name3)) {
                System.out.println("duplicat, ponów próbę dodawania" +
                        " owadów");
                continue;
            }
        }
    }
}


