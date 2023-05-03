
package cursoyedades;

// @author Kenneth Paredes

import java.time.LocalDate;


public class CursoyEdades {

    public static void main(String[] args) {
        
        Estudiante[] estudiante = new Estudiante[3];
        
        Profesor profesor = new Profesor("1804531252", "Yeimy Reyna", 15);
        
        estudiante[0] = new Estudiante("Wade Paredes", "1805359203", "Pillaro", LocalDate.of(1998, 05, 28));
        estudiante[1] = new Estudiante("Abril Romero", "2107534863", "Lago Agrio", LocalDate.of(2002, 03, 15));
        estudiante[2] = new Estudiante("Valeria Miranda", "0814362518", "San Matero", LocalDate.of(2004, 10, 18));
        
        
        Curso curso = new Curso("Historiologia", 75, estudiante);
        curso.generarReporteInscritos();
    }
}
