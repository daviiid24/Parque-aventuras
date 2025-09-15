package co.edu.uniquindio.parque.model;

public class Visitante {

    private String nombres;
    private String apellidos;
    private int edad;
    private String numeroIdentificacion;
    private String tipoVisitante; // adulto, adolescente, niño
    private String sexo;
    private double peso;

    public Visitante() {
    }

    public Visitante(String nombres, String apellidos, int edad,
                     String numeroIdentificacion, String sexo, double peso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.sexo = sexo;
        this.peso = peso;
        this.tipoVisitante = determinarTipoVisitante(edad);
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.tipoVisitante = determinarTipoVisitante(edad);
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private String determinarTipoVisitante(int edad) {
        if (edad >= 18) {
            return "adulto";
        } else if (edad >= 11) {
            return "adolescente";
        } else if (edad >= 3) {
            return "niño";
        } else {
            return "no permitido";
        }
    }
    public boolean esAdulto() {
        return edad >= 18;
    }
    public boolean esAdolescente() {
        return edad >= 11 && edad <= 17;
    }
    public boolean esNiño() {
        return edad >= 3 && edad <= 10;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", tipoVisitante='" + tipoVisitante + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
