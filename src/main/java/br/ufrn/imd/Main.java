package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Joao Silva", "Natal");
        System.out.println(person1);

        Musician musician1 = new Musician("Maria Oliveira", "Mossoro", true, true, true);
        System.out.println(musician1);

        GuitarPlayer guitarPlayer1 = new GuitarPlayer("Pedro Souza", "Caico", false, true, false, 10, true, true);
        System.out.println(guitarPlayer1);
    }
}
