package arreglo;

/**
 *
 * @author NAFS
 */
public class Arreglo {

    public static void main(String[] args) {

        // Crear un array de Nombres
        String[] Nombres = {"Nestor","Nancy", "Adriana", "Camilo", "Laura"};
 
        // Mostrar el contenido original del array
        System.out.println("Contenido original del array:");
        mostrarArray(Nombres);
 
        // Adicionar un nuevo elemento al final del array
        String nuevoElemento = "Geraldine";
        Nombres = agregarElementoAlFinal(Nombres, nuevoElemento);
 
        // Mostrar el contenido del array después de adicionar el nuevo elemento
        System.out.println("\nContenido del array después de adicionar un nuevo elemento:");
        mostrarArray(Nombres);
        
        // Editar un elemento en el array
        int indiceEditar = 2;
        String nuevoValor = "Alejandro";
        Nombres = editarElemento(Nombres, indiceEditar, nuevoValor);
        
        // Mostrar el contenido del array después de la edición
        System.out.println("\nContenido del array después de la edición:");
        mostrarArray(Nombres);
        
        // Eliminar un elemento del array
        int indiceEliminar = 3;
        Nombres = eliminarElemento(Nombres, indiceEliminar);
        
        // Mostrar el contenido del array después de la eliminación
        System.out.println("\nContenido del array después de la eliminación:");
        mostrarArray(Nombres);
        
    }
 
    // Método para mostrar el contenido de un array de enteros
    private static void mostrarArray(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        
        
    }
    
    // Método para adicionar un elemento al final de un array de enteros
    private static String[] agregarElementoAlFinal(String[] array, String elemento) {
        int nuevoTamanio = array.length + 1;
        String[] nuevoArray = new String[nuevoTamanio];
 
        // Copiar los elementos originales al nuevo array
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
 
        // Adicionar el nuevo elemento al final del nuevo array
        nuevoArray[nuevoTamanio - 1] = elemento;
 
        return nuevoArray;
    }
    
    // Método para editar un elemento en un array de cadenas
    private static String[] editarElemento(String[] array, int indice, String nuevoValor) {
        if (indice >= 0 && indice < array.length) {
            array[indice] = nuevoValor;
        } else {
            System.out.println("Índice fuera de rango. No se puede realizar la edición.");
        }
        return array;
    }

    // Método para eliminar un elemento de un array de cadenas
    private static String[] eliminarElemento(String[] array, int indice) {
        if (indice >= 0 && indice < array.length) {
            String[] nuevoArray = new String[array.length - 1];
            int nuevoIndice = 0;
 
            // Copiar los elementos al nuevo array, excluyendo el elemento a eliminar
            for (int i = 0; i < array.length; i++) {
                if (i != indice) {
                    nuevoArray[nuevoIndice] = array[i];
                    nuevoIndice++;
                }
            }
 
            return nuevoArray;
        } else {
            System.out.println("Índice fuera de rango. No se puede realizar la eliminación.");
            return array;
        }
    }
}
    
