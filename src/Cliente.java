/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author erick
 */
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String password;
    private String correo_electronico;

    public Cliente(String Nombre, String Apellido, String password, String correo_electronico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.password = password;
        this.correo_electronico = correo_electronico;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String add_seleccion(Empleado empleado1,Restaurante restaurante,int opcion){
        String errores="";
        errores+=validacion();
        errores+=opciones(empleado1, restaurante, 2);
        if(!"".equals(errores)){
            System.out.println("Existen errores que no permiten la finalizacion "+errores);
        }
        return errores;
    }
    public String opciones(Empleado empleado_actual,Restaurante restaurante,int opcion){
        String errores="";
            switch(opcion){
            case 1:
                //caso reservar mesa
                System.out.println("se reserva una mesa");
                break;
            case 2:
                //caso realziar pedido
                System.out.println("se realiza la reserva de un pedido");
                System.out.println("El cliente selecciono la siguiente combinacion: "+restaurante.getMenu()[0][0]+", "+ restaurante.getMenu()[3][0] + ", " +restaurante.getMenu()[7][0]+" y "+restaurante.getMenu()[8][0]);
                errores=empleado_actual.confirmacion(restaurante);
                break;
            case 0:
                //salir
                break;
        }
        return errores;
    }
    public String validacion(){
        String errores="";
        System.out.println("soy "+this.Nombre+" "+this.Apellido+" voy a ingresar a la aplciacion con las credenciales");
        if("eliana.sanchez@epn.edu.ec".equals(this.correo_electronico) && "eli123".equals(this.password)){
            System.out.println("credenciales correctas");
        }else{
            System.out.println("credenciales incorrectas"+this.correo_electronico+this.password);
            errores+="\ncredecniales incorrectas ";
        }
        return errores;
    }
}





