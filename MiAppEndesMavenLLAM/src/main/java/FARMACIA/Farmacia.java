package FARMACIA;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa una farmacia que gestiona su inventario de medicamentos.
 */
public class Farmacia {
    private Map<String, Integer> inventario;

    /**
     * Constructor de la clase Farmacia. Inicializa el inventario como un nuevo HashMap.
     */
    public Farmacia() {
        this.inventario = new HashMap<>();
    }

    /**
     * Agrega una cantidad específica de un medicamento al inventario.
     *
     * @param medicamento El medicamento a agregar.
     * @param cantidad    La cantidad del medicamento a agregar.
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        String nombre = medicamento.getNombre();
        int cantidadExistente = inventario.getOrDefault(nombre, 0);
        inventario.put(nombre, cantidadExistente + cantidad);
    }

    /**
     * Vende una cantidad específica de un medicamento del inventario.
     *
     * @param nombre    El nombre del medicamento a vender.
     * @param cantidad  La cantidad del medicamento a vender.
     */
    public void venderMedicamento(String nombre, int cantidad) {
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            if (cantidadExistente >= cantidad) {
                inventario.put(nombre, cantidadExistente - cantidad);
                System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
            } else {
                System.out.println("No hay suficientes existencias de " + nombre + " para realizar la venta.");
            }
        } else {
            System.out.println("El medicamento " + nombre + " no está en el inventario.");
        }
    }

    /**
     * Obtiene el inventario de la farmacia.
     *
     * @return El inventario de la farmacia.
     */
    public Map<String, Integer> getInventario() {
        return inventario;
    }
}

/**
 * Clase abstracta que representa un medicamento.
 */
abstract class Medicamento {
    protected String nombre;
    protected double precio;

    /**
     * Constructor de la clase Medicamento.
     *
     * @param nombre  El nombre del medicamento.
     * @param precio  El precio del medicamento.
     */
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del medicamento.
     *
     * @return El nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }
}

/**
 * Clase que representa un medicamento genérico.
 */
class MedicamentoGenerico extends Medicamento {
    /**
     * Constructor de la clase MedicamentoGenerico.
     *
     * @param nombre  El nombre del medicamento.
     * @param precio  El precio del medicamento.
     */
    public MedicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }
}

/**
 * Clase que representa un medicamento especializado.
 */
class MedicamentoEspecializado extends Medicamento {
    private String tipo;

    /**
     * Constructor de la clase MedicamentoEspecializado.
     *
     * @param nombre  El nombre del medicamento.
     * @param precio  El precio del medicamento.
     * @param tipo    El tipo de especialización del medicamento.
     */
    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo de especialización del medicamento.
     *
     * @return El tipo de especialización del medicamento.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de especialización del medicamento.
     *
     * @param tipo El tipo de especialización del medicamento.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
