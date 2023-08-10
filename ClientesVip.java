/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author formacio
 */
public class ClientesVip extends Cliente{
    //Atributos
    int puntos;
    //Constructor/es
    public ClientesVip(String nombre, String apellido){
        super(nombre,apellido);
        this.puntos = 0;
    }
    
    //Metodos propios
    public String toString(){
        return "Soy cliente vip del banco y mi nombre és " + super.getNombre() +
                " " + super.getApellido() + ". Mi codigo pin és " + super.getPin() +
                " y tengo " + this.puntos + " puntos.";
    }
}
