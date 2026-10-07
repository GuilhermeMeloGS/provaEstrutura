public class Lista<T> {
    private No<T> inicio, fim, aux;
    private int tamanho;

    public boolean vazio() {
        return inicio == null;
    }

    public boolean inserirNaLista(T item) {
        if (vazio()) {
            inicio = new No<T>(item);
        } else {
            fim = new No<T>(item);
            aux.setProximo(fim);
            aux = fim;
        }
        tamanho++;
        return true;
    }

    public T pesquisar(T chave) {
        No<T> ref = inicio;
        while (ref != null) {
            if (ref.getItem().equals(chave)) {
                return ref.getItem();
            }

            ref = ref.getProximo();
        }
        return null;
    }

    public boolean atualizarElemento(T antigo, T novo) {
        No<T> ref = inicio;
        while (ref != null) {
            if (ref.getItem() != null && ref.getItem().equals(antigo)) {
                ref.setItem(novo);
                return true;
            }
            ref = ref.getProximo();
        }
        return false;
    }

    public boolean removar(T chave) {
        No<T> ref = inicio;
        No<T> anterior = null;

        while (ref != null) {
            if (ref.getItem() != null && ref.getItem().equals(chave)) {
                if (anterior == null) {
                    inicio = ref.getProximo();
                } else {
                    anterior.setProximo(ref.getProximo());
                }
                if (ref == fim) {
                    fim = anterior;
                    aux = anterior;
                }
                tamanho--;
                return true;
            }
            anterior = ref;
            ref = ref.getProximo();
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public T obter(int posicao) {
        No<T> ref = inicio;
        int rodar = 1;
        while (ref != null) {
            if (rodar == posicao) {
                return ref.getItem();
            }
            rodar++;
            ref = ref.getProximo();
        }
        return null;
    }
}
