package llam.endes.baremo;

public class baremo {

    public String comprobarBaremo(String DNI, int puntuacion, String baremo) {
        if (puntuacion < 0 || puntuacion > 10 || !baremo.equalsIgnoreCase("No")) {
            return "Dato No Válido";
        }

        if (puntuacion >= 5) {
            return "Adjudicada";
        } else {
            return "No Adjudicada";
        }
    }
}