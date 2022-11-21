import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GestorDatos {
    public static Hospital leerArchivoPaciente(Hospital hospital,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                hospital.getPacientes().add(new Paciente(data[0],Integer.parseInt(data[1]),data[2]));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }
    public static Hospital leerArchivoMedico(Hospital hospital,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                hospital.getMedicos().add(new Medico (data[0],Integer.parseInt(data[1]),data[2]));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }
    public static boolean registrarDatos(List objetos, String direccionArchivo) {
        try {
            File file = new File(direccionArchivo);
            if (Files.deleteIfExists(Paths.get("Ruta Archivo"))) {
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            } else {
                System.out.println("El fichero no puede ser borrado");
            }
            File fichero = new File(direccionArchivo);
            fichero.createNewFile();
            FileWriter fw = new FileWriter(fichero, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Object objeto : objetos) {
                bw.write(objeto.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
