package code._4_student_effort._3_rock_paper_scissors;

public class Main {
    private static void decideWinner(int p1choice, int p2choice) {
        int winner;

        if (p1choice == p2choice) {
            System.out.println("It's a tie!");
        } else {
            int dif = p1choice - p2choice;

            if (dif == -1 || dif == 2) {
                winner = 2;
            } else {
                winner = 1;
            }

            System.out.println("Player " + winner + " won!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.start();
        p2.start();

        p1.join();
        p2.join();
        System.out.println("Player 1 chose " + p1);
        System.out.println("Player 2 chose " + p2);
        decideWinner(p1.getChoice(), p2.getChoice());
    }
}
