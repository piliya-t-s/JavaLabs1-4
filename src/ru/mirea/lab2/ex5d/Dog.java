package ru.mirea.lab2.ex5d;

public class Dog {
    private float age;
    private String name;

    public Dog(float age, String name) {
        this.age = age;
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHumanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
