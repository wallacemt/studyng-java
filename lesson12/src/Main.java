import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra formatada: " + dataCompra.format(formatter));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data da compra formatada: " + dataConclusaoCompra);

        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão de compra NY" + dataCompraNy);


        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);

        Duration duracao = Duration.between(start, end);

        System.out.println("A duração do expediente: "
                + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period period = Period.between(dataCompra, dataPagamento);

        System.out.printf("Diferença: %d anos, %d meses e %d dias%n", period.getYears(), period.getMonths(), period.getDays());
    }
}