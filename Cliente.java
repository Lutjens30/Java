/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author formacio
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private int pin;
    
    //Constructor/es
    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.pin = 0;
    }
    //Getter
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getPin(){
        return this.pin;
    }
    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    
    //Metodos generales
    public void establecerPin(int nuevoPin){
        if(this.pin != nuevoPin){
            this.pin = nuevoPin;
        }
    }
    //Metodos propios
    public String toString(){
        return "Soy cliente del banco y mi nombre és " + this.nombre +
                " " + this.apellido + ". Mi codigo pin és " + this.pin;
    }
}
