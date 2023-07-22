package programa1;

public abstract class Personajes {

    protected String nombre;
    protected double salud;
    protected double danio;
    protected double defensa;

    public Personajes(String nombre, double salud, double danio, double defensa) {
        this.nombre = nombre;
        this.salud = 10;
        this.danio = danio;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public abstract void Atacar();

    public abstract void Defender();

    public void ObtenerVida() {
        double vida = salud - danio;
        System.out.println("La vida de el personaje es: " + vida);
    }

}
