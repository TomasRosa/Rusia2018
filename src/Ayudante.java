import java.util.Objects;

public class Ayudante extends Integrante implements comportamientoEntrenamiento,comportamientoPartido
{
    private String metodologia;

    public Ayudante()
    {
       super();
    }

    public Ayudante(String nombre, String apellido, int edad, int id, String metodologia)
    {
        super(nombre, apellido, edad, id);
        this.metodologia = metodologia;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "metodologia='" + metodologia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ayudante ayudante = (Ayudante) o;
        return Objects.equals(metodologia, ayudante.metodologia);
    }

    @Override
    public void viajar()
    {
        System.out.println("Viajando ayudante...");
    }

    @Override
    public void concentrar()
    {
        System.out.println("Concentrando ayudante...");
    }

    @Override
    public void prepararEntrenamiento()
    {
        System.out.println("Preparando entrenamiento ayudante...");
    }

    @Override
    public void jugarPartido()
    {
        System.out.println("Jugando partido ayudante...");
    }
}
