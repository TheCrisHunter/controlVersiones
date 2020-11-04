package carreracaballos;
import java.util.Random;

public class CarreraCaballos {

    public static void main(String[] args) throws InterruptedException {
        
        Random minutos1 = new Random();
        int numero1;
      
        Random minutos2 = new Random();
        int numero2;
        
        Random minutos3 = new Random();
        int numero3;
        
        numero1=minutos1.nextInt(20);
        numero2=minutos2.nextInt(20);
        numero3=minutos3.nextInt(20);
        
        Caballos prueba1= new Caballos("Caballo1",numero1);
        Caballos prueba2= new Caballos("Caballo2",numero2);
        Caballos prueba3= new Caballos("Caballo2",numero3);
        
            Thread t=new Thread(prueba1);
            System.out.println("Sale el caballo1");
                t.start();
                
            Thread t2=new Thread(prueba2);
            System.out.println("Sale el caballo2");
                t2.start();
                
            Thread t3=new Thread(prueba3);
            System.out.println("Sale el caballo3");
                t3.start();
                //Cambio 1 para el commit
    }  
}
