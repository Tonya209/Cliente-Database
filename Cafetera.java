
public class Cafetera {
    
   private int capacidadMaxima;
   private int capacidadActual;
    
    // constructor predeterminado
    public Cafetera(){
        capacidadMaxima = 1000;
        capacidadActual = 0;
    }
    
    // constructor con la capacidad máxima
   public Cafetera(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        capacidadActual = capacidadMaxima;
    }
    
    // constructor la capacidad y la cantidad actual
   public Cafetera(int capacidadMaxima, int capacidadActual){
       
        if(capacidadActual > capacidadMaxima){
            capacidadActual = capacidadMaxima;
        }
        
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
   
    
   //getters y setters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

   
   
    // metodo llenarCafetera
    public void llenarCafetera(){
        
        capacidadActual = capacidadMaxima;
        System.out.println("La cafetera está llena. La capacidad actual es " 
                + capacidadActual+ " que es igual a la capacidad máxima: " 
                + capacidadMaxima);
    }
    
    
    // metodo servirTaza
    public void servirTaza(int capacidadTaza){
        
        int restoCafetera = capacidadActual - capacidadTaza;
            if (capacidadActual < capacidadTaza && capacidadActual > 0){
            System.out.println("Solo podemos servir " + capacidadActual + " ml de cafe.");
            }
            else if(capacidadActual <= 0){
                    System.out.println("No hay más cafe");
            }
            else {
                System.out.println("Hemos servido el cafe.");
            }
            capacidadActual = restoCafetera;
        
        }
        

    
     // metodo vaciarCafetera
    public void vaciarCafetera(){
        capacidadActual = 0;
        System.out.println("La cafetera está vacia. La capacidad actual es: " + capacidadActual);
    }
       
        
      // metodo agregarCafe
    public void agregarCafe(int cantidadDeCafe){
        capacidadActual = capacidadActual + cantidadDeCafe;
        
        if (capacidadActual > capacidadMaxima){
            capacidadActual = capacidadMaxima;
        }
        System.out.println("Ahora hay " + capacidadActual + " ml de cafe en la cafetera.");
    }

     
    
}
