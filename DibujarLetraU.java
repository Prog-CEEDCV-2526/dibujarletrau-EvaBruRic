public class DibujarLetraU {
    public static void main(String[] args) {
        int filas = 7;
        int columnas = 5;

        // Paso 1: Crear la matriz de caracteres
        char[][] matriz = new char[filas][columnas];


        // Paso 2: Rellenar la matriz con espacios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Paso 3: Dibujar los lados verticales de la letra U
        // COMPLETA AQUÍ: usa bucles para poner '*' en la primera y última columna
        // excepto en la última fila
        // Ejemplo: matriz[i][0] = '*'; matriz[i][columnas - 1] = '*';
        for (int i = 0; i < filas - 1; i++){ //excluye la ultima fila
            matriz[i][0] = '*'; //para poner * en toda la columna 0 
            matriz[i][columnas-1] = '*'; //para poner * en toda la columna 5
        }


        // Paso 4: Dibujar la base de la U (última fila)
        // COMPLETA AQUÍ: pon '*' en las columnas centrales de la última fila
        for (int i = 6; i == filas - 1; i++){
            for (int j = 1; j >= columnas - 4 && j < columnas - 1; j++)
            matriz[i][j] = '*';
        }

        // Paso 5: Mostrar la matriz en consola
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
