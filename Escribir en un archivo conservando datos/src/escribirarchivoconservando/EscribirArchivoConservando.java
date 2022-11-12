package escribirarchivoconservando;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EscribirArchivoConservando {

    public static void main(String[] args) {
        File archivo; //Para manipular el archivo
        FileWriter escribir; //Para escribir en el archivo
        PrintWriter linea; //Para escribir en el archivo
        String nombre = "", dir = "", email = "";
        archivo = new File("usuarios.txt"); //Preparando el archivo

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ", "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa tu direccion: ", "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa tu email: ", "Solicitando datos", 3);
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(EscribirArchivoConservando.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ", "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa tu direccion: ", "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa tu email: ", "Solicitando datos", 3);
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(EscribirArchivoConservando.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
