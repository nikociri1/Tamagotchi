package tamagotchi;

public class Tamagotchi {

    private String nombre;

    private Integer nivel;

    private String estado;

    //TODO: Refactor
     private final Integer tiempo_en_mins =90;

//Constructores
    public Tamagotchi(){
        this.nivel= 0;
        this.estado="Hambriento";

    }

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
    }

    public Tamagotchi(Integer nivel) {
        this.nivel=nivel;
    }

//Metodos getters y setters

    public String getNombre(){
        return nombre;
    }

    public Integer getNivel(){
        return nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado=estado;
    }

    //Metodos de la aplicacion

    //Comer
    public void comer() {
        if (estado.equals("Hambriento")){
            setEstado("Contento");
        }else if (estado.equals("Contento")){
            nivel++;
        } else if (estado.equals("Aburrido")&& tiempo_en_mins > 80) {
            setEstado("Contento");

        }
    }

    //Jugar
    public void jugar() {
        if (estado.equals("Contento")){
            nivel += 2;
        } else if (estado.equals("Aburrido")) {
            setEstado("Contento");
        } else if (estado.equals("Hambrienta")) {
            System.out.println("La mascota no puede jugar debido a que esta Hambrienta, necesita comer.");
        }
    }
}
