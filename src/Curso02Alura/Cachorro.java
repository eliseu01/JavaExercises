package Curso02Alura;

public class Cachorro extends Animal{
    @Override
    public void fazerBarulho() {
        System.out.println("Au Au Auu");
    }

    public void abanarRabo(){
        System.out.println("Estou abanando o rabo.");
    }
}
