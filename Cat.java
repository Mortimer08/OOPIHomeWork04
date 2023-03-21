public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return String.valueOf(age);
    }

    public String toString() {
        String rezult;
        rezult = "My name: " + this.name + " My age: " + this.age;
        return rezult;
    }
}
