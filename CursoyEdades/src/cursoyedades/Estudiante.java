package cursoyedades;

import java.time.LocalDate;

public class Estudiante {

    //ATRIBUTOS
   private String NombreApell;
   private String cedula;
   private String direccion;
   private LocalDate fechaNac;
   
     //CONSTRUCTOR
   
    public Estudiante(String NombreApell, String cedula, String direccion,
            LocalDate fechaNac) {
        this.NombreApell = NombreApell;   
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    //GETTERS
    public String getNombreApell() {
        return NombreApell;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }
     //SETTERS
    public void setNombreApell(String Nombres) {
        this.NombreApell = Nombres;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
     //LOCALES
    public double getPromedioAcademico(){
        return 0;
    }
    
    public int getEdad(){
        
        int edad;
        
        LocalDate now = LocalDate.now();
        edad = now.getYear() - fechaNac.getYear();
        return edad;
    }
}