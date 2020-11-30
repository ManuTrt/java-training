package code._4_student_effort._2_movie_database;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(){
        this("", null);
    }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }
}
