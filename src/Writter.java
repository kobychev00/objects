public class Writter {
    private String firstName;
    private String secondName;

    public Writter(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getAgePublish() {
        return this.secondName;
    }

    public String toString() {
        return "Имя " + this.firstName + " Фамилия " + this.secondName;
    }
}

