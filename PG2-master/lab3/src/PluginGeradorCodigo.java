public class PluginGeradorCodigo implements IAcaoAgente {
    @Override
    public void processarRequisicao(String prompt) throws Exception {
         if (prompt.length() > 500) {
            throw new FalhaProcessamentoAgenteException("limite de tokens de código");
        }
        System.out.println("Snippet de código Java gerado para: " + prompt);
    }
}


