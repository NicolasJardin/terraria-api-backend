package jardin.james.terrariaapi.controller;


import jardin.james.terrariaapi.model.MountEntity;
import jardin.james.terrariaapi.model.PetEntity;
import jardin.james.terrariaapi.service.mountService.*;
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
 * @since 6/24/2020 - 4:04PM
 */

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/mounts")
public class MountController {

    @Autowired
    public MountFindAllService mountFindAllService;

    @Autowired
    public MountSaveService mountSaveService;

    @Autowired
    public MountFindByIdService mountFindByIdService;

    @Autowired
    public MountUpdateService mountUpdateService;

    @Autowired
    public MountDeleteService mountDeleteService;

    @GetMapping
    public ResponseEntity<List<MountEntity>> findAll() {
        return new ResponseEntity<List<MountEntity>>(this.mountFindAllService.findAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public  ResponseEntity<MountEntity> findById(@PathVariable("id") long id) {
        MountEntity mountEntity = this.mountFindByIdService.findById(id);
        if(mountEntity != null) {
            return new ResponseEntity<MountEntity>(mountEntity, new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<MountEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<MountEntity> save(@Valid @RequestBody MountEntity mountEntity) {
        return new ResponseEntity<MountEntity>(this.mountSaveService.save(mountEntity), new HttpHeaders(), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<MountEntity> update(@Valid @RequestBody MountEntity mountEntity) {
        return new ResponseEntity<MountEntity>(this.mountUpdateService.update(mountEntity), new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<MountEntity> delete(@PathVariable("id") long id) {
        this.mountDeleteService.delete(id);
        return new ResponseEntity<MountEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}
