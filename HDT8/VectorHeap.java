/**
 * Clase utilizada para crear un vector basado en Heap el cual hereda 
 * la clase PriorityQueue para ordenar los datos en base a su importancia. 
 * @author Luis Nájera 15581.
 * @author German Garcia 15008.
 * version 23.10.16
 */


import java.util.PriorityQueue;
import java.util.Vector;

public class VectorHeap < E extends Comparable<E>> extends PriorityQueue<E>{

        protected Vector<E> data; //data almacena la información.
	  
        /**
         * Constructor.
         * Recibe el vector con la informacion de cada paciente.
         * @param v 
         */
        public VectorHeap(Vector<E> v){ 
            int i;                              
            data = new Vector<E>(v.size());
            for (i = 0; i < v.size(); i++){ 
                add(v.get(i));
            }
	}
}
