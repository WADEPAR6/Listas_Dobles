package cursoyedades;

public class Curso {
    
      //ATRIBUTOS
    private String nombre;
    private int cantHoras;
    private Estudiante[] estudiantes;
    
      //CONSTRUCTOR
    public Curso(String nombre, int cantHoras, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.estudiantes = estudiantes;
    }

      //METODOS
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getCantHoras() {
        return cantHoras;   
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    //LOCALES
    public double getPromedioEdad(){
        
        int suma =0;
        int count = 0;
        double total = 0;
        
        for (Estudiante e : estudiantes) {
            if (e != null) {
                suma += e.getEdad();
                count++;
            }
        }
        if( count ==0){
            return 0;
        }
        total = suma/count;
        
        return total;
    }
    
    public String getInfoEdadMENOR(){
        
        int Edadmin = Integer.MAX_VALUE;
        String InfoEdadmenor = "";
        
        for (Estudiante e : estudiantes){
            if (e != null && e.getEdad() < Edadmin) {
                Edadmin = e.getEdad();
                InfoEdadmenor = e.getNombreApell();
            }
        }
        return InfoEdadmenor;
    }
    
    public String getInfoEdadMAYOR(){
        
        int Edadmax = Integer.MIN_VALUE;
        String InfoEdadmayor = "";
        
        for (Estudiante e : estudiantes){
            if (e != null && e.getEdad() > Edadmax) {
                Edadmax = e.getEdad();
                InfoEdadmayor = e.getNombreApell();
            }
        }
        return InfoEdadmayor;
    }
    
    public void generarReporteInscritos(){
        System.out.println("Curso: "+ nombre);
        System.out.println("Cantidad de horas: "+ cantHoras);
        System.out.println("Estudiantes dentro del Curso:");
        for (Estudiante e : estudiantes) {
            if (e != null) {
                System.out.println("\t  - " + e.getNombreApell()
                                  +"\n\t  - " + e.getCedula()
                                  +"\n\t  - " + e.getDireccion()
                                  +"\n\t  - " + e.getFechaNac()
                                  +"\n-----------------------------------------\n");
            }
        }
        System.out.println("Edad Promedio del Curso:  " + this.getPromedioEdad()
                         + "\nEstudiante menor: \n\t" + this.getInfoEdadMENOR()
                         + "\nEstudiante mayor: \n\t" + this.getInfoEdadMAYOR());
    }
}
