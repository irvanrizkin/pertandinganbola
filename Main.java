import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prepare the place for Object's array
        Pertandingan [] allBattle;

        // Will set the length of allBattle array
        int countPertandingan = Integer.parseInt(input.nextLine());
        allBattle = new Pertandingan[countPertandingan];

        // Iterate input and instantiate allBattle
        for (int i = 0; i < allBattle.length; i++) {
            System.out.println("Match " + (i+1));
            int home = Integer.parseInt(input.nextLine());
            String club = input.nextLine();
            int away = Integer.parseInt(input.nextLine());
            System.out.println();
            allBattle[i] = new Pertandingan(home, club, away);
        }

        // Print Home Away data
        for (int i = 0; i < allBattle.length; i++){
            allBattle[i].printHomeAway();
        }
        System.out.println();

        // Print Home Statistics
        Pertandingan.printHomeStatistics();

        // Resource leak fix
        input.close();




    }
}