package clases;
import java.io.File;
import java.io.IOException;

public class ClaseFile {
    public static void inicio() throws IOException{
        File fichero;
        fichero = new File("datos.txt");
        if (!fichero.exists()) {
            fichero.createNewFile();
            System.out.println("Fichero creado");
        } else {
            System.out.println("Fichero ya estaba creado");
        }
        // path absoluto.

        File fichero2 = new File("C:\\Users\\Daniel\\Desktop\\programs\\manejo de ficheros\\flujos\\datos2.txt");
        fichero2.createNewFile();

        File directorio = new File("directorio");
        directorio.mkdir();
        File directorio2 = new File(".\\directorio\\subdirectorio\\ultimodirectorio");
        directorio2.mkdirs();

        // mover fichero a ultimodirectorio.
        System.out.println(fichero.getAbsolutePath());
        File fichero3 = new File(".\\directorio\\subdirectorio\\ultimodirectorio\\datos.txt");
        System.out.println( fichero.renameTo(fichero3));
        System.out.println(fichero.getAbsolutePath());
        fichero.createNewFile();
        fichero.delete();
        fichero = fichero3;
        System.out.println(fichero.getAbsolutePath());
    }
    
}
