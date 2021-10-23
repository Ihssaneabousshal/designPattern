package com.company;

public class Terre {
    private int age;
    private int population;
    private static Terre instance=null;
    private void Terre(int age,int population){
        this.age =age;
        this.population=population;
    }
    public Terre getInstance(){
            if (instance == null)
                instance = new Terre();

        return instance;

    }
    public void afficher(){
        System.out.println("L'age de la terre est "+this.age+" et sa population est "+this.population);
    }
}