package com.company;

public class Cow  extends Animal {

      public Cow( String name,int age){
          super(name, age);
          this.age = 5;
          this.name= "i am from cow";
      }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
   public void whoIam() {
       {
      System.out.println( "I am cow ");
       }
    }
}
