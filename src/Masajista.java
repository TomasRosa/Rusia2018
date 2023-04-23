import java.util.Objects;

public class Masajista extends Integrante
{
    private String titulo;
    private int aniosExp;

    public Masajista()
    {
        super();
    }

    public Masajista(String nombre, String apellido, int edad, int id, String titulo, int aniosExp) {
        super(nombre, apellido, edad, id);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAniosExp()
    {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp)
    {
        this.aniosExp = aniosExp;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "titulo='" + titulo + '\'' +
                ", aniosExp=" + aniosExp +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Masajista masajista = (Masajista) o;
        return aniosExp == masajista.aniosExp && Objects.equals(titulo, masajista.titulo);
    }

    @Override
    public void viajar()
    {
        System.out.println("Viajando masajista...");
    }

    @Override
    public void concentrar()
    {
        System.out.println("Concentrando masajista...");

    }

    public void darAsistencia ()
    {
        System.out.println("Masajeando jugadores...");
    }
}
