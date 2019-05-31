package com.liantong.xinxi37spring.controller;

/*

# 编辑:石彦伟 
 # NAME：Hello - USER：Administrator - 
 # TIME：2019/5/31- 10:13 - com.liantong.xinxi37spring.controller - 
 # xinxi37spring -the name of the current project
 # 星期五 -full name of the current day. Example: Monday, Tuesday, etc.

*/
public class Hello {

    private String name;
    private int id;
    private String color;
    private static int age;

    public static void main(String[] args) {
        System.out.println("\t\n^^(" + (age++) + ")^^^^");
        test();
    }

    //  try{    }catch(Exception e){ e.printStackTrace();}
    private static void test() {
        System.out.println("\t\n^^(" + (age++) + ")^^ test(); ^^");
        System.out.println("\t\n^^(" + (age++) + ")^^ test(); ^^");
        System.out.println("\t\n^^(" + (age++) + ")^^ test(); ^^");
    }

    @Override
    public String toString() {
        return " Hello {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void jiao() {
        System.out.println("吼吼吼………………");
    }

    public void chi() {
        System.out.println(" 吃草………………");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


