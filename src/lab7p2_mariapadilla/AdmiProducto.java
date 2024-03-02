
package lab7p2_mariapadilla;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdmiProducto {
    private ArrayList<Producto> listaProductos = new ArrayList();
    private File archivo = null;
    //

    public AdmiProducto() {
    }
    
    public AdmiProducto(String path) {
        archivo = new File(path);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
 
     public void setPersona(Producto p) {
        this.listaProductos.add(p);
    }
     
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);// false que lo reescriba 
            bw = new BufferedWriter(fw);
            for (Producto t : listaProductos) {
                bw.write(t.getId()+ ",");
                bw.write(t.getName()+ ",");
                bw.write(t.getCategory()+ ",");
                bw.write(t.getPrice()+ ",");
                bw.write(t.getAisle()+ ",");
                bw.write(t.getBin()+ ",");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProductos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaProductos.add(new Producto(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble() ) );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

    
}
