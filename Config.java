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
}