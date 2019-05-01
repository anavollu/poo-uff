package aluno;

public class AlunoUtil {
    //Método que calcula a média de um aluno
    public static float calculaMedia (Aluno aluno) {
        return ((aluno.getNotaP1() + aluno.getNotaP2()) / 2);
    }

    //Método que calcula o status do aluno
    public static String statusAluno (Aluno aluno) {
        float mediaAluno = calculaMedia(aluno);
        if (mediaAluno < 4) {
            return "Reprovado";
        }
        else if (mediaAluno > 6) {
            return "Aprovado";
        }
        else {
            return "Verificação Suplementar";
        }
    }
}