import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "user";

        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0;
        int compWins = 0;

        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("user")) userWins++;
            if (winner.equals("computer")) compWins++;

            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + winner);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;

        System.out.println("\nUser Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");

        sc.close();
    }
}
