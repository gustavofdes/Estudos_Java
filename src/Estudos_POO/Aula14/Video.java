package Estudos_POO.Aula14;

public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int curtidas;
    private int views;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.reproduzindo = false;
        this.curtidas = 0;
        this.views = 0;
    }

    @Override
    public void play() {
        if (!isReproduzindo()){
            setReproduzindo(true);
            setViews(getViews() + 1);
            System.out.println("O video começou a ser reproduzido");
        } else {
            System.out.println("O video ja esta em execução");
        }
    }

    @Override
    public void pause() {
        if (isReproduzindo()){
            setReproduzindo(false);
            System.out.println("Video pausado");
        } else {
            System.out.println("O video ja esta pausado");
        }
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", curtidas=" + curtidas +
                ", views=" + views +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
