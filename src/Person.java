public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = ++idCounter;
    }

    public Person(String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(other.getPaymentAmount(), this.getPaymentAmount());
    }
}1
