package jardin.james.terrariaapi.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/22/2020 - 2:45PM
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TerrariaAPIController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("Bem vindo ao API de terraria!!!",new HttpHeaders(), HttpStatus.CREATED);
    }
}
