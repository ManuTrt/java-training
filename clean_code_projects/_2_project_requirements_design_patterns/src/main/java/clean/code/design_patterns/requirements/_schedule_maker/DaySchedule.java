package clean.code.design_patterns.requirements._schedule_maker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private LocalDate date;
    private List<String> toDoList;
    private List<String> birthdayPeople;
    private List<String> importantEvents;
    private List<String> reservations;

    private DaySchedule(DayScheduleBuilder dsb) {
        this.date = dsb.date;
        this.toDoList = dsb.toDoList;
        this.birthdayPeople = dsb.birthdayPeople;
        this.importantEvents = dsb.importantEvents;
        this.reservations = dsb.reservations;
    }

    @Override
    public String toString() {
        return "\nDate = " + date +
                "\nTO DO:\n" + (toDoList.size() == 0 ? "\tNONE\n" : formatList(toDoList)) +
                "\nPeople celebrating birthday:\n" + (birthdayPeople.size() == 0 ? "\tNONE\n" : formatList(birthdayPeople)) +
                "\nImportant events:\n" + (importantEvents.size() == 0 ? "\tNONE\n" : formatList(importantEvents)) +
                "\nReservations:\n" + (reservations.size() == 0 ? "\tNONE\n" : formatList(reservations));
    }

    private String formatList(List<String> list) {
        StringBuilder s = new StringBuilder();

        for (String str : list) {
            s.append("\t").append(str).append("\n");
        }
        return s.toString();
    }

    public static class DayScheduleBuilder implements AbstractDayScheduleBuilder{
        private LocalDate date;
        private List<String> toDoList;
        private List<String> birthdayPeople;
        private List<String> importantEvents;
        private List<String> reservations;

        public DayScheduleBuilder() {
            toDoList = new ArrayList<>();
            birthdayPeople = new ArrayList<>();
            importantEvents = new ArrayList<>();
            reservations = new ArrayList<>();
        }

        @Override
        public AbstractDayScheduleBuilder setDate(int year, int month, int dayOfMonth) {
            date = LocalDate.of(year, month, dayOfMonth);
            return this;
        }

        @Override
        public AbstractDayScheduleBuilder addToDo(String toDo) {
            toDoList.add(toDo);
            return this;
        }

        @Override
        public AbstractDayScheduleBuilder addPersonCelebratingBirthday(String name) {
            birthdayPeople.add(name);
            return this;
        }

        @Override
        public AbstractDayScheduleBuilder addImportantEvent(String event) {
            importantEvents.add(event);
            return this;
        }

        @Override
        public AbstractDayScheduleBuilder addReservation(String reservation) {
            reservations.add(reservation);
            return this;
        }

        @Override
        public DaySchedule buildDaySchedule() {
            return new DaySchedule(this);
        }
    }
}
