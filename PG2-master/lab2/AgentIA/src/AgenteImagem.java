public class AgenteImagem extends AgenteIA {

    public AgenteImagem(String nome) {
        super(nome);
    }

    @Override
    public void executarTarefa(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException {
        conectarServidor();
        
        String inputLower = input.toLowerCase();
        if (inputLower.equals("hackear") || inputLower.equals("roubar") || inputLower.equals("biométrico")) {
            throw new PromptInadequadoException("Intenção maliciosa detectada pelo Safety Guard.");
        }
        
        System.out.println("Agente de Imagem [" + this.nome + "] sintetizando pixels para: [" + input + "]");
    }
}
