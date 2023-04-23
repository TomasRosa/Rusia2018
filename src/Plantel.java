import java.util.ArrayList;
import java.util.Scanner;

public class Plantel
{
    private Entrenador entrenador;
    private ArrayList<Futbolista> futbolistas;
    private ArrayList<Ayudante> ayudantes;
    private ArrayList<Masajista> masajistas;

    public Plantel ()
    {
        this.futbolistas = new ArrayList<Futbolista>();
        this.masajistas = new ArrayList<Masajista>();
        this.ayudantes = new ArrayList<>();
    }
    public Plantel (Entrenador entrenadorcito)
    {
        this.entrenador = entrenadorcito;
        this.futbolistas = new ArrayList<Futbolista>(23);
        this.masajistas = new ArrayList<Masajista>();
        this.ayudantes = new ArrayList<>(4);
    }
    public void agregarFutbolistas (Scanner scan)
    {
        char control = 's';
        int i = 0;

        while (control == 's' && i < 23)
        {
            System.out.println("Ingrese nombre del jugador. ");
            scan.nextLine();
            String nombre = scan.nextLine();
            System.out.println("Ingrese apellido del jugador. ");
            String apellido = scan.nextLine();
            System.out.println("Ingrese la edad del jugador. ");
            int edad = scan.nextInt();
            System.out.println("Ingrese la ID del jugador. ");
            int id = scan.nextInt();
            System.out.println("Ingrese el N de camiseta. ");
            int nCamiseta = scan.nextInt();
            System.out.println("Ingrese su puesto. ");
            String puesto = scan.nextLine();

            Futbolista jugador = new Futbolista(nombre,apellido,edad,id,nCamiseta,puesto);

            this.futbolistas.add(jugador);

            i++;
            System.out.println("Desea seguir agregando futbolistas? s/n. ");
            control = scan.next().charAt(0);
        }
    }
    public void agregarEntrenador (Scanner scan)
    {
        System.out.println("Ingrese nombre del entrenador. ");
        scan.nextLine();
        String nombre = scan.nextLine();
        System.out.println("Ingrese apellido del entrenador. ");
        String apellido = scan.nextLine();
        System.out.println("Ingrese la edad del entrenador. ");
        int edad = scan.nextInt();
        System.out.println("Ingrese la ID del entrenador. ");
        int id = scan.nextInt();
        System.out.println("Ingrese la formacion que utiliza el entrenador. ");
        int formacion = scan.nextInt();
        System.out.println("Ingrese el estilo del entrenador. ");
        String estilo = scan.nextLine();

        Entrenador entrenador = new Entrenador(nombre,apellido,edad,id,formacion,estilo);
        this.entrenador = entrenador;
    }
    public void agregarMasajistas (Scanner scan)
    {
        char control = 's';

        while (control == 's')
        {
            System.out.println("Ingrese nombre del masajista. ");
            scan.nextLine();
            String nombre = scan.nextLine();
            System.out.println("Ingrese apellido del masajista. ");
            String apellido = scan.nextLine();
            System.out.println("Ingrese la edad del masajista. ");
            int edad = scan.nextInt();
            System.out.println("Ingrese la ID del masajista. ");
            int id = scan.nextInt();
            System.out.println("Ingrese el titulo del masajista. ");
            String titulo = scan.nextLine();
            System.out.println("Ingrese los anios de exp del masajista.");
            int aniosExp = scan.nextInt();

            Masajista masajista = new Masajista(nombre,apellido,edad,id,titulo,aniosExp);

            this.masajistas.add(masajista);

            System.out.println("Desea seguir agregando masajistas? s/n. ");
            control = scan.next().charAt(0);
        }
    }
    public void agregarAyudantesDeCampo (Scanner scan)
    {
        char control = 's';
        int i = 0;

        while (control == 's' && i <= 4)
        {
            System.out.println("Ingrese nombre del ayudante de campo. ");
            scan.nextLine();
            String nombre = scan.nextLine();
            System.out.println("Ingrese apellido del ayudante de campo. ");
            String apellido = scan.nextLine();
            System.out.println("Ingrese la edad del ayudante de campo. ");
            int edad = scan.nextInt();
            System.out.println("Ingrese la ID del ayudante de campo. ");
            int id = scan.nextInt();
            System.out.println("Ingrese la metodologia del ayudante de campo.");
            String metodologia = scan.nextLine();

            Ayudante ayudanteDeCampo = new Ayudante(nombre,apellido,edad,id,metodologia);
            this.ayudantes.add(ayudanteDeCampo);
            i++;

            System.out.println("Desea agregar mas ayudantes de campo? s/n. ");
            control = scan.next().charAt(0);
        }
    }
    public void agregarPersonasAlPlantel (Scanner scan)
    {
        System.out.println("Agregando entrenador...");
        agregarEntrenador(scan);
        System.out.println("Agregando futbolistas...");
        agregarFutbolistas(scan);
        System.out.println("Agregando ayudantes de campo...");
        agregarAyudantesDeCampo(scan);
        System.out.println("Agregando masajistas...");
        agregarMasajistas(scan);
    }
    public int contarCantidadFutbolistasPlantel (int id)
    {
        return this.futbolistas.size();
    }
    public void mostrarAlguno (String nombreClase)
    {
        if(nombreClase.equalsIgnoreCase("Futbolistas"))
        {
            System.out.println("Futbolistas...");
            System.out.println(this.futbolistas.toString());
        }
        else if(nombreClase.equalsIgnoreCase("Entrenador"))
        {
            System.out.println("Entrenador...");
            System.out.println(this.entrenador.toString());
        }
        else if(nombreClase.equalsIgnoreCase("Ayudante"))
        {
            System.out.println(this.futbolistas.toString());
            System.out.println("Ayudantes de campo...");
        }
        else if(nombreClase.equalsIgnoreCase("Masajista"))
        {
            System.out.println("Masajistas...");
            System.out.println(this.masajistas.toString());
        }
    }
    public void mostrarTodoElPlantel ()
    {
        System.out.println("Entrenador...");
        System.out.println(this.entrenador.toString());
        System.out.println("Futbolistas...");
        System.out.println(this.futbolistas.toString());
        System.out.println("Ayudantes de campo...");
        System.out.printf(this.ayudantes.toString());
        System.out.println("Masajistas...");
        System.out.println(this.masajistas.toString());
    }
}
