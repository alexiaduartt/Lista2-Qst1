public class Main {
    public static void main(String[] args) {
        // Obter a instância da configuração
        Config config = Config.getInstance();
        
        // Ler o arquivo de configuração
        config.readConfigFile("config.txt");  // Substituir com o caminho do arquivo real
        
        // Imprimir os dados da configuração
        config.printConfig();
    }
}