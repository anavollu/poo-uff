/* Implemente um método que calcule a média de um aluno de acordo com base nas notas da P1 e P2.
Além disso, implemente um outro método que informe o status do aluno de acordo com a tabela a seguir: 
Nota acima de 6 → Aprovado.
Nota entre 4 e 6 → Verificação Suplementar.
Nota abaixo de 4 → Reprovado 
*/

package aluno;

public class Aluno {
    private String nome;
    private float notaP1;
    private float notaP2;

    //O nome que o aluno receber, será o atributo nome do Aluno
    public Aluno (String nome) {
        this.nome = nome;
    }

    //Método para pegar o nome do aluno
    public String getNome () {
        return this.nome;
    } 

    @Override
    public String toString () {
        return "aluno = " + this.nome;
    }

    //Método para inserir a nota da P1 do aluno
    public void setNotaP1 (float notaP1){
        this.notaP1 = notaP1;
    }

    //Método para inserir a nota da P2 do aluno
    public void setNotaP2 (float notaP2){
        this.notaP2 = notaP2;
    }

    //Método para pegar a nota da P1 do aluno
    public float getNotaP1 () {
        return this.notaP1;
    }

    //Método para pegar a nota da P2 do aluno
    public float getNotaP2 () {
        return this.notaP2;
    }

}