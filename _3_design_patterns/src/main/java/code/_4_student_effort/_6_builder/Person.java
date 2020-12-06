package code._4_student_effort._6_builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMarried;

    private Person(PersonBuilder pb){
        this.name = pb.name;
        this.job = pb.job;
        this.university = pb.university;
        this.drivingLicense = pb.drivingLicense;
        this.isMarried = pb.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public boolean hasDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        String s = "Person{" + "name='" + name + '\'';

        if (job != null){
            s += ", job='" + job + '\'';
        }
        if (university != null){
            s += ", university='" + university + '\'';
        }
        s += ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
        return s;
    }

    public static class PersonBuilder implements AbstractPersonBuilder {
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMarried;

        public PersonBuilder(String name){
            this.name = name;
        }

        @Override
        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        @Override
        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        @Override
        public PersonBuilder setDrivingLicense(boolean hasDrivingLicense) {
            this.drivingLicense = hasDrivingLicense;
            return this;
        }

        @Override
        public PersonBuilder setMarriageStatus(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        @Override
        public Person build() {
            return new Person(this);
        }
    }
}
