import Models.Operaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        byte opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("----Suma----\n");
            System.out.println("Nota: Si deseas realizar la suma debes ingresar varios numeros");
            System.out.println("1.- Ingresar numeros");
            System.out.println("2.- Deseas ver los numeros que agregaste");
            System.out.println("3.- Ver la suma total");
            System.out.println("4.- Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Que deseas realizar: ");
            opcion = entrada.nextByte();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese un numero");
                    int numero = entrada.nextInt();
                    operaciones.agregar(numero);
                    break;
                case 2:
                    operaciones.visualizar();
                    break;
                case 3:
                    operaciones.sumar();
                    break;
                case 4:
                    System.out.println("Byeeeee");
                default:
                    System.out.println("Esta opcion no esta disponible vuelva a intentarlo");
            }
        }while (opcion !=4);
    }
}