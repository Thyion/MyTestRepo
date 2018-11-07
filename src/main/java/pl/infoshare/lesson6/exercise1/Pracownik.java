package pl.infoshare.lesson6.exercise1;


import java.time.LocalDate;

public class Pracownik {




    public Pracownik(String name, String surName, String team, LocalDate birthDate) {
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return (this.getName() + ", " + this.surName + ", " + this.team + ", " + this.birthDate);
    }

    private String name;
    private String surName;
    private String team;

    private LocalDate birthDate;

}
