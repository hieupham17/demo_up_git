package com.company;

public class model {
    private String name ;
    private int age ;

    public model() {
    }

    public model(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "model{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
