import java.util.Scanner;

public class App {

    
    public static boolean buscarReferencia(String[] lote, String nombreBuscado) {
        boolean encontrado = false;
        
        for (int i = 0; i < lote.length; i++) {
            
            if (lote[i] != null) {
                if (lote[i].equalsIgnoreCase(nombreBuscado)) {
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

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
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Prendas en la caja ---");
                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] != null) {
                            System.out.println("Posicion " + i + ": " + referencias[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite el nombre de la prenda a buscar: ");
                    String buscado = leer.nextLine();
                    
                    boolean existe = buscarReferencia(referencias, buscado);
                    
                    if (existe == true) {
                        System.out.println("La prenda SI esta guardada en la caja.");
                    } else {
                        System.out.println("La prenda NO se encuentra en el lote.");
                    }
                    break;

                case 3:
                    System.out.print("Digite el nombre de la nueva prenda: ");
                    String nuevaPrenda = leer.nextLine();
                    boolean guardado = false;

                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] == null) {
                            referencias[i] = nuevaPrenda;
                            guardado = true;
                            System.out.println("Prenda registrada en la posicion " + i);
                            break; 
                        }
                    }

                    if (guardado == false) {
                        System.out.println("No se pudo guardar, la caja ya esta llena.");
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