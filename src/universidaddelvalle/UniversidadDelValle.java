/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaddelvalle;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mono-
 */
public class UniversidadDelValle {

    static ArrayList<Lista> datos = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos a registrar "));
        for (int i = 0; i < valor; i++) {
            Lista pers = new Lista();
            pers.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante"));
            pers.setAñoing(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de ingreso a la universidad")));
            pers.setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre que cursa")));
            pers.setDescuento(Integer.parseInt(JOptionPane.showInputDialog("Elija el tipo de descuento (recuerde que no son acumulables):"
                    + "\n 1. 10% si presenta certificado de votación"
                    + "\n 2. 100% si son docentes de la universidad o tienen beca"
                    + "\n 3. 20% si son egresados"
                    + "\n 4. 50% si fueron monitores"
                    + "\n 5. sin descuento")));
            pers.setTotal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de materias a inscribir (se pueden inscribir max 7 o 18 creditos")));
            pers.setTolpag(pers.getTotal(), pers.getDescuento());
            datos.add(pers);
            JOptionPane.showMessageDialog(null, "Codigo              Costo Matricula"
                    + "\n" + datos.get(i).toString());
        }
        String salida = "";
        for (int i = 0; i < datos.size(); i++) {
            String imp = datos.get(i).toString();
            salida += (imp + "\n");
        }
        JOptionPane.showMessageDialog(null, "Listado Final"
                + "\nCodigo              Costo Matricula"
                + "\n" + salida);
    }
}
