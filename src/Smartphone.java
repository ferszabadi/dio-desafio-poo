public class Smartphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    
    private String musicaSelecionada;
    private String numeroSelecionado;
    private String urlDigitada;
    
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.println("Página web atualizada.");
    }

    public void exibirPagina(String url){
        this.urlDigitada = url;
        System.out.println("Exibindo a página " + urlDigitada + ".");;
    }

    public void atender(){
        System.out.println("Ligação atendida.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado.");
    }

    public void ligar(String numero){
        this.numeroSelecionado = numero;
        System.out.println("Ligando para " + numeroSelecionado + ".");
    }

    public void tocar(){
        System.out.println("Tocando música.");
    }

    public void pausar(){
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica){
        this.musicaSelecionada = musica;
        System.out.println("Música selecionada: " + musicaSelecionada + ".");
    }

}
