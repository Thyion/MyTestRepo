package pl.infoshare.lesson6.Exercise1;


import java.time.LocalDate;
import java.util.Date;

public class Pracownik {




    public Pracownik(String name, String surName, String team, Date birthDate) {
        this.name = name;
        this.surName = surName;
        this.team = team;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return (this.getName() + ", " + this.surName + ", " + this.team + ", " + this.birthDate);
    }

    private String name;
    private String surName;
    private String team;

    private Date birthDate;

}
