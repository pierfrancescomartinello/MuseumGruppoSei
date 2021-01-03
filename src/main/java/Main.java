<<<<<<< Updated upstream
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import museumUsers.Employee;
import museumUtil.Utilities;
import it.GruppoSei.databaseHandler.queries.LoadDriver;
import it.GruppoSei.databaseHandler.queries.museumDatabase.AccountQueryHandler;
import it.GruppoSei.databaseHandler.queries.museumUsers.EmployeeQueryHandler;
import it.GruppoSei.databaseHandler.queries.museumUsers.VisitorQueryHandler;

public class Main {
	public static void main(String[] args) throws NullPointerException, ClassNotFoundException{
		
		AccountQueryHandler.addAccountQuery("giuseppe.termerissa@you.unipa.it", "passwordDiGiuseppe");
		
		/*EmployeeQueryHandler.addEmployeeQuery("Giuseppe", "Termerissa", LocalDate.of(1999, 7, 11), LocalDate.now(), 9, 99, BigDecimal.valueOf(999.00), "giuseppe.termerissa@you.unipa.it");
		
		ArrayList<Employee> risultato = EmployeeQueryHandler.EmployeeQueryDataHandler();
		for(int i = 0; i < risultato.size() ; i++)
			System.out.println(risultato.get(i));
		
		EmployeeQueryHandler.showAllEmployeesQuery();
		 */
	}
=======
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import it.GruppoSei.code.museumUsers.Employee;
import it.GruppoSei.code.museumUtil.Utilities;
import it.GruppoSei.queries.LoadDriver;
import it.GruppoSei.queries.museumDatabase.AccountQueryHandler;
import it.GruppoSei.queries.museumUsers.EmployeeQueryHandler;
import it.GruppoSei.queries.museumUsers.VisitorQueryHandler;

public class Main {
	public static void main(String[] args) throws NullPointerException, ClassNotFoundException{
		
		AccountQueryHandler.addAccountQuery("giuseppe.termerissa@you.unipa.it", "passwordDiGiuseppe");
		
		/*EmployeeQueryHandler.addEmployeeQuery("Giuseppe", "Termerissa", LocalDate.of(1999, 7, 11), LocalDate.now(), 9, 99, BigDecimal.valueOf(999.00), "giuseppe.termerissa@you.unipa.it");
		
		ArrayList<Employee> risultato = EmployeeQueryHandler.EmployeeQueryDataHandler();
		for(int i = 0; i < risultato.size() ; i++)
			System.out.println(risultato.get(i));
		
		EmployeeQueryHandler.showAllEmployeesQuery();
		 */
	}
>>>>>>> Stashed changes
}