package classes;

public class Planejar {
    private String destino;
    private int dataI;
    private int dataIV;
    private int horario;

    

    public Planejar(String destino, int dataI, int dataIV, int horario) {
        this.destino = destino;
        this.dataI = dataI;
        this.dataIV = dataIV;
        this.horario = horario;
    }

    public Planejar() {
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getDataI() {
        return dataI;
    }
    public void setDataI(int dataI) {
        this.dataI = dataI;
    }
    public int getDataIV() {
        return dataIV;
    }
    public void setDataIV(int dataIV) {
        this.dataIV = dataIV;
    }
    public int getHorario() {
        return horario;
    }
    public void setHorario(int horario) {
        this.horario = horario;
    }

    

}
