package com.mycompany.trabalho2;

/**
 *
 * @author Paradellas
 */
public class Aluno {

    private String nome;
    private float frequencia;
    private float notaNormal;
    private float notaFinal;
    private String situacao;

    public String getSituacao() {
        return situacao;
    }
    

    public Aluno(String nome, float frequencia, float notaNormal, float notaFinal) {
        this.nome = nome;
        this.frequencia = frequencia;
        this.notaNormal = notaNormal;
        this.notaFinal = notaFinal;
        this.situacao=Situacao.notaFinal(frequencia, notaFinal, notaFinal);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", frequencia=" + frequencia + ", notaNormal=" + notaNormal + ", notaFinal=" + notaFinal + '}';
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public float getNotaNormal() {
        return notaNormal;
    }

    public void setNotaNormal(float notaNormal) {
        this.notaNormal = notaNormal;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
    
    
}
