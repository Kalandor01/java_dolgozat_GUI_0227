package model;
public class Dolgozo
{
    private String name;
    private int age;
    private char gender;
    private int hoursWorked;

    public Dolgozo(String name, int age, char gender, int hoursWorked) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "Dolgozo: " + name + ": age=" + age + ", gender=" + gender + ", hoursWorked=" + hoursWorked;
    }
}
