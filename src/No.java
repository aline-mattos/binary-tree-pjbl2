public class No {
    private int dado;
    private No direito;
    private No esquerdo;

    public No (int dado) {
        this.dado = dado;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getDado() {
        return dado;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }
}
