package Estudos_POO.Aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int pagAtual;
    private int totalPag;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", pagAtual=" + pagAtual +
                ", totalPag=" + totalPag +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    @Override
    public void abrir() {
        if (!isAberto()){
            setAberto(true);
        } else {
            System.out.println("O livro ja esta aberto");
        }
    }

    @Override
    public void fechar() {
        if (isAberto()){
            setAberto(false);
        } else {
            System.out.println("O livro ja esta fechado");
        }
    }

    @Override
    public void folhear(int pagFolheadas) {
        if (pagFolheadas <= this.totalPag){
            this.setPagAtual(pagFolheadas);
            System.out.println("Você folheou para a pagina " + getPagAtual());
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto){
            this.pagAtual++;
        } else {
            System.out.println("Livro esta fechado");
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto){
            this.pagAtual--;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
