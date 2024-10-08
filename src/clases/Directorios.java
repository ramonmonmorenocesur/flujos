package clases;
import java.io.File;

public class Directorios {
    public static void inicio() {
        // listar directorios y ficheros de nuestro directorio de trabajo.
        // ficheros lleva una F antes.
        // directorios llevan una D delante.
        File directorio = new File(".");
        File[] listado = directorio.listFiles();
        for (int i = 0; i < listado.length; i++) {
            if (listado[i].isDirectory()) {
                System.out.println("D " + listado[i].getName());
                File[] listado2 = listado[i].listFiles();
                for (int j = 0; j < listado2.length; j++) {
                    if (listado2[j].isDirectory()) {
                        System.out.println("   D " + listado2[j].getName());
                    } else {
                        System.out.println("   F " + listado2[j].getName());
                    }
                }
            } else {
                System.out.println("F " + listado[i].getName());
            }
        }

    }
}
