
public class Configurador {

    private String url;
    private String baseDatos;

    public Configurador(String url, String baseDatos) {
        this.url = url;
        this.baseDatos = baseDatos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
}

