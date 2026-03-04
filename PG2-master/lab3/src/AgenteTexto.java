public class AgenteTexto extends AgenteIA {

    public AgenteTexto(String nome) {
        super(nome);
    }

    @Override
    public void executarTarefa(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException {
        conectarServidor();
        
        if (input.length() > 500) {
            throw new FalhaProcessamentoAgenteException("Estouro de Contexto");
        }
        
        System.out.println("Agente de Texto [" + this.nome + "] gerando resposta para: [" + input + "]");
    }
}
