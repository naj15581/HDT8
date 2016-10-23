/**
 * Interfaz para indicar los metodos a utilizar.
 * @author Luis Nájera 15581.
 * @author German Garcia 15008.
 * version 23.10.16
 */
public interface PriorityQueue<E extends Comparable<E>>
{
    public E getFirst();
    public E remove();
    public void add(E value);
    public boolean isEmpty();
    public int size();
    public void clear();
	
}