package code._4_student_effort.hard._1_dining_philosophers;

public class Philosopher extends Thread{
    final Object leftFork;
    final Object rightFork;
    int id;

    public Philosopher(int id, Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {
        // primul filozof va lua mai intai betisorul din dreapta si apoi pe cel din stanga
        // in acest fel filozoful va avea acces simultan la doua betisoare si astfel
        // va putea sa inceapa sa manance
        if (id == 0){
            synchronized (rightFork) {
                System.out.println("Philosopher " + id + " took right fork");
                sleep(); // delay adaugat ca sa aiba timp toti filozofii sa isi ia tacamul
                synchronized (leftFork) {
                    System.out.println("Philosopher " + id + " took left fork");
                    System.out.println("Philosopher " + id + " is eating");
                }
            }
        } else {
            // ceilalti filozofi vor lua intai betisorul din stanga apoi cel din dreapta;
            // un sigur filozof va ramane fara betisorul din stanga, intrucat i-a fost
            // luat de primul filozof (pentru care acel betisor era cel din dreapta sa)
            synchronized (leftFork) {
                System.out.println("Philosopher " + id + " took left fork");
                sleep(); // delay adaugat ca sa aiba timp toti filozofii sa isi ia tacamul
                synchronized (rightFork) {
                    System.out.println("Philosopher " + id + " took right fork");
                    System.out.println("Philosopher " + id + " is eating");
                }
            }
        }
    }

    @Override
    public void run() {
        eat();
    }
}
