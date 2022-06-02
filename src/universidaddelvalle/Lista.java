/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaddelvalle;

import javax.swing.JOptionPane;

/**
 *
 * @author mono-
 */
public class Lista {

    private String nombre;
    private int añoing, semestre;
    private double descuento;
    private int numcredito1, numcredito2, numcredito3, numcredito4, numcredito5, numcredito6, numcredito7, numcredito8, numcredito9, numcredito10, total;
    private int consecutivo = (int) (Math.random() * (500 - 100 + 1) + 100);
    private static double coscredito = (908526 * 0.55);
    private int tolpag;

    public Lista() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoing() {
        return añoing;
    }

    public void setAñoing(int añoing) {
        this.añoing = añoing;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int opcion) {
        switch (opcion) {
            case 1: {
                this.descuento = 0.10;
                break;
            }
            case 2: {
                this.descuento = 1;
                break;
            }
            case 3: {
                this.descuento = 0.20;
                break;
            }
            case 4: {
                this.descuento = 0.50;
                break;
            }
            case 5: {
                this.descuento = 0;
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
            }
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int materias) {
        int i = 0;
        if (materias > 7) {
            JOptionPane.showMessageDialog(null, "No puede inscribir mas de 7 materias");
            materias = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de materias que desea inscribir"));
            setTotal(materias);
        } else {
            for (int j = 0; j < materias; j++) {
                int opcion;
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Materias ofertadas, elija: "
                        + "\n 1. Calculo I - creditos 3"
                        + "\n 2. Ingles I - creditos 2"
                        + "\n 3. Calculo II - creditos 3"
                        + "\n 4. Ingles avanzado - creditos 2"
                        + "\n 5. Tecnicas de programacion II - creditos 3"
                        + "\n 6. Práctica Profesional - creditos 8"
                        + "\n 7. Cinemática - creditos 3"
                        + "\n 8. Ecuaciones Diferenciales - creditos 3"
                        + "\n 9. Electiva I - creditos 3"
                        + "\n 10. Gestión en TIC - creditos 2"));
                switch (opcion) {
                    case 1: {
                        numcredito1 = 3;
                        this.total = total + numcredito1 + i;
                        break;
                    }
                    case 2: {
                        numcredito2 = 2;
                        this.total = total + numcredito2 + i;
                        break;
                    }
                    case 3: {
                        numcredito3 = 3;
                        this.total = total + numcredito3 + i;
                        break;
                    }
                    case 4: {
                        numcredito4 = 2;
                        this.total = total + numcredito4 + i;
                        break;
                    }
                    case 5: {
                        numcredito5 = 3;
                        this.total = total + numcredito5 + i;
                        break;
                    }
                    case 6: {
                        numcredito6 = 8;
                        this.total = total + numcredito6 + i;
                        break;
                    }
                    case 7: {
                        numcredito7 = 3;
                        this.total = total + numcredito7 + i;
                        break;
                    }
                    case 8: {
                        numcredito8 = 3;
                        this.total = total + numcredito8 + i;
                        break;
                    }
                    case 9: {
                        numcredito9 = 3;
                        this.total = total + numcredito9 + i;
                        break;
                    }
                    case 10: {
                        numcredito10 = 2;
                        this.total = total + numcredito10 + i;
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        j--;
                        break;
                    }
                }
            }
            if (total <= 18) {
                JOptionPane.showMessageDialog(null, "Inscripción correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Las materias suman mas de 18 creditos");
                this.total = 0;
                materias = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de materias que desea inscribir"));
                setTotal(materias);
            }
        }
    }

    public int getTolpag() {
        return tolpag;
    }

    public void setTolpag(int total, double descuento) {
        this.tolpag = ((int) ((total * coscredito) - ((total * coscredito) * descuento)));
    }

    @Override
    public String toString() {
        return añoing + "0" + semestre + consecutivo + "      $" + tolpag;
    }
}
