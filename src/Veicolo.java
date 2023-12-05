public class Veicolo {

    private int velocita;

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void accelera(int incremento) {
        this.velocita += incremento;
    }

    public void decelera(int decremento) {
        this.velocita -= decremento;
    }

    public void fermarsi() {
        this.velocita = 0;
    }

}
