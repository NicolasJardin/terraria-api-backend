package jardin.james.terrariaapi.controller;

import jardin.james.terrariaapi.model.PetEntity;
import jardin.james.terrariaapi.service.petService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Nícolas Jardin, Gustavo James
 * @version 1.0
 * @since 6/22/2020 - 4:00PM
 */

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/pets")
public class PetController {

    @Autowired
    public PetFindAllService petFindAllService;

    @Autowired
    public PetSaveService petSaveService;

    @Autowired
    public PetFindByIdService petFindByIdService;

    @Autowired
    public PetUpdateService petUpdateService;

    @Autowired
    public PetDeleteService petDeleteService;

    @GetMapping
    public ResponseEntity<List<PetEntity>> findAll() {
        return new ResponseEntity<List<PetEntity>>(this.petFindAllService.findAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public  ResponseEntity<PetEntity> findById(@PathVariable("id") long id) {
        PetEntity petEntity = this.petFindByIdService.findById(id);
        if(petEntity != null) {
            return new ResponseEntity<PetEntity>(petEntity, new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<PetEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<PetEntity> save(@Valid @RequestBody PetEntity petEntity) {
        return new ResponseEntity<PetEntity>(this.petSaveService.save(petEntity), new HttpHeaders(), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PetEntity> update(@Valid @RequestBody PetEntity petEntity) {
        return new ResponseEntity<PetEntity>(this.petUpdateService.update(petEntity), new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<PetEntity> delete(@PathVariable("id") long id) {
        this.petDeleteService.delete(id);
        return new ResponseEntity<PetEntity>(new HttpHeaders(), HttpStatus.OK);
    }


}
