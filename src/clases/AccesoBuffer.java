package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoBuffer {
public static void inicio() throws IOException{
    mostrarContenido("texto.txt");
        
    

}
public static boolean mostrarContenido(String nombreFichero) throws IOException{
    BufferedReader lector = null;
    try {
        lector = new BufferedReader(new FileReader(nombreFichero));
        String frase = lector.readLine();
        while (frase!=null) {
            System.out.println(frase);
            frase=lector.readLine();
            
        }
        
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
       System.out.println(e.getMessage());
    }finally{
        if (lector!=null) lector.close();
    }

    return true;

}
public static boolean mostrarYcontarContenido(String nombreFichero) throws IOException{
    BufferedReader lector = null;
    int numLineas=0;
    int numVacias=0;
     String frase;
    try {
        lector = new BufferedReader(new FileReader(nombreFichero));
         frase = lector.readLine();
        while (frase!=null) {
            numLineas++;
            if(frase.length()==0) numVacias++;
            System.out.println(frase);
            frase=lector.readLine();
          
            
        }
        System.out.println(" el numero de lineas es " + numLineas+" hay un total de "+numVacias+" lineas vacias" );
        
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
       System.out.println(e.getMessage());
    }finally{
        if (lector!=null) lector.close();
    }

    return true;




}








    
}
