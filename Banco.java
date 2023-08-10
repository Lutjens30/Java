
package banco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author formacio
 */
public class Banco {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        String respuesta = "";
        
        do {
           System.out.println("Bienvenid@ a la aplicación de CiberBanc\n"
                   + "Seleccione una opción a continuación:\n"
                   + "1. Alta de cliente\n"
                   + "2. Edición de cliente\n"
                   + "3. Baja cliente\n"
                   + "4. Cambio de pin\n"
                   + "0. Salir");
           opcion = entrada.nextInt();
           
           switch(opcion){
               case 1:
                   String nombre, apellido;
                   System.out.println("Indique el nombre del titular:");
                   nombre = entrada.next();
                   System.out.println("Indique el apellido del titular:");
                   apellido = entrada.next();
                   respuesta = crearCliente(nombre,apellido);
                   break;
               case 2:
                   System.out.println("Indique el nombre de quien desea modificar");
                   nombre = entrada.next();
                   System.out.println("Indique el apellido de quien desea modificar");
                   apellido = entrada.next();
                   respuesta = edicionCliente(nombre,apellido);
                   break;
               case 3:
                   //String nombre,apellido;
                   System.out.println("Indique el nombre de quien desea dar de baja");
                   nombre = entrada.next();
                   System.out.println("Indique el apellido de quien desea dar de baja");
                   apellido = entrada.next();
                   respuesta = bajaCliente(nombre,apellido);
                   break;
               case 4:
                   System.out.println("Indique el nombre de quien desea cambiar el PIN");
                   nombre = entrada.next();
                   System.out.println("Indique el apellido de quien desea cambiar el PIN");
                   apellido = entrada.next();
                   respuesta = cambioPin(nombre,apellido);
                   break;
               case 0:
                   respuesta = "Gracias por confiar en CiberBanc";
                   break;
                   
                
           }
           
           System.out.println(respuesta);
        }while(opcion != 0);
        
        
        Cliente usuario1 = new Cliente("Juan","Garcia");
        ClientesVip usuario2 = new ClientesVip("Juan","Garcia");
        usuario1.setNombre("Pepe");
        System.out.println(usuario1.getNombre());
        usuario1.establecerPin(1234);
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
    }
    
    public static String crearCliente(String nombre,String apellido){
        Cliente nuevoCliente = new Cliente(nombre,apellido);
        clientes.add(nuevoCliente);
        return "Se ha creado el cliente " + nombre + " " + apellido + " correctamente.";
    }
    
    public static String bajaCliente(String nombre,String apellido){
        /*int idCliente = -1;
        String respuesta = "";
        for(int i = 0; i < clientes.size(); i++){
            //mirar si el elemento de esta iteración coincide con los datos aportados
            Cliente clienteEncontrado = clientes.get(i);
            if(clienteEncontrado.getNombre().equalsIgnoreCase(nombre) &&
                    clienteEncontrado.getApellido().equalsIgnoreCase(apellido)){
                idCliente = i;
            }
        }*/
        String respuesta = "";
        int idCliente = busquedaCliente(nombre,apellido);
        
        //filtro de si encuentra al cliente
        if(idCliente == -1){
            respuesta = "Cliente no encontrado";
        } else {
            Cliente clienteEncontrado = clientes.get(idCliente);
            respuesta = "El cliente " + clienteEncontrado.getNombre() + " " +
                    clienteEncontrado.getApellido() + " ha sido eliminado.";
            clientes.remove(idCliente);
        }
        
        return respuesta;
    }
    
    public static String edicionCliente(String nombre,String apellido){
        int opcionEdit = 0;
        String respuesta = "";
        String nombreNuevo = "";
        String apellidoNuevo = "";
        int idCliente = busquedaCliente(nombre,apellido);
        
        //filtro de si encuentra al cliente
        if(idCliente == -1){
            respuesta = "Cliente no encontrado";
        } else {
            Cliente clienteEncontrado = clientes.get(idCliente);
            
            //Preguntar que desea cambiar
            do{
              System.out.println("Que deseas modificar?\n"
                      + "1. Nombre\n"
                      + "2.Apellido\n"
                      + "0. Salir");
              opcionEdit = entrada.nextInt();
              switch(opcionEdit){
                  case 1:
                      System.out.println("Indica el nuevo nombre");
                      nombreNuevo = entrada.next();
                      clienteEncontrado.setNombre(nombreNuevo);
                      break;
                  case 2:
                      System.out.println("Indica el nuevo apellido");
                      apellidoNuevo = entrada.next();
                      clienteEncontrado.setApellido(apellidoNuevo);
                      System.out.println(clienteEncontrado.toString());
                      break;
                  case 0:
                      System.out.println("Regresamos al menu principal.");
              }
            }while(opcionEdit != 0);
            respuesta = "El cliente ha sido editado correctamente.";
        }
        
        return respuesta;
    }
    
    public static String cambioPin(String nombre,String apellido){
        String respuesta = "";
        int nuevoPin = 0;
        int idCliente = busquedaCliente(nombre,apellido);
        
        //filtro de si encuentra al cliente
        if(idCliente == -1){
            respuesta = "Cliente no encontrado";
        } else {
            Cliente clienteEncontrado = clientes.get(idCliente);
            System.out.println("Indique el nuevo pin");
            nuevoPin = entrada.nextInt();
            clienteEncontrado.establecerPin(nuevoPin);
            respuesta = "Pin cambiado correctamente.";
            
        }
        return respuesta;
    }
    
    public static int busquedaCliente(String nombre,String apellido){
        int idCliente = -1;
        for(int i = 0; i < clientes.size(); i++){
            //mirar si el elemento de esta iteración coincide con los datos aportados
            Cliente clienteEncontrado = clientes.get(i);
            if(clienteEncontrado.getNombre().equalsIgnoreCase(nombre) &&
                    clienteEncontrado.getApellido().equalsIgnoreCase(apellido)){
                idCliente = i;
            }
        }
        
        return idCliente;
    }
}


