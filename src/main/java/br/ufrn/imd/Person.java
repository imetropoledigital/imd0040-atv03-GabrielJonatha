package br.ufrn.imd;

public class Person {
    public String name;
    public String hometown;

    public Person(){
    }

    public Person(String name, String hometown){
        this.name = name;
        this.hometown = hometown;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String toString(){
        return ("Nome: " + name + '\n' + "Cidade Natal: " + hometown + '\n');
    }
}
