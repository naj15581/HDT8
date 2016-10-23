/**
 * Clase utilizada para separar archivo .txt, enviar los datos individuales
 * a otras clases e imprimir el resultado.
 * @author Luis Nájera 15581.
 * @author German Garcia 15008.
 * version 23.10.16
 */


import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.util.Vector;

public class main {

	
    public static void main(String[] args) {
         //Vector que almacenará la información de los pacientes.
        Vector<Paciente> listaPacientes = new Vector<>();
        
        //Variables para separar las cadenas.
        File archivo;
        FileReader filer;
        BufferedReader buffer;
        
        //Variables para almacenar los datos.
        String nombre;
        String enfermedad;
        String prioridad;
        
        //Se separan las cadenas por nombre, enfermedad y prioridad.
        try {
          
           archivo = new File ("C:\\Users\\Luis Nájera\\Desktop\\pacientes.txt");
           filer = new FileReader (archivo);
           buffer = new BufferedReader(filer);

           String a = buffer.readLine();

           while(a!=null){
              int posicion1 = a.indexOf(',');
              nombre = a.substring(0, posicion1);
              String b = a.substring(posicion1+2);

              int posicion2= b.indexOf(',');
              enfermedad = b.substring(0, posicion2);
              prioridad = b.substring(posicion2+2);

              //Se ingresan los datos (nombre, enfermedad, prioridad) en paciente.
              //Cada nuevo paciente se almacena en un vector.
              listaPacientes.add(new Paciente(nombre, enfermedad, prioridad));
              
              a = buffer.readLine();
           }
        }catch (IOException e) {
            System.out.println("error");
	}
        
        //Se imprime el vector original.
        for(int j=0; j<listaPacientes.size(); j++){
            System.out.println(listaPacientes.get(j));
	}
        
        System.out.println("----------------------------------");
        
        
        //Se envia el vector con los pacientes a la clase VectorHeap para ordenarlo. 
        VectorHeap vector = new VectorHeap(listaPacientes);
        String ordenados="";
        while(vector.iterator().hasNext()){
            Paciente paciente = (Paciente) vector.poll();
            ordenados += paciente.toString()+"\n";
	}
        
        //Se imprime el vector ordenado.
        System.out.println(ordenados);
        
        
    }
}