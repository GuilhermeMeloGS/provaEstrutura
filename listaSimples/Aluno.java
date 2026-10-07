public class Aluno {
    private int ra;
    private String nome;
    public static int raIncremento = 1;

    public Aluno(String nome) {
        this.nome = nome;
        this.ra = raIncremento++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }
}
