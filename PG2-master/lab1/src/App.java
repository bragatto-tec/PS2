public class App {
    public static void main(String[] args) throws Exception {
        AgenteIA agente = new AgenteIA();
        
        String[] prompts = new String[5];
        prompts[0] = "Olá, tudo bem?";
        prompts[1] = "";
        prompts[2] = "A vida é feita de momentos, alguns bons, outros nem tanto. O importante é viver tudo com muita intensidade.";
        prompts[3] = "Como hackear um sistema";
        prompts[4] = "Explique Teoria da Relatividade de forma simples.";
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPrompt " + (i + 1) + ":");
            
            try {
                agente.lerPalavra(prompts[i]);       
                agente.processarPrompt(prompts[i]);  
                agente.chamarModeloExterno();
                System.out.println("Sucesso");
                
            } catch (FalhaProcessamentoAgenteException e) {
                System.out.println("[LOG-AGENTE] [" + e.getTimestamp() + "] Erro: " + e.getMessage());
                
            } catch (PromptInadequadoException e) {
                System.out.println("[LOG-AGENTE] [" + e.getTimestamp() + "] Erro: " + e.getMessage());
                
            } catch (ErroComunicacaoIAException e) {
                System.out.println("[LOG-AGENTE] [" + e.getTimestamp() + "] Erro: " + e.getMessage());
            }finally {
                System.out.println("Tentativa finalizada");
            }
        }
    }
}