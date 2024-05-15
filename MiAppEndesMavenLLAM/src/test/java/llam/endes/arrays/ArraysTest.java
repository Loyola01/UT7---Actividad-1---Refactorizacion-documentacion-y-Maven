package llam.endes.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;

import java.util.Arrays;

@TestMethodOrder(Alphanumeric.class)
class ArraysTest {

    static int[] array1, array2, result;

    @BeforeAll
    static void iniciar() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        result = new int[]{3, 5, 6};
    }

    @BeforeEach
    void iniciar2() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        result = new int[]{3, 5, 6};
    }

    @Test
    @Order(3)
    void testSumar() {
        System.out.println("Resultado esperado: " + Arrays.toString(result));
        System.out.println("Resultado obtenido: " + Arrays.toString(sumarArrays(array1, array2)));
        assertArrayEquals(result, sumarArrays(array1, array2));
    }

    @Test
    @Order(2)
    void testSumar2() {
        int[] nuevoArray1 = new int[]{3, 6, 9, 12, 15};
        int[] nuevoArray2 = new int[]{1, 2, 3, 4, 5};
        int[] nuevoResultado = new int[]{4, 8, 12, 16, 20};
        System.out.println("Resultado esperado: " + Arrays.toString(nuevoResultado));
        System.out.println("Resultado obtenido: " + Arrays.toString(sumarArrays(nuevoArray1, nuevoArray2)));
        assertArrayEquals(nuevoResultado, sumarArrays(nuevoArray1, nuevoArray2));
    }

    @Test
    @Order(1)
    void testDecrementar() {
        ArraysUtils arra = new ArraysUtils();
        arra.decrementar(array1, 1);
        assertArrayEquals(array1, new int[]{1, 3, 4});
    }

    @AfterAll
    static void finalizar() {
        System.out.println("Fin de los tests");
    }

    @AfterEach
    void finalizar2() {
        System.out.println("Finaliza un test");
    }

    // Método para sumar dos arrays
    private int[] sumarArrays(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] + arr2[i];
        }
        return resultado;
    }
}