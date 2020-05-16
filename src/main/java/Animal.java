public class Animal {
    String name;
    byte age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Animal(String name, byte age) {
        this.name = name;
        this.age = age;
    }
}
