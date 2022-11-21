public class Medico extends Persona {
    private Especialidad especialidad;
    public Medico (String nombre, int edad, String run, Especialidad especialidad){
        super(nombre, edad, run);
        this.especialidad=especialidad;
    }
    public String toString(){
        return this.getNombre()+","+this.getEdad()+","+this.getRun()+","+this.especialidad;
    }

}