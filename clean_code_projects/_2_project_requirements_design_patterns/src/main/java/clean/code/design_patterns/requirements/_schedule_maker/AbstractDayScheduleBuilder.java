package clean.code.design_patterns.requirements._schedule_maker;

public interface AbstractDayScheduleBuilder {
    AbstractDayScheduleBuilder setDate(int year, int month, int dayOfMonth);
    AbstractDayScheduleBuilder addToDo(String toDo);
    AbstractDayScheduleBuilder addPersonCelebratingBirthday(String name);
    AbstractDayScheduleBuilder addImportantEvent(String event);
    AbstractDayScheduleBuilder addReservation(String reservation);
    DaySchedule buildDaySchedule();
}
