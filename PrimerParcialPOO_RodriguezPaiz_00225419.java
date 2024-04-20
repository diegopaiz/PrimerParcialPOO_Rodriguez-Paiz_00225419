import Cliente.cliente;

import javax.swing.plaf.synth.SynthUI;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main 
{
    static ArrayList<electro> listaDeElectrodomesticos = new ArrayList<electro>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    static void menuPrincipal(){

        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            mostrarMenuPrincipal();
            try{
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0) {
                    System.out.println("Adios,gracias por ingresar al programa.");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarElectro();
                        break;
                    case 2:
                        modificarElectro();
                        break;
                    case 3:
                        mostrarElectro();
                        break;
                    default:
                        System.out.println("\nOpcion invalida.Ingresar otro numero.\n");
                        break;
                }
            }catch (InputMismatchException e){
                sn.nextLine();
                System.out.println("\nOpcion invalida. Ingresar otro numero.\n");
            }
        }
    }
}

private static void agregarElectro(){
    int tipoElectro = obtenerTipoElectro();
    Electro Electro = null;
    Scanner sn = new Scanner(System.in);


    System.out.println("Nombre: ");
    String Nombre = sn.nextLine();
    System.out.println("Laptop o telefono): ");
    String Tipo = sn.nextLine();
    System.out.println("Modelo: ");
    String Modelo = sn.nextLine();
    System.out.println("Descripcion :");
    Date Descripcion = new Date(sn.nextLine());
    System.out.println("Precio:");
    float Precio = sn.nextLine();
    Persona persona = new Persona(Nombre, Tipo, Modelo, Descripcion, Precio);

    sn.nextLine();

    listaDeElectrodomesticos.add(Electro);
}

private static void modificarElectro() {
    Scanner sn = new Scanner(System.in);
    System.out.println("Ingrese el modelo a modificar:");
    String Mo = sn.nextLine();

    
    for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
        
        if (listaDeElectrodomesticos.get(i).getModelo().equals(Modelo)){
            
            System.out.print("\nIngrese el nuevo Precio de "+listaDeElectrodomesticos.get(i).getNombre()+" en USD: $");
            float nuevoPrecio = sn.nextFloat();

            
            listaDeElectrodomesticos.get(i).setPrecio(nuevoPrecio);

        
            System.out.println("\nEl precio del articulo es "+listaDeElectrodomesticos.get(i).getNombre()+" ");

            return;
        }
    }
}


private static void mostrarElectro() {
    Scanner sn = new Scanner(System.in);
    
    System.out.println("Ingrese el nombre :");
    String Nombre = sn.nextLine();

    
    for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
    
        if (listaDeElectrodomesticos.get(i).getNombre().equals(nombre)){
            Electro emp = listaDeElectrodomesticos.get(i);
            

            System.out.println("Nombre : "+emp.getNombre());
            System.out.println("Tipo: "+emp.getTipo());
            System.out.println("Modelo: "+emp.getModelo());
            System.out.println("Descripcion: "+emp.getDescripcion());
            System.out.println("Precio: $"+emp.getPrecio());
            return;
        }
    }
}
