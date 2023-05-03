package cursoyedades;

public class Profesor {
    
      //ATRIBUTOS
    private String cedula;
    private String nombreApell;
    private int aniosExperiencia;
    
      //CONSTRUCTOR
    public Profesor(String cedula, String nombreApell, int aniosExperiencia) {
        this.cedula = cedula;
        this.nombreApell = nombreApell;
        this.aniosExperiencia = aniosExperiencia;
    }
      //METODOS
    //GETTERS
    public String getCedula() {
        return cedula;
    }

    public String getNombreApell() {
        return nombreApell;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    //SETTERS
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombreApell(String nombreApell) {
        this.nombreApell = nombreApell;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    //LOCALES

}








