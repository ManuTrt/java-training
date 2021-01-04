package clean.code.design_patterns.requirements._schedule_maker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DaySchedule> schedules = new ArrayList<>();
        DaySchedule sch1 = new DaySchedule.DayScheduleBuilder().setDate(2021,1,20)
                                                                .addToDo("buy groceries")
                                                                .addImportantEvent("Workplace meeting")
                                                                .addReservation("Cinema")
                                                                .addToDo("do the laundry")
                                                                .addImportantEvent("call mom").buildDaySchedule();
        DaySchedule sch2 = new DaySchedule.DayScheduleBuilder().setDate(2021, 2,13)
                                                                .addPersonCelebratingBirthday("Mike")
                                                                .addImportantEvent("go to Mike birthday party")
                                                                .addToDo("buy gift for mike")
                                                                .addToDo("finish project").buildDaySchedule();
        schedules.add(sch1);
        schedules.add(sch2);
        for (DaySchedule sch : schedules) {
            System.out.println(sch);
        }
    }
}
