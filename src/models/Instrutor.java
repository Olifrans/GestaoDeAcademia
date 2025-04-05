package models;

abstract class Instrutor extends Pessoa {
    private String especialidadaInstrutor;

    public Instrutor(String nome, int idade, String especialidadaInstrutor) {
        super(nome, idade);
        this.especialidadaInstrutor = especialidadaInstrutor;
    }

    public String getEspecialidadaInstrutor() {
        return especialidadaInstrutor;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "especialidadaInstrutor='" + especialidadaInstrutor + '\'' +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}
