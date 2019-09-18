package java.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.spring.ioc.Employe;

@Component   //@Repository
public class EmployeDAOImp implements EmployeDAO {

	@Autowired
	private Employe empl;
	
	@Override
	public String printfirstname() {
		// TODO Auto-generated method stub
		return getEmpl().getFirstname();
	}

	public Employe getEmpl() {
		return empl;
	}

	public void setEmpl(Employe empl) {
		this.empl = empl;
	}
	

}
