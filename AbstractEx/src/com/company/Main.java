package com.company;

public class Main {

    public static void main(String[] args) {
	Cow c= new Cow("xyz",12) ;
    c.setName("rename if i need");
    String cowname = c.getName();
    System.out.println(cowname);


     //Animal a = new Animal("animalname",23); // its not woring bcz its a abstract used in animal class

    	Animal cww =  new Cow("123",100) ;

        System.out.println( " i am overliding from Cow ");

        System.out.println(" Only Cow      "+cww);
        c.whoIam();
    }
}
