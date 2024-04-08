import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

//*
*    @author DeathbatO
*/

public class Fechas{
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDateTime fechaActual = LocalDateTime.now();

        // Especificar tu fecha de nacimiento
        LocalDateTime fechaNacimiento = LocalDateTime.of(1990, 4, 1, 0, 0, 0); // Por ejemplo, 1 de abril de 1990

        // Calcular la diferencia entre las dos fechas
        Period periodo = Period.between(LocalDate.from(fechaNacimiento), LocalDate.from(fechaActual));
        int añosTranscurridos = periodo.getYears();

        // Imprimir el resultado
        System.out.println("Han transcurrido " + añosTranscurridos + " años desde tu nacimiento.");
    }
}
