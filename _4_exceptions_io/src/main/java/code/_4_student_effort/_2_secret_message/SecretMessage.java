package code._4_student_effort._2_secret_message;

import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {
    private String message;
    private String filepath;

    public SecretMessage(String filepath) {
        this.filepath = filepath;
        message = "";
    }

    public String getMessage() {
        try {
            computeMessage();
        } catch (IOException e) {
            System.out.println("Fisierul nu a fost gasit!");
            e.printStackTrace();
        }
        return message;
    }

    private void computeMessage() throws IOException {
        FileReader fr = new FileReader(filepath);
        int c;

        while ((c = fr.read()) != -1){
            if (Character.isUpperCase(c)){
                message += (char) c;
            }
        }
    }
}
