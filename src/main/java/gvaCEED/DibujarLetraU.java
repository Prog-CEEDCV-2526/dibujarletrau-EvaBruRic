package gvaCEED;
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

        // Paso 4: Dibujar la base de la U (última fila)
        // COMPLETA AQUÍ: pon '*' en las columnas centrales de la última fila

        // Paso 5: Mostrar la matriz en consola
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
