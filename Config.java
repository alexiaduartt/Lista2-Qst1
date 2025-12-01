import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Config {
    private static Config instance;  // Instância privada da classe (Singleton)
    private String appId;
    private String userName;
    private String language;
    private boolean offline;

    // Método para garantir que a classe tenha apenas uma instância
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();  // Criação da instância caso não exista
        }
        return instance;  // Retorno da instância única
    }

    // Getters e setters para os atributos
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    // Método para ler o arquivo de configuração
    public void readConfigFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {  // Certificando-se que a linha tem formato chave=valor
                    switch (parts[0].trim()) {
                        case "AppId":
                            this.appId = parts[1].trim();
                            break;
                        case "UserName":
                            this.userName = parts[1].trim();
                            break;
                        case "Language":
                            this.language = parts[1].trim();
                            break;
                        case "Offline":
                            this.offline = Integer.parseInt(parts[1].trim()) == 1;
                            break;
                        // Adicionar mais casos conforme os campos do arquivo
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}