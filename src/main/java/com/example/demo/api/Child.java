package com.example.demo.api;

public class Child extends Parent{
    int money = 20;

  //  public void getDocuments(){
   //     System.out.println("pop");
   // }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.money);
        System.out.println(child.realEstateProperties);
        child.getDocuments();
    }
}
