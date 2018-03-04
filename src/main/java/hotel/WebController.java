package hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    private EmployerRepsitory employerRepsitory;

    @RequestMapping("/allemployers")
    public String findAllEmployers(){
        String result = "<html>";
        for (EmployerSpringJPA emp : employerRepsitory.findAll() ){
            result += "<div>" + emp.toString() + "</div>";

        }
        return result + "</html>";
    }
}
