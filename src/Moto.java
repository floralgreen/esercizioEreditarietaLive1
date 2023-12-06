public class Moto extends Veicolo{

    private String marca;
    private String modello;

    public Moto(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
        this.setVelocita(0);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public void accelera(int incremento) {
        super.accelera(incremento);
        System.out.println("La moto accelera e aumenta la velocita' di: " + incremento + "kmh");
    }

    @Override
    public void decelera(int decremento) {
        super.decelera(decremento);
        System.out.println("La moto decelera e diminuisce la velocita' di: " + decremento + "kmh");
    }

    @Override
    public void fermarsi() {
        super.fermarsi();
        System.out.println("La moto si ferma");
    }

    public void stampaStato(){
        System.out.println("Marca = " + marca +
                ", Modello = " + modello +
                ", Velocità attuale = " + getVelocita());
    }

}
