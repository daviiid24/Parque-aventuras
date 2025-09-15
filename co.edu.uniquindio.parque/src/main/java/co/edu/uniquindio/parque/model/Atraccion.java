package co.edu.uniquindio.parque.model;

public class Atraccion {
    private String nombre;
    private String horarioOperacion;
    private String descripcion;
    private int edadMinima;
    private int edadMaxima;
    private String nivelPeligro;
    private double pesoMaximo;

    public Atraccion() {
    }

    public Atraccion(String nombre, String horarioOperacion, String descripcion,
                     int edadMinima, int edadMaxima, String nivelPeligro, double pesoMaximo) {
        this.nombre = nombre;
        this.horarioOperacion = horarioOperacion;
        this.descripcion = descripcion;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.nivelPeligro = nivelPeligro;
        this.pesoMaximo = pesoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorarioOperacion() {
        return horarioOperacion;
    }

    public void setHorarioOperacion(String horarioOperacion) {
        this.horarioOperacion = horarioOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public boolean verificarEdadAtraccionSubir(int edadVisitante) {
        return edadVisitante >= edadMinima && edadVisitante <= edadMaxima;
    }

    public int obtenerNumeroAtraccionesNiños(int atraccion) {
        if (edadMinima <= 10) {
            return 1;
        } else {
            return 0;
        }
    }

}
