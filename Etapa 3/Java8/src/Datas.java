import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasJapao = LocalDate.of(2023, Month.JUNE, 5);
		
		int anos = olimpiadasJapao.getYear() - hoje.getYear();	
		System.out.println(anos);
		
		Period periodo = Period.between(hoje,olimpiadasJapao );
		System.out.println(periodo);
		
		LocalDate proximaOlimpiadas = olimpiadasJapao.plusYears(4);
		System.out.println(proximaOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximaOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		
		DateTimeFormatter formatadorTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String agoraFormatado = agora.format(formatadorTime);
		System.out.println(agoraFormatado);
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		ZonedDateTime zona = ZonedDateTime.now();
		
		System.out.println(zona);
	}
}
