package models;

public class General {
    // attributes
    private String id;
    private String name;
    private String surname;
    private double age;

    // methods
    public General(String id, String name, String surname, double age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAge() {
        return age;
    }
}

