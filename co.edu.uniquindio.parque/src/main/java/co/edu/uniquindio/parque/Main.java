package co.edu.uniquindio.parque;

import co.edu.uniquindio.parque.model.*;

public class Main {
    public static void main(String[] args) {
        Atraccion atraccion1=new Atraccion();
        atraccion1.setNombre("Carritos chocones");
        atraccion1.setHorarioOperacion("08:00 a.m - 6:00 p.m");
        atraccion1.setDescripcion("Carritos chocones");
        atraccion1.setEdadMinima(8);
        atraccion1.setEdadMaxima(90);
        atraccion1.setNivelPeligro("Bajo");
        atraccion1.setPesoMaximo(90);

        Atraccion atraccion2 = new Atraccion();
        atraccion2.setNombre("Montaña Rusa");
        atraccion2.setHorarioOperacion("10:00 a.m - 6:00 p.m");
        atraccion2.setDescripcion("Una montaña rusa con giros y caídas emocionantes");
        atraccion2.setEdadMinima(14);
        atraccion2.setEdadMaxima(75);
        atraccion2.setNivelPeligro("Alto");
        atraccion2.setPesoMaximo(100);

        Atraccion atraccion3 = new Atraccion();
        atraccion3.setNombre("Casa del Terror");
        atraccion3.setHorarioOperacion("4:00 p.m - 10:00 p.m");
        atraccion3.setDescripcion("Recorrido temático con efectos especiales y sustos");
        atraccion3.setEdadMinima(18);
        atraccion3.setEdadMaxima(80);
        atraccion3.setNivelPeligro("Medio");
        atraccion3.setPesoMaximo(120);

        Visitante visitante1=new Visitante();
        visitante1.setNombres("Raul");
        visitante1.setApellidos("Adolfo");
        visitante1.setEdad(16);
        visitante1.setNumeroIdentificacion("1234");
        visitante1.setSexo("Masculino");
        visitante1.setPeso(60);

        Visitante visitante2 = new Visitante();
        visitante2.setNombres("Laura");
        visitante2.setApellidos("Martínez");
        visitante2.setEdad(22);
        visitante2.setNumeroIdentificacion("5678");
        visitante2.setSexo("Femenino");
        visitante2.setPeso(55);

        Visitante visitante3 = new Visitante();
        visitante3.setNombres("Andrés");
        visitante3.setApellidos("Gómez");
        visitante3.setEdad(10);
        visitante3.setNumeroIdentificacion("9101");
        visitante3.setSexo("Masculino");
        visitante3.setPeso(35);

        edadAtraccionSubir(atraccion1, atraccion2, atraccion3, visitante1);
        edadAtraccionSubir(atraccion1, atraccion2, atraccion3, visitante2);
        edadAtraccionSubir(atraccion1, atraccion2, atraccion3, visitante3);

        obtenerNumeroAtraccionesNiños(atraccion1, atraccion2, atraccion3);

        obtenerVisitanteConMayorEdadAdulto(visitante1, visitante2, visitante3);
        obtenerVisitanteConMayorEdadAdolescente(visitante1, visitante2, visitante3);
        obtenerVisitanteConMayorEdadNiño(visitante1, visitante2, visitante3);

        obtenerVisitanteConMenorEdadAdolescente(visitante1, visitante2, visitante3);

        obtenerInformacionAdultos(visitante1, visitante2, visitante3);
    }

    public static void edadAtraccionSubir(Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3
            ,Visitante visitante) {

        String mensaje = visitante.getNombres() + " puede subir a: ";
        if(atraccion1.verificarEdadAtraccionSubir(visitante.getEdad())){
            mensaje+="Atraccion 1\n";
        }
        if(atraccion2.verificarEdadAtraccionSubir(visitante.getEdad())){
            mensaje+="Atraccion 2\n";
        }
        if(atraccion3.verificarEdadAtraccionSubir(visitante.getEdad())){
            mensaje+="Atraccion 3\n";
        }

        System.out.println(mensaje);
    }

    public static void obtenerNumeroAtraccionesNiños(Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3){
        int contador=0;
        String mensaje="";
        if(atraccion1.obtenerNumeroAtraccionesNiños(atraccion1.getEdadMinima())==1){
            contador++;
            mensaje += "\n- " + atraccion1.getNombre() + ": " + atraccion1.getDescripcion();
        }
        if(atraccion2.obtenerNumeroAtraccionesNiños(atraccion2.getEdadMinima())==1){
            contador++;
            mensaje += "\n- " + atraccion2.getNombre() + ": " + atraccion2.getDescripcion();
        }
        if(atraccion3.obtenerNumeroAtraccionesNiños(atraccion3.getEdadMinima())==1){
            contador++;
            mensaje += "\n- " + atraccion3.getNombre() + ": " + atraccion3.getDescripcion();
        }
        System.out.println("Numero de atracciones para niños " +  contador + ". Su informacion es:" + mensaje);
    }

    public static void obtenerVisitanteConMayorEdadAdulto(Visitante visitante1, Visitante visitante2, Visitante visitante3){

        Visitante mayor=null;
        if (visitante1.esAdulto() && visitante1.getEdad() > visitante2.getEdad() && visitante1.getEdad() > visitante3.getEdad()) {
            mayor=visitante1;
        } else if (visitante2.esAdulto() && visitante2.getEdad() > visitante1.getEdad() && visitante2.getEdad() > visitante3.getEdad()) {
            mayor=visitante2;
        } else if (visitante3.esAdulto() && visitante3.getEdad() > visitante1.getEdad() && visitante3.getEdad() > visitante2.getEdad()) {
            mayor=visitante3;
        }
        System.out.println("El visitante que es adulto y es mayor de todos es: " + mayor.getNombres());
    }
    public static void obtenerVisitanteConMayorEdadAdolescente(Visitante visitante1, Visitante visitante2, Visitante visitante3){

        Visitante mayorAdolescente=null;
        if (visitante1.esAdolescente()) {
            mayorAdolescente=visitante1;
        } else if (visitante2.esAdolescente()) {
            if (mayorAdolescente==null || visitante2.getEdad() > mayorAdolescente.getEdad() && visitante2.getEdad() > visitante3.getEdad()){
                mayorAdolescente=visitante2;
            }
        } else if (visitante3.esAdolescente()) {
            if (mayorAdolescente==null || visitante3.getEdad() > mayorAdolescente.getEdad()) {
                mayorAdolescente=visitante3;
            }
        }
        if (mayorAdolescente != null) {
            System.out.println("El visitante que es adolescente y es mayor de todos es: " + mayorAdolescente.getNombres());
        } else {
            System.out.println("No hay visitantes adolescentes.");
        }
    }
    public static void obtenerVisitanteConMayorEdadNiño(Visitante visitante1, Visitante visitante2, Visitante visitante3){

        Visitante mayorNiño = null;
        if (visitante1.esNiño()) {
            mayorNiño = visitante1;
        } else if (visitante2.esNiño()) {
            if (mayorNiño == null || visitante2.getEdad() > mayorNiño.getEdad() && visitante2.getEdad() > visitante3.getEdad()){
                mayorNiño = visitante2;
            }
        } else if (visitante3.esNiño()) {
            if (mayorNiño == null || visitante3.getEdad() > mayorNiño.getEdad()) {
                mayorNiño = visitante3;
            }
        }
        if (mayorNiño != null) {
            System.out.println("El visitante que es adolescente y es mayor de todos es: " + mayorNiño.getNombres());
        } else {
            System.out.println("No hay visitantes adolescentes.");
        }
    }

    public static void obtenerVisitanteConMenorEdadAdolescente(Visitante visitante1, Visitante visitante2, Visitante visitante3){

        Visitante menorAdolescente = null;
        if (visitante1.esAdolescente()) {
            menorAdolescente = visitante1;
        } else if (visitante2.esAdolescente()) {
            if (menorAdolescente == null || visitante2.getEdad() < menorAdolescente.getEdad() && visitante2.getEdad() < visitante3.getEdad()){
                menorAdolescente = visitante2;
            }
        } else if (visitante3.esAdolescente()) {
            if (menorAdolescente == null || visitante3.getEdad() < menorAdolescente.getEdad()) {
                menorAdolescente = visitante3;
            }
        }
        if (menorAdolescente != null) {
            System.out.println("El visitante que es adolescente y es menor de todos es: " + menorAdolescente.getNombres());
        } else {
            System.out.println("No hay visitantes adolescentes.");
        }
    }
    public static void obtenerInformacionAdultos(Visitante visitante1, Visitante visitante2, Visitante visitante3) {
        if (visitante1.esAdulto()) {
            System.out.println(visitante1.toString());
        }
        if (visitante2.esAdulto()) {
            System.out.println(visitante2.toString());
        }
        if (visitante3.esAdulto()) {
            System.out.println(visitante3.toString());
        }
    }
}