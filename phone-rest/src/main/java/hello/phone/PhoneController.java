package hello.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by asaxena on 8/18/16.
 */
@RestController
@RequestMapping("/phones")
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> phones(){
        return phoneRepository.findAll();
    }

}
