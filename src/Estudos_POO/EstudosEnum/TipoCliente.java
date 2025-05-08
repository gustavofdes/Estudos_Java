package Estudos_POO.EstudosEnum;

public enum TipoCliente {
    PESSOA_FISISCA(1500, 1),
    PESSOA_JURIDICA(3000, 2);

    private final double LIMITE_CREDITO;
    private final int ID;

    TipoCliente(double LIMITE_CREDITO, int ID) {
        this.LIMITE_CREDITO = LIMITE_CREDITO;
        this.ID = ID;
    }

    public double getLIMITE_CREDITO() {
        return LIMITE_CREDITO;
    }

    public int getID() {
        return ID;
    }
}
