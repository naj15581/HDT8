/**
 * Prueba de la clase main.
 * @author Luis Nájera 15581.
 * @author German Garcia 15008.
 * version 23.10.16
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class mainTest {
    
    public mainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testMain() throws FileNotFoundException, IOException {
        Vector<Paciente> listaPacientes = new Vector<>();
        File archivo;
        FileReader filer;
        BufferedReader buffer;
        
        //Variables para almacenar los datos.
        String nombre;
        String enfermedad;
        String prioridad;
        
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
            listaPacientes.add(new Paciente(nombre, enfermedad, prioridad));
              
            a = buffer.readLine();
           }
        for(int j=0; j<listaPacientes.size(); j++){
            System.out.println(listaPacientes.get(j));
	}
        
        if (a!=null){
            fail("The test case is a prototype.");
        }
        
    }
    
}
