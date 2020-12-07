package code._4_student_effort._3_proxy;

import java.util.ArrayList;
import java.util.HashMap;

public class RealEstateAgentProxy {
    private ArrayList<Apartment> apartaments;
    private HashMap<Apartment, Boolean> isRented;

    public RealEstateAgentProxy() {
        apartaments = new ArrayList<>();
        isRented = new HashMap<>();
    }

    public void represent(Apartment apartament){
        apartaments.add(apartament);
        isRented.put(apartament, false);
    }

    public Apartment rent(Student student){
        String student_name = student.getName();
        int student_money = student.getMoney();

        if (!student_name.startsWith("P")){
            for (Apartment ap : apartaments) {
                if (!isRented.get(ap) && ap.getMonthlyRentCost() <= student_money){
                    isRented.replace(ap, true);
                    return ap;
                }
            }
        }
        return null;
    }
}
