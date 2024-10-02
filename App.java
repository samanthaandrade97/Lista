public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ale");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Samantha");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Samantha");

        System.out.println(aluno2.getNome());
        System.out.println(aluno1.equals(aluno2));
        System.out.println(aluno2.equals(aluno3));

        Vetor vetor = new Vetor();
        vetor.adiciona(aluno1);
        vetor.adiciona(3,aluno2);
        System.out.println(vetor.toString());
        
        vetor.adiciona(111,aluno3);
        
    }
}
