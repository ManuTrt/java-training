package code._4_student_effort._1_phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String, Long> phoneNumbers = new HashMap<>();

    public PhoneBook(String phoneBook){
        try {
            String name;
            Double number;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(phoneBook)));

            while (scanner.hasNext()){
                name = scanner.next();
                if (scanner.hasNextDouble()){
                    phoneNumbers.put(name, scanner.nextLong());
                }
            }

        } catch (IOException e) {
            System.out.println("file not found");
        }
    }

    public Long getByName(String name){
        return phoneNumbers.get(name);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneNumbers=" + phoneNumbers +
                '}';
    }
}
