package code._4_student_effort._6_builder;

public interface AbstractPersonBuilder {
    public AbstractPersonBuilder setJob(String job);
    public AbstractPersonBuilder setUniversity(String university);
    public AbstractPersonBuilder setDrivingLicense(boolean hasDrivingLicense);
    public AbstractPersonBuilder setMarriageStatus(boolean isMarried);
    public Person build();
}
