/* Implemente um método que calcule a média de um aluno de acordo com base nas notas da P1 e P2.
Além disso, implemente um outro método que informe o status do aluno de acordo com a tabela a seguir: 
Nota acima de 6 → Aprovado.
Nota entre 4 e 6 → Verificação Suplementar.
Nota abaixo de 4 → Reprovado 
*/

public class Aluno {
    String nome;

    //O nome que o aluno receber, será o atributo nome do Aluno
    public Aluno (String nome) {
        this.nome = nome;
    }

    //Método que calcula a média de um aluno
    public static float calculaMedia (Aluno aluno) {
        float notaP1 = 7.0f;
        float notaP2 = 8.0f;
        return ((notaP1 + notaP2) / 2);
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
     public static void main(String[] args) {
        Aluno aluno = new Aluno ("João");
        float media = calculaMedia(aluno);
        String status = statusAluno(aluno);

        System.out.println("A média do " + aluno + " é: " + media + ". O status é: " + status);
    }

}