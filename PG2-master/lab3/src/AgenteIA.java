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

    public void usarHabilidade(IAcaoAgente ferramenta, String comando) throws Exception {
        System.out.println("[" + this.nome + "] Usando habilidade externa");
        ferramenta.processarRequisicao(comando);
    }

    public abstract void executarTarefa(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;
}