package com.tsi.training;

public class Main {

    public static void main(String[] args){

        Cat cat = new Cat();

        System.out.println(cat.getName());

        Penguin p = new Penguin();

        try{
            System.out.println(p.dive());
        } catch (Exception e){

        }

        cat.breed(cat);
        System.out.println();
    }
}
