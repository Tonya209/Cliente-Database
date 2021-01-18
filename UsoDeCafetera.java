
public class UsoDeCafetera {
    
    
    public static void main(String[] args){
        
        Cafetera c1 = new Cafetera();
        System.out.println("Capacidad Maxima de la cafetera: " + c1.getCapacidadMaxima());
        System.out.println("Capacidad Actual de la cafetera: " + c1.getCapacidadActual());
        
        Cafetera c2 = new Cafetera(200);
        System.out.println("Capacidad Maxima de la cafetera: " + c2.getCapacidadMaxima());
        System.out.println("Capacidad Actual de la cafetera: " + c2.getCapacidadActual());
        
        Cafetera c3 = new Cafetera(400, 800);
        System.out.println("Capacidad Maxima de la cafetera: " + c3.getCapacidadMaxima());
        System.out.println("Capacidad Actual de la cafetera: " + c3.getCapacidadActual());
        
        System.out.println();
        
        c1.llenarCafetera();
        c2.llenarCafetera();
        c3.llenarCafetera();
        
        System.out.println();
        
        c3.servirTaza(250);
        c3.servirTaza(250);
        c3.servirTaza(250);
        
        c2.servirTaza(300);
        c2.servirTaza(150);
        c2.servirTaza(150);
        
        c1.servirTaza(50);
        c1.servirTaza(50);
        c1.servirTaza(250);
        
        System.out.println();
        
        c1.vaciarCafetera();
        c2.vaciarCafetera();
        c3.vaciarCafetera();
        
        System.out.println();
        
        c1.agregarCafe(500);
        c2.agregarCafe(100);
        c3.agregarCafe(600);
           
        
        
}
}
