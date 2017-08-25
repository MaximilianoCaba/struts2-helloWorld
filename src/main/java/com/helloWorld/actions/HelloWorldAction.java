package com.helloWorld.actions;

public class HelloWorldAction {

    private String name;

    private int age;

    public String execute() throws Exception { return "success"; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) { this.age = age; }
}
