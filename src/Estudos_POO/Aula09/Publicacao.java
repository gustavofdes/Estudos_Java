package Estudos_POO.Aula09;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagFolheadas);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
