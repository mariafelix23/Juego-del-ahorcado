public class NodoAhorcado{
   int numJugadores;
   String nombres;
   int puntaje;
   NodoAhorcado enlace = null;
   NodoAhorcado siguiente;
   
   public NodoAhorcado(int numJugadores, String nombres, int puntaje){
      this.numJugadores = numJugadores;
      this.nombres = nombres;
      this.puntaje = puntaje;
   } 
    public NodoAhorcado(int numJugadores, String nombres){
      this.numJugadores = numJugadores;
      this.nombres = nombres;
   } 
   public NodoAhorcado(NodoAhorcado enlace){
      this.enlace = enlace;
   }
   
   public NodoAhorcado(){}
   
   public NodoAhorcado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAhorcado siguiente) {
        this.siguiente = siguiente;
    } 

}