import java.util.Scanner;

public class BodegaAmericanEagle {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] referencias = {"Jeans AirFlex", "Graphic Tee", "Denim Jacket", null, null};
        int opcion = 0;

        do {
            System.out.println("\n--- GESTION DE LOTES AMERICAN EAGLE ---");
            System.out.println("1. Listar Coleccion en Bodega");
            System.out.println("2. Buscar Referencia en Lote");
            System.out.println("3. Ingresar Prenda al Lote");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Prendas en la caja ---");
                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] != null) {
                            System.out.println("Posicion " + i + ": " + referencias[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}