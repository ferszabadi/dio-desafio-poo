public class Main {
    public static void main(String[] args) throws Exception {
        
        Smartphone iphone = new Smartphone();

        iphone.ligar("(15) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();


        iphone.selecionarMusica("It's My Life - Bon Jovi");
        iphone.tocar();
        iphone.pausar();


        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.dio.me");
        iphone.atualizarPagina();
        
    }
}
