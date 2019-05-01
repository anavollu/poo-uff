package aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno ("João");
        aluno.setNotaP1(2.0f);
        aluno.setNotaP2(3.0f);
        float media = AlunoUtil.calculaMedia(aluno);
        String status = AlunoUtil.statusAluno(aluno);

        System.out.println("A média do " + aluno + " é: " + media + ". O status é: " + status);
    }
}