public class Simulateur {

    private Personnage monPersonnage;

    public Simulateur(Personnage monPersonnage) {
        this.monPersonnage = monPersonnage;
    }

    public void simuler() {
        monPersonnage.animer();
    }
}
