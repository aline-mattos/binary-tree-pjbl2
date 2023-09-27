import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    //insere na arvore
    void inserir(int dado){
        raiz = inserirRecursivo(raiz, new No(dado));
    }

    private No inserirRecursivo(No noAtual, No novoNo) {
        if (noAtual == null) {
            return novoNo;
        }

        if (novoNo.getDado() < noAtual.getDado()){
            noAtual.setEsquerdo(inserirRecursivo(noAtual.getEsquerdo(), novoNo));
        } else {
            noAtual.setDireito(inserirRecursivo(noAtual.getDireito(), novoNo));
        }
        return noAtual;
    }

    //busca na árvore
    public boolean buscar(int dado) {
        boolean existe = buscaRecursiva(raiz, dado);
        if (existe) {
            System.out.println("dado " + dado + " encontrado!");
        } else {
            System.out.println("dado " + dado + " não encontrado!");
        }
        return existe;
    }

    private boolean buscaRecursiva(No no, int dado) {
        if (no == null) {
            return false;
        } else if (no.getDado() == dado) {
            return true;
        } else if (dado < no.getDado()) {
            return buscaRecursiva(no.getEsquerdo(), dado);
        } else {
            return buscaRecursiva(no.getDireito(), dado);
        }
    }

    // Delete a key from the tree
    public No deletar(int dado) {
        return deletarRecursivo(raiz, dado);
    }

    private No deletarRecursivo(No no, int dado) {
        if (no.getDado() == dado) {
            no = encontraSucessor(no);
        } else if (dado < no.getDado()) {
            no.setEsquerdo(deletarRecursivo(no.getEsquerdo(), dado));
        } else {
            no.setDireito(deletarRecursivo(no.getDireito(), dado));
        }
        return no;
    }

    private No encontraSucessor(No no) {
        No esquerda = no.getEsquerdo();
        No direita = no.getDireito();

        if (direita != null) {
            if (esquerda != null) {
                inserirRecursivo(direita, esquerda);
            }
            return direita;
        } else return esquerda;
    }

    //impressao da arvore
    public void imprimeArvore() {
        try {
            System.out.println(raiz.getDado()); // Imprime o valor da raiz sem "└──"
            imprimirRecursivo(raiz.getEsquerdo(), " ");
            imprimirRecursivo(raiz.getDireito(), " ");
        } catch (Exception e) {
            System.out.println("a árvore está vazia");
        }

    }

    private void imprimirRecursivo(No no, String prefixo) {
        if (no != null) {
            System.out.println(prefixo + "└── " + no.getDado());
            imprimirRecursivo(no.getEsquerdo(), prefixo + "    ");
            imprimirRecursivo(no.getDireito(), prefixo + "    ");
        }
    }





}