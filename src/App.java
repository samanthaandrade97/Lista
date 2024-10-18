public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Navegador navegador = new Navegador();
                
                navegador.visitar("https://www.youtube.com", "Youtube");
                navegador.visitar("https://www.facebook.com", "Facebook");
                navegador.visitar("https://www.instagram.com", "Instagram");
                navegador.visitar("https://www.globo.com", "Globo");

                navegador.exibirPaginaAtual();
                
                navegador.voltar();
                navegador.exibirPaginaAtual();
    }
}