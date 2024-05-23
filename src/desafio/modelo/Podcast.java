package desafio.modelo;

public class Podcast extends Audio {
    private String tipo;
    private String hosts;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas()>30){
            return 10;
        }else {
            return 8;
        }
    }
}
