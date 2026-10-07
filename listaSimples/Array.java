public class Array <T> {
    private T [] lista = (T[]) new Object[3];
    private int capacidade = 0;

    public T[] dobrarLista(){
        T [] copia = (T[]) new Object[lista.length*2];
        for (int i = 0; i < capacidade; i++) {
            copia[i] = lista [i];
        }
        lista = copia;
        return lista;
    }

    public boolean inserir(T chave){
        if(capacidade == lista.length){
            dobrarLista();
        }
        lista[capacidade] = chave;
        capacidade++;
        return true;
    }

    public T pesquisar (T chave) {
        for (int i = 0; i < capacidade; i++) {
            if (lista[i].equals(chave)){
                return lista[i];
            }
        }
        return null;
    }

    public boolean atualizar (T chave, T novo){
        for (int i = 0; i < capacidade; i++) {
            if (lista[i].equals(chave)){
                lista[i] = novo;
                return true;
            }
        }
        return false;
    }
    
    public boolean remover (T chave){
        for (int i = 0; i < capacidade; i++) {
            if (lista[i].equals(chave)){
                for (int j = i; j < capacidade-1; j++) {
                    lista[j] = lista[j+1];
                }
                lista[capacidade-1] = null;
                return true;
            }
        }
        return false;
    }
    public T obter(int posicao){
        return lista[posicao-1];
    }
}
