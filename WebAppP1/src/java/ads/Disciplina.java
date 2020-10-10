package ads;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String ementa;
    private int ciclo;
    private double nota;

    public Disciplina(String nome, String ementa, int ciclo) {
        this.nome = nome;
        this.ementa = ementa;
        this.ciclo = ciclo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public static ArrayList<Disciplina> getList(){
        ArrayList<Disciplina> list = new ArrayList<>();
        list.add(new Disciplina("Nome 1", "Ementa 1", 4));
        list.add(new Disciplina("Nome 2", "Ementa 2", 4));
        list.add(new Disciplina("Nome 3", "Ementa 3", 4));
        list.add(new Disciplina("Nome 4", "Ementa 4", 4));
        return list;
    }
}