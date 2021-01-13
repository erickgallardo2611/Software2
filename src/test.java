/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion del cliente
        Cliente cliente1=new Cliente("Elina","Sanchez","eli123","eliana.sanchez@epn.edu.ec");
        // declaracion del empleado
        Empleado empleado1=new Empleado("Erick","Gallardo","Mesero");
        
        Cliente cliente2=new Cliente("Emily","Redroban","eli123","eliana.sanchez@epn.edu.ec");

        String [][] menu=new String[10][10];
        menu[0][0]="carne";
        menu[1][0]="pollo";
        menu[2][0]="pescado";
        menu[3][0]="arroz";
        menu[4][0]="papas";
        menu[5][0]="fideo";
        menu[6][0]="lechuga";
        menu[7][0]="tomate";
        menu[8][0]="cebolla";
        menu[9][0]="choclo";
        menu[0][1]="15";
        menu[1][1]="10";
        menu[2][1]="15";
        menu[3][1]="2";
        menu[4][1]="2";
        menu[5][1]="2";
        menu[6][1]="1";
        menu[7][1]="1";
        menu[8][1]="1";
        menu[9][1]="1";
        int [][][] Mesas=new int[0][0][0];
        Restaurante restaurante=new Restaurante(menu, Mesas);
        cliente1.add_seleccion(empleado1, restaurante,2);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        cliente2.add_seleccion(empleado1, restaurante, 2);
        // declaracion del restaurant

    } 
    
}
