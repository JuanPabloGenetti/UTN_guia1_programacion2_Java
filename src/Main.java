import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                //Ejercicio 1

        /*
        Empleado Carlos_Gutierrez;
        Empleado Ana_Sanchez;

        Carlos_Gutierrez = new Empleado("40138015","Carlos","Gutierrez",800000);
        Ana_Sanchez = new Empleado("39138015","Ana","Sanchez",700000);

        Carlos_Gutierrez.getEmpleado();
        Ana_Sanchez.getEmpleado();

        Carlos_Gutierrez.getAnualidad();
        Ana_Sanchez.getAnualidad();

        Carlos_Gutierrez.aumentarSalario(10);
        Ana_Sanchez.aumentarSalario(10);

        Carlos_Gutierrez.getEmpleado();
        Ana_Sanchez.getEmpleado();
        */

                //Ejercicio 2

        /*
        BankAcc Manuel_Vergara;
        Manuel_Vergara = new BankAcc("Manuel","Vergara",15000);
        Manuel_Vergara.getBankAcc();
        Manuel_Vergara.deposit(30000);
        Manuel_Vergara.debit(2000);
        Manuel_Vergara.deposit(5000);
        Manuel_Vergara.debit(1000);
        Manuel_Vergara.getBankAcc();
        */


                //Ejercicio 3
        /*
        Libro Don_Quijote;
        Don_Quijote = new Libro("Don Quijote de la Mancha","Miguel Cervantes",42000,20);
        Libro Soledad;
        Soledad = new Libro("100 años de Soledad", "GGM", 35000,10);
        Don_Quijote.vender(3);
        Don_Quijote.getLibro();
        Soledad.vender(11);
        Soledad.setCopias(2);
        Soledad.getLibro();
        */

                //Ejercicio 4

        Scanner scanner = new Scanner(System.in);
        ItemVenta Coca_Cola;
        Coca_Cola = new ItemVenta("Botella de Coca Cola 350cm3", 24,1200);
        Coca_Cola.getItemVenta();
        System.out.println("Ingrese Precio del producto");
        long precio = scanner.nextLong();
        Coca_Cola.setPrecio(precio);
        System.out.println("Ingrese cantidad");
        int cantidad = scanner.nextInt();
        System.out.println("El valor del stock es de " +Coca_Cola.valorTotal());
        Coca_Cola.getItemVenta();
        Coca_Cola.setCantidad(cantidad);
        scanner.close();

    }
}