import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void processarFila(List<AgenteIA> lista, String comando) {
        for (AgenteIA agente : lista) {
            try {
                agente.executarTarefa(comando);
            } catch (FalhaProcessamentoAgenteException e) {
                System.out.println("Erro de processamento: " + e.getMessage());
            } catch (PromptInadequadoException e) {
                System.out.println("Prompt inadequado: " + e.getMessage());
            } catch (ErroComunicacaoIAException e) {
                System.out.println("Erro de comunicação: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        List<AgenteIA> orquestrador = new ArrayList<>();
        
        orquestrador.add(new AgenteTexto("GPT-4"));
        orquestrador.add(new AgenteImagem("DALL-E"));
        
        processarFila(orquestrador, "Gere uma imagem de um gato");
    }
}
