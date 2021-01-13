/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Cargo;

    public Empleado(String Nombre, String Apellido, String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public String confirmacion(Restaurante restaurante ){
        String errores="";
                if(this.Cargo=="Mesero"){
                    errores=restaurante.stock();
                    System.out.println("Se confirmo el pedido por el mesero: "+this.Nombre+" "+this.Apellido);
                    System.out.println("el precio total es: "+ (Integer.parseInt(restaurante.getMenu()[0][1])+Integer.parseInt(restaurante.getMenu()[3][1])+Integer.parseInt(restaurante.getMenu()[7][1])+Integer.parseInt(restaurante.getMenu()[8][1])));
                }else{
                    System.out.println("Pedido sin confirmar");
                    errores+="\nno se pudo confirmar el pedido ";
                }
        return errores;
    }
}
