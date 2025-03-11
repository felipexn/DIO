package set.ex33;
/*2. Lista de Alunos
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionaAluno(String nome, int matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }
    public void removerAluno(int matricula) {
        Aluno alunoPraRemover = null;
        if(!alunoSet.isEmpty()) {
            for(Aluno aluno : alunoSet) {
                if(aluno.getMatricula() == matricula) {
                    alunoPraRemover = aluno;
                    break;
                }
            }
            alunoSet.remove(alunoPraRemover);
        }else System.out.println("lista de alunos vazia");
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()){
            for (Aluno aluno : alunoPorNome) {
                System.out.println(aluno.toString());
            }

        }else
            System.out.println("Nenhum aluno encontrado");
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparePorNota());
        if(!alunoSet.isEmpty()){
            alunoPorNota.addAll(alunoSet);
            System.out.println(alunoPorNota);
        }else System.out.println("Nenhum aluno encontrado");
    }
    public void exibirAlunos(){
        System.out.println(alunoSet.toString());
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionaAluno("asdsssa",2552,2.2);
        gerenciador.adicionaAluno("asdwada",325,5.2);
        gerenciador.adicionaAluno("asaf",1,3.4);

        gerenciador.exibirAlunos();
        gerenciador.exibirAlunosPorNome();
        gerenciador.exibirAlunosPorNota();
        //gerenciador.removerAluno(12);
        gerenciador.exibirAlunos();
    }
}
