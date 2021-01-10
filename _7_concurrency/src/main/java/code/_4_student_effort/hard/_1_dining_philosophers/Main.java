package code._4_student_effort.hard._1_dining_philosophers;

public class Main {
    public static final int N = 5;

    public static void main(String[] args) {
        Thread[] threads = new Thread[N];
        Object[] forks = new Object[N];
        System.out.println("Philosophers problem!");


        for (int i = 0; i < N; i++)
            forks[i] = new Object();
        for (int i = 0; i < N; i++)
            threads[i] = new Philosopher(i, forks[i], forks[(i+1)%N]);
        for (int i = 0; i < N; i++)
            threads[i].start();

        for (int i = 0; i < N; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
