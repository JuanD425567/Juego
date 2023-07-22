package programa1;

public class Guerrero extends Personajes {

    private double fuerza;
    private int cuerpo_cuerpo;

    public Guerrero(String nombre, double salud, double danio, double defensa, double fuerza, int cuerpo_cuerpo
    ) {
        super(nombre, salud, danio, defensa);
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.cuerpo_cuerpo = cuerpo_cuerpo;
        
        this.danio= danio+fuerza+cuerpo_cuerpo;
    }

    @Override
    public void Atacar() {
        System.out.println("Le da un espadazo con mucho amor");
    }
    @Override
    public void Defender() {
        System.out.println("Se cubre con el escudo con mucho amor");
        salud = salud - 1;
    }

}
