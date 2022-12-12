package Composicion;

public class CocheCarreras {
    private String modelo;
    private Piloto conductor;
    private String cv;

    CocheCarreras(){}

    public CocheCarreras(String modelo, Piloto conductor, String cv) {
        this.modelo = modelo;
        this.conductor = conductor;
        this.cv = cv;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Piloto getConductor() {
        return conductor;
    }

    public void setConductor(Piloto conductor) {
        this.conductor = conductor;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "CocheCarreras{" +
                "modelo='" + modelo + '\'' +
                ", conductor=" + conductor +
                ", cv='" + cv + '\'' +
                '}';
    }

}

