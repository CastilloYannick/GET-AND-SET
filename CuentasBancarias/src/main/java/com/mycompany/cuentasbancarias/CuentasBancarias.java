

package com.mycompany.cuentasbancarias;
import java.util.Scanner;

public class CuentasBancarias {
    public static void main(String[] args) {
        // CODIGO PARA USAR CUENTA DE CUENTAS 2 CON GET Y SET
        Cuentas2 accounts = new Cuentas2();
        Cuentas2 account2 = new Cuentas2();
        
       while (true) {
        Scanner option1 = new Scanner(System.in);
        System.out.println("ELIJA UNA OPCION");
        System.out.println("1. MOSTRAR VALORES");
        System.out.println("2. SUMAR A CUENTA");
        System.out.println("3. RESTAR A CUENTA");
        System.out.println("4. SALIR");
        int answe = option1.nextInt();
        
       switch (answe) {        
        case 1: 
            System.out.println("El valor de las cuentas es:");
            System.out.println(accounts.getCuenta()); // PRINT F DE LAS VARIABLES PREDEFINIDAS ARRIBA USANDO CUENTA 
            System.out.println(account2.getCuenta());
            break;
            
        case 2:
            System.out.println("Ingrese el numero de "
                    + "cuenta:");
            int answer = option1.nextInt();
            
            if (answer == 1){
                System.out.println("INGRESE LA CANTIDAD A SUMAR:");
                //int cant = option1.nextInt(); SCANNER DE MAS 
                accounts.setCuenta(accounts.getCuenta()+option1.nextInt()); //CODIGO PARA SUMAR PRIMERO SE ESCRIBE LA CUENTA PORQUE
                System.out.println("Transaccion hecha ");                   // SE RECIBE LA CANTIDAD 
            }
            
            else {
             System.out.println("INGRESE LA CANTIDAD A SUMAR:");
                //int cant = option1.nextInt();
                account2.setCuenta(account2.getCuenta()+option1.nextInt());
                System.out.println("Transaccion hecha ");
            } 
                
            break;
            case 3:
            System.out.println("Ingrese el numero de cuenta a debitar:");
            int answ = option1.nextInt();
            
            if (answ == 1){
                System.out.println("INGRESE LA CANTIDAD A RESTAR:");
                //int cant = option1.nextInt();
                accounts.setCuenta(accounts.getCuenta()-option1.nextInt());
                System.out.println("Transaccion hecha ");
            }
            
            else {
             System.out.println("INGRESE LA CANTIDAD A RESTAR:");
                //int cant = option1.nextInt();
                account2.setCuenta(account2.getCuenta()-option1.nextInt());
                System.out.println("Transaccion hecha ");
            } 
            break;
        case 4:
            
            System.exit(0);
            break;
            
            default: System.out.println("INVALID SELECTION");
            
                     break;
                } 
                 
        }
    }
}
