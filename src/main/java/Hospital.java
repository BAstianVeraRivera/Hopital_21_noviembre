import java.util.ArrayList;

public class Hospital {
	private String nombreHospital;
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	public ArrayList<Persona> getMedicos() {
		return personas;
	}
	public ArrayList<Persona> getPacientes() {
		return personas;
	}

	public void agregarPaciente(Paciente paciente) {
		this.personas.add(paciente);
		System.out.println("Paciente agregado");
	}
	public void contratarMédico(Medico doctor) {
		this.personas.add(doctor);
		System.out.println("Médico contratado");
	}
	public void despedirMédico(Medico doctor) {
		this.personas.remove(doctor);
		System.out.println("Médico despedido");
	}

	public String getNombreHospital() {
		return this.nombreHospital;
	}

	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}
}