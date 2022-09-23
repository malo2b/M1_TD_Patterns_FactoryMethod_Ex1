public abstract class Personnage {

    protected String nom;

    public Personnage(String nom) {
        this.nom = nom;
    }

    void animer() {
        System.out.println(
            String.format("Le %s du nom de %s s'anime", getClass().getName(), nom)
        );
    }

}
