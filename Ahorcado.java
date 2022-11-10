import java.util.Scanner;
public class Ahorcado{
   static int max=5;
   static int frente=-1;
   static int fin=-1;
   static String cola[] = new String[max];

   public static void main(String args[]){
      String opc, opc2;
      int opcBien,opc1=0, opcBien2=0, opc22=0;
      Scanner leer = new Scanner(System.in);
      Ahorcado colaC= new Ahorcado();
      System.out.println(">> AHORCADO <<");
      do{
         System.out.println();
         System.out.println(">> Menu <<");
         System.out.println("[1] Ingresar Jugador");
         System.out.println("[2] Historial");
         System.out.println("[3] Salir");
         System.out.print("Ingrese una opcion [1-3]: ");
         opc = leer.nextLine();
         opcBien=entrada(opc);
         if(opcBien==1){
            opc1 = Integer.parseInt(opc);  
         }
         else
            System.out.println(">>Numero entre [1-3]<<");
         switch(opc1){
            case 1:
                  System.out.println("\n>>Categorias:");
                  System.out.println("[1] Animales");
                  System.out.println("[2] Colores");
                  System.out.println("[3] Aleatorio");
                  do{
                  System.out.print("Ingrese una opcion [1-3]: ");
                  opc2=leer.nextLine();
                  opcBien2=entrada(opc2);
                     if(opcBien2==1){
                        opc22=Integer.parseInt(opc2);
                     }
                     else
                        System.out.println(">>Numero entre [1-3]<<");
                  }while(opcBien2!=1);
                  switch(opc22){
                     case 1:
                        System.out.println(">> ANIMALES <<");
                        colaC.validar();
                     break;
                     case 2:
                        System.out.println(">> COLORES <<");
                        colaC.validar();
                     break;
                     case 3:
                        System.out.println(">> ALEATORIO <<");
                        colaC.validar();
                     break;
                  }
               
            break;
            case 2:
               colaC.imprimir();
            break;
         }
      }while(opc1!=3);       
   }
   public static void insertar(String dato){
      if(fin == max-1)
         fin =0;
      else
         fin = fin+1;
      cola[fin]=dato;
      if(frente ==-1)
         frente =0;
   }
    public static void validar(){
      Scanner leer = new Scanner(System.in);
      String nombre;
      if((fin==max-1 && frente==0) || (fin+1 == frente))
         System.out.println("\n>> No hay espacio <<");
      else{
         System.out.print("Ingrese nombre del jugador: ");
         nombre=leer.nextLine();
         insertar(nombre); 
      }
   }
   
   public static void imprimir(){
     System.out.println();
     System.out.println(">>Historial DE AHORCADO<<");
     if(frente ==-1)
      System.out.println(">> No existen jugadores <<");
     else{ 
       for(int me=0; me<max; me++){
         System.out.printf("|%s\t",cola[me]);
       }
       System.out.println();
       for(int dra=0; dra<max; dra++){
         System.out.printf("%d\t\t",dra);
       }
       System.out.println();
      }
   }
   public static int entrada(String opc){
      try{
         Integer.parseInt(opc);
         return 1;
      }catch(NumberFormatException e){
         return 2;
      }
   }
 } 
