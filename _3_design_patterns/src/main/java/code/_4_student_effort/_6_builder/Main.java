package code._4_student_effort._6_builder;

public class Main {
    public static void main(String[] args) {
        Person.PersonBuilder pb1 = new Person.PersonBuilder("John");
        Person john = pb1.build();

        pb1 = new Person.PersonBuilder("Mary").setMarriageStatus(true).setUniversity("Oxford - Computer Science");
        Person mary = pb1.build();

        pb1 = new Person.PersonBuilder("Mark").setJob("Programmer").setUniversity("MIT").setMarriageStatus(false).setDrivingLicense(true);
        Person mark = pb1.build();

        System.out.println(john);
        System.out.println(mary);
        System.out.println(mark);
    }
}
