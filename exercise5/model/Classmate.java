package model;

abstract class Classmate {
    
    String name;
    int age;
    String hobbies;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getHobbies(){
        return this.hobbies;
    }

    public void setHobbies(String hobbies){
        this.hobbies = hobbies;
    }
}
