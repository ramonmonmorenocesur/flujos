package clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FlujoByteVariosAccesos {
    public static void inicio() throws IOException {
        Scanner teclado = new Scanner(System.in);
        // abrir flujo para escribir y cerrarlo.
        escribir(true);
        // abrir flujo para leer y mostrar datos
        leer();
        // repetir lo mismo pero con letras mayúsculas para ver si se mantienen todos los datos.
        escribir(false);
        leer();
        teclado.close();
    }

    public static void escribir(boolean minusculas) throws IOException {
        int inicio;
        if (minusculas){
            inicio = 97;
        } else {
            inicio = 65;
        }
        FileOutputStream escritor = null;
        try {
            escritor = new FileOutputStream("datos.dat",true);
            for (int i = inicio; i < (inicio+26); i++) {
                escritor.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (escritor!=null) escritor.close();
        }
    }

    public static void leer() throws IOException {
        FileInputStream lector = null;
        try {
            lector = new FileInputStream("datos.dat");
            int valor = lector.read();
            while (valor!=-1){
                System.out.print( (char) valor + " ");
                valor = lector.read();
            }  
            System.out.println();         
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (lector!=null) lector.close();
        }
    }
}
