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
        ModuloConexao.validarLink();
        System.out.println("Servidor conectado");
    }

    public abstract void executarTarefa(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;
}