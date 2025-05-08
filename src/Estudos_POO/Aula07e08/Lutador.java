package Estudos_POO.Aula07e08;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso;
    private String categoria;
    private int altura;
    private int vitorias;
    private int perdas;
    private int empates;

    //Metodos
    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.println("Apresentando o lutador " + this.getNome());
        System.out.println("Que seu Pais de origem é " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos de idade e pesando seus " + this.getPeso() + "kg");
        System.out.println("Lutando pela categoria " + this.getCategoria());
        System.out.println("Com " + this.getVitorias() + " vitorias, " + this.getPerdas() + " perdas e " + this.getEmpates() + " empates.");

    }

    public void status(){
        System.out.println("------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getPerdas());
        System.out.println("Empates: " + getEmpates());
    }

    // Metodos de acresentar vitorias, perdas e empates
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setPerdas(this.getPerdas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }



    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, double peso, int altura, int vitorias, int perdas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.perdas = perdas;
        this.empates = empates;
    }

    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getPerdas() {
        return perdas;
    }

    public void setPerdas(int perdas) {
        this.perdas = perdas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
