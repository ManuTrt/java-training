package code._4_student_effort._1_phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("_test_files/in/phonebook.txt");
        System.out.println(phoneBook);
        System.out.println("Abbey phone number: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul phone number: " + phoneBook.getByName("Abdul"));
    }
}
