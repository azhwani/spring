import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.spring.ioc.Employe;

@Configuration
@ComponentScan("java.spring.ioc")
public class Springloc {
    @Bean
    public Employe getEmploye() {
          Employe empl = new Employe();
          empl.setFirstname("Diana");
          return empl;
    }

}
