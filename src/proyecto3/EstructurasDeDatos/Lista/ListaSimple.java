package proyecto3.EstructurasDeDatos.Lista;

/**
 * Estructura de datos, lista simple enlazada
 * @param <T> para generics
 */
public class ListaSimple<T> { private NodeLista<T> head;
  private int capacidad;
  
  public ListaSimple() { 
    head = null;
    capacidad = 0;
  }
  /**
     * Agrega un nuevo nodo al final de la lista existente, o al principio si esta vacia
     * @param data para darle el valor al nuevo nodo a agregar
     */
  public void add(T data) {
    if (capacidad == 0) {
      NodeLista<T> aux = new NodeLista(data);
      head = aux;
      head.setNext(null);
      capacidad += 1;
    } else {
      NodeLista<T> current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      NodeLista<T> aux = new NodeLista(data);
      aux.setNext(null);
      current.setNext(aux);
      capacidad += 1;
    }
  }
  /**
     * Devuelve el dato del en la posicion de la lista a elegir
     * @param i para indicar la posicion de la lista a devolver el dato del nodo
     * @return el valor del nodo en la posicion indicada
     */
  public T get(int i) {
    NodeLista<T> aux = getHead();
    int x = 0;
    while (x != i) {
      aux = aux.getNext();
      x++;
    }
    if (aux == null) {
      System.out.println("El elemento no se encuentra en la lista");
      return null;
    }
    return aux.getData();
  }
  /**
     * Obtiene el nodo segun la referencia
     * @param i indice de busqueda
     * @return el nodo que coincide con el requerido
     */
  public NodeLista<T> getNode(int i)
  {
    NodeLista<T> aux = getHead();
    int x = 0;
    while (x != i) {
      aux = aux.getNext();
      x++;
    }
    if (aux == null) {
      System.out.println("El elemento no se encuentra en la lista");
      return null;
    }
    return aux;
  }
  
  public NodeLista<T> getHead()
  {
    return head;
  }
  
  public void setHead(NodeLista<T> head) {
    this.head = head;
  }
 
  public int size()
  {
    return capacidad;
  }
  /**
       * Verifica si la lista esta vacia
       * @return true o false si esta vacia
       */
  public boolean isEmpty()
  {
    if (capacidad == 0) {
      return true;
    }
    return false;
  }
  
  public void print()
  {
    
    NodeLista<T> aux = head;
    if (aux == null) {
        System.out.println("Lista Vacia");
    }else{
        System.out.print("[");
    for(int i=0; i<this.size()-1;i++){
        System.out.print(this.get(i) + ",");
        aux = aux.getNext();
        }
        System.out.println(aux.getData() + "]");
    }
 } 
}