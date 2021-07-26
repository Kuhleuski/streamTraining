package com.company;

public class Animal {
    private String name;
    private int age;
    private int id;
    private Color color;

    public Animal(String name, int age, int id, Color color){
        this.name= name;
        this.age=age;
        this.id=id;
        this.color=color;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }



    @Override
    public String toString() {
        return
                 name +
                ". Возраст " + age + years(age)+
                ", ID: " + id +
                ", цвет маркера : " + color +
                ';';
    }
    public static String years(int age){
        if (age==11){
            return " лет";
        }
        else if ( age==1 || age%10==1 || age%100==1 ){
            return " год";
        } else if (age==2 || age==3 || age==4 || age%10==2 || age%10==3 || age%10==4 ){
            return " года";
        } else {
            return " лет";
        }

    }
}
