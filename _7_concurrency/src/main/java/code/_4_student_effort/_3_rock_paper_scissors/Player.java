package code._4_student_effort._3_rock_paper_scissors;

import java.util.concurrent.ThreadLocalRandom;

public class Player extends Thread {
    private int choice; // 0 - rock, 1 - paper, 2 - scissors

    @Override
    public void run() {
        choice = ThreadLocalRandom.current().nextInt(0, 4);
    }

    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        if (choice == 0)
            return "rock";
        if (choice == 1)
            return "paper";
        return "scissors";
    }
}
