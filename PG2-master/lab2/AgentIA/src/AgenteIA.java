public abstract class AgenteIA {
    protected String nome;
    protected String status;

    public AgenteIA(String nome) {
        this.nome = nome;
        this.status = "IDLE";
    }

    public String getNome() {
        return this.nome;
    }

    public void conectarServidor() throws ErroComunicacaoIAException {
        if (Math.random() > 0.7) { 
            throw new ErroComunicacaoIAException("Falha na conexão com o cluster de GPUs (Timeout).");
        }
        System.out.println("Servidor conectado");
    }

    public abstract void processarRequisicao(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;
}