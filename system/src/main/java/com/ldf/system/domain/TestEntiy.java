package com.ldf.system.domain;


public class TestEntiy {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "TestEntiy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public TestEntiy(String name, int age) {
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
}
