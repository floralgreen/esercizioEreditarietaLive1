public class Main {

    public static void main(String[] args) {

        Automobile alfaRomeo = new Automobile("Alfa Romeo", "156");
        Moto suzuki = new Moto("Suzuki", "Hayabusa");

        alfaRomeo.stampaStato();
        suzuki.stampaStato();


        alfaRomeo.accelera(80);
        suzuki.accelera(100);

        System.out.println();

        alfaRomeo.decelera(20);
        suzuki.fermarsi();

        alfaRomeo.stampaStato();
        suzuki.stampaStato();

    }

}
