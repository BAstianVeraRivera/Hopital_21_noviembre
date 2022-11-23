import java.util.ArrayList;

public class Hospital {
	private String nombreHospital;
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	public Hospital (String nombreHospital){
		this.nombreHospital=nombreHospital;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void agregarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("Paciente registrado");
	}
	public void agregarMedico(Medico medico) {
		this.medicos.add(medico);
		System.out.println("Médico registrado");
	}
	public void contratarMedico(Medico doctor) {
		this.personas.add(doctor);
		System.out.println("Médico contratado");
	}
	public void despedirMedico(Medico doctor) {
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