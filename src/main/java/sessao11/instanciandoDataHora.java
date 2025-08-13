package sessao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciandoDataHora {
    public static void main (String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        Instant d03 = Instant.now();
        System.out.println(d03);

        /*É possível fazer um casting de Strings que representam horários */
        LocalDate d04 = LocalDate.parse("2025-07-14");
        System.out.println(d04);
    }
}
