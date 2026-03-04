public class PluginPesquisaWeb implements IAcaoAgente {
    @Override
    public void processarRequisicao(String prompt) throws Exception {
        if(prompt.toLowerCase().contains("hackear") ||
           prompt.toLowerCase().contains("roubar")) {
            throw new PromptInadequadoException("Palavra inadequada sendo lançada");
        }
        System.out.println("Tudo Certo");
    }
}
