import java.io.IOException;

public class Launcher {

    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar() {
        Hospital hospital = new Hospital("Hospital Quepe");
        Paciente paciente1 = new Paciente("Christian Ortega", 37, "21.277.106-6");
        Medico doctor1 = new Medico("Nacho Riquelme", 27, "19.457.196-k", Especialidad.PEDIATRIA);
        hospital.contratarMedico(doctor1);
        hospital.agregarMedico(doctor1);
        hospital.agregarPaciente(paciente1);
        GestorDatos.registrarDatos(hospital.getMedicos(),"Médico.txt");
        GestorDatos.registrarDatos(hospital.getPacientes(),"Paciente.txt");
        GestorPDF gestorPdf = new GestorPDF();
        try {
            gestorPdf.generarPDF(paciente1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
