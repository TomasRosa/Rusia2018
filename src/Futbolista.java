import java.util.Objects;

public class Futbolista extends Integrante implements comportamientoPartido
{
    private int nCamiseta;
    private String puesto;

    public Futbolista()
    {
        super();
    }

    public Futbolista(String nombre, String apellido, int edad, int id, int nCamiseta, String puesto)
    {
        super(nombre, apellido, edad, id);
        this.nCamiseta = nCamiseta;
        this.puesto = puesto;
    }

    public int getnCamiseta() {
        return nCamiseta;
    }

    public void setnCamiseta(int nCamiseta) {
        this.nCamiseta = nCamiseta;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString()
    {
        return super.toString() +"Futbolista{" +
                "nCamiseta=" + nCamiseta +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Futbolista that = (Futbolista) o;
        return nCamiseta == that.nCamiseta && Objects.equals(puesto, that.puesto);
    }
    @Override
    public void viajar()
    {
        System.out.println("Viajando futbolista...");
    }

    @Override
    public void concentrar()
    {
        System.out.println("Concentrando futbolista...");
    }

    @Override
    public void jugarPartido()
    {
        System.out.println("Jugando partido futbolista...");
    }
}
