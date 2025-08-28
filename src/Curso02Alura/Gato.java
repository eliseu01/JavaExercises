package Curso02Alura;

public class Gato extends Animal{
    @Override
    public void fazerBarulho() {
        System.out.println("Miau Miaau.");
    }

    public void arranharMoveis(){
        System.out.println("Estou arranhando móveis.");
    }
}