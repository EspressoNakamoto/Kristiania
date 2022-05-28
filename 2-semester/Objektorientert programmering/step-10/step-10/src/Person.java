public class Person {
    // Fields
    private int age;
    private String name;

    // Constructor
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /* Getters and setters */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("This person is %s years old and is called %s. %s %s", getAge(), getName(), equals(this),
                hashCode());
    }

    // hashCode method check equals
    // If objects are equal, they give the same hashCode value
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    // Checks if the objects has duplicate values
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
