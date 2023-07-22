
package programa1;

public class Arquero extends Personajes {

    int presicion;
    int habilidades_distancia;

    public Arquero(String nombre, double salud, double danio, double defensa, int presicion, 
            int habilidades_distancia) {
        super(nombre, salud, danio, defensa);
        this.presicion = presicion;
        this.habilidades_distancia = habilidades_distancia;
        this.danio= danio+presicion+habilidades_distancia;
    }
            
    @Override
    public void Atacar() {
        System.out.println("Le tira un flechazo que ni HawkEye se lo puede creer");
    }

    @Override
    public void Defender() {
        System.out.println("Se hace bolita");
    }
    
}
