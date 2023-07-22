package programa1;

public class Mago extends Personajes {
    double hechizos;
    double poderesmagicos;

    public Mago(String nombre, double salud, double danio, double defensa, double hechizos, double 
            poderesmagicos) {
        super(nombre, salud, danio, defensa);
        this.hechizos = hechizos;
        this.poderesmagicos = poderesmagicos;
        
        this.danio = danio+hechizos+poderesmagicos;
    }
    

    @Override
    public void Atacar() {
        System.out.println("Le pega un bastonazo");
    }

    @Override
    public void Defender() {
        System.out.println("El hechizero ni se inmuta");
    }
}
