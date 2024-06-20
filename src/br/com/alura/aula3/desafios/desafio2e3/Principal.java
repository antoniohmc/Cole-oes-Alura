package br.com.alura.aula3.desafios.desafio2e3;

public class Principal {

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Cachorro(40);

            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
            } else {
                System.out.println("O objeto não é um Cachorro.");
            }
        }
    }
}
