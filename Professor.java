package gerenciadorNotasAlunosDemissao;

public class Professor {
    private String nome;
    private boolean demitidoNoUltimoMes;

    public Professor(String nome, boolean demitidoNoUltimoMes) {
        this.nome = nome;
        this.demitidoNoUltimoMes = demitidoNoUltimoMes;
    }

    public String getNome() {
        return nome;
    }

    public boolean foiDemitidoNoUltimoMes() {
        return demitidoNoUltimoMes;
    }
}