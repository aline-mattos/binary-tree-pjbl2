public class Main {
    public static void main(String[] args) {

        Arvore arvoreBinaria = new Arvore();
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(6);
        arvoreBinaria.inserir(12);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(8);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(5);

        arvoreBinaria.imprimeArvore();
        arvoreBinaria.remover(6);
        arvoreBinaria.imprimeArvore();
        arvoreBinaria.buscar(6);

    }
}