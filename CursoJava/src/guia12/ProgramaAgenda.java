package guia12;


import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class ProgramaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar date = Calendar.getInstance();
		Calendar date1 = new GregorianCalendar(2016, 7, 6);
		
//		Date date12 = date1.getTime();
		
		
		Evento vacile = new Evento("Vacile", date);
		Evento vacile2 = new Evento("Vacile", date1);
		
		
		LinkedList<Evento> eventos = new LinkedList<>();
		
		Agenda mia = new Agenda("Jose", eventos);
		
		
		
		mia.agregarEvento(vacile);
		mia.agregarEvento(vacile2);
		
		mia.imprimir();
				
	}

}
