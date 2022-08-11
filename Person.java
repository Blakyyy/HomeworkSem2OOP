abstract class Person {
    protected String name;
    protected String dateOfBirth;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person [date_of_brith=" + dateOfBirth + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }


}