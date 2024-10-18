public class Navegador {
    private Pilha historico;
    private Pagina paginaAtual;

    public Navegador() {
        historico = new Pilha();
    }

    public void visitar(String url, String titulo) {
        Pagina novaPagina = new Pagina(url, titulo);
        if (paginaAtual != null) {
            historico.push(paginaAtual);
        }
        paginaAtual = novaPagina;
        System.out.println("Visitando: " + paginaAtual);
    }

    public void voltar() {
        if (!historico.empty()) {
            paginaAtual = historico.pop();
            System.out.println("Voltando para: " + paginaAtual);
        } else {
            System.out.println("Não há páginas anteriores.");
        }
    }

    public void exibirPaginaAtual() {
        if (paginaAtual != null) {
            System.out.println("Página atual: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta.");
        }
    }
}