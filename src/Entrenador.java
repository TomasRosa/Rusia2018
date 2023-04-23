import java.util.Objects;

public class Entrenador extends Integrante implements comportamientoPartido,comportamientoEntrenamiento
{
    private int formacion;
    private String estilo;

    public Entrenador()
    {
        super();
    }

    public Entrenador(String nombre, String apellido, int edad, int id, int formacion, String estilo)
    {
        super(nombre, apellido, edad, id);
        this.formacion = formacion;
        this.estilo = estilo;
    }

    public int getFormacion() {
        return formacion;
    }

    public void setFormacion(int formacion) {
        this.formacion = formacion;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "formacion=" + formacion +
                ", estilo='" + estilo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrenador that = (Entrenador) o;
        return formacion == that.formacion && Objects.equals(estilo, that.estilo);
    }

    @Override
    public void viajar()
    {
        System.out.println("Viajando entrenador...");
    }

    @Override
    public void concentrar()
    {
        System.out.println("Concentrando entrenador...");
    }

    @Override
    public void prepararEntrenamiento()
    {
        System.out.println("Entrenando... entrenador");
    }

    @Override
    public void jugarPartido()
    {
        System.out.println("Jugando partido... jugador");
    }
}
