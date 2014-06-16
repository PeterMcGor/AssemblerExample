package org.pedro;
import java.io.File;  
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

import org.apache.commons.lang.WordUtils;  
import org.apache.commons.io.FileUtils;  
  
public class MavenStandaloneExample {  
    /** 
     * Dado un archivo de texto imprime su contenido capitalizado, es decir, la primera letra de  
     * cada palabra en may�sculas. 
     * @param args Un s�lo par�metro con la ruta completa al archivo de texto a capitalizar. 
     */  
    public static void main(String[] args) {  
        try {  
        	JFileChooser jfc = new JFileChooser();
        	jfc.showOpenDialog(null);
            File     file   = jfc.getSelectedFile();  
            String fileContent = FileUtils.readFileToString(file);  
              
            System.out.println(WordUtils.capitalizeFully(fileContent));  
            System.out.println("Tamañoooooo:  "+Files.size(Paths.get(file.getAbsolutePath())));
            switch (file.getAbsolutePath()) {
            case "nada":
            break;
            default:
            	
            	jfc.showOpenDialog(null);
            	System.out.println(jfc.getSelectedFile().getAbsolutePath());
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException ex){  
            System.out.println("Debe especificar el nombre de un archivo");  
        } catch (java.io.IOException ex){  
            System.out.println("Se ha producido un error al tratar el archivo especificado.");  
            System.out.println("Verique que exista y que tenga permisos de lectura.");  
        }  
    }  
}  
