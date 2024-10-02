import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno){
        this.alunos[totalAlunos] = aluno;
        this.totalAlunos++;
    }
    public void adiciona(int posicao, Aluno aluno){
        verifica(posicao);
        this.alunos[posicao] = aluno;
        }
          
    public Aluno pega(int posicao){
        verifica(posicao);
        return alunos [posicao];
    }
    public void remove(int posicao){
        verifica (posicao);
        alunos[posicao] = null;
    }
    public boolean contem(Aluno aluno){
        int controle = 0;
        for (Aluno pessoa : alunos) {
            if (pessoa.equals(aluno)){
            return true;
        }
            break;
    }
    if(controle == 0){
        return false;
    }else{
        return true;
    }
}
    @Override
    public String toString(){
        return Arrays.toString(alunos);
    }
    public boolean verifica(int posicao){
        if(posicao>0 && posicao<alunos.length-1){
            return true;
        }else{
        throw new IllegalArgumentException("Posicao Invalida");
        }
    }
}


