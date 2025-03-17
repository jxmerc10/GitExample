/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author mjustin
 */
public class Person {
    private String name;
    private int age;
    private int Id;

    public Person(String name, int age, int Id) {
        this.name = name;
        this.age = age;
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", Id=" + Id + '}';
    }


    
}
