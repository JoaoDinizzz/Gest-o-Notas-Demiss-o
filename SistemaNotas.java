package gerenciadorNotasAlunosDemissao;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotas {
    public static void main(String[] args) {
        // Criação de alguns alunos
        Aluno aluno1 = new Aluno("João", 8.5);
        Aluno aluno2 = new Aluno("Maria", 9.0);
        Aluno aluno3 = new Aluno("Pedro", 4.0);

        // Lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        // Impressão do status de cada aluno
        System.out.println("Status dos alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + ": " + aluno.getStatus());
        }

        // Lista de professores demitidos no último mês
        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Ana", true));
        professores.add(new Professor("Carlos", false)); // Não foi demitido no último mês

        // Impressão dos professores demitidos no último mês
        System.out.println("\nProfessores demitidos no último mês:");
        for (Professor professor : professores) {
            if (professor.foiDemitidoNoUltimoMes()) {
                System.out.println(professor.getNome());
            }
        }
    }
}