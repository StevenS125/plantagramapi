package com.plantagram.plantagramapi.Controllers;
import java.util.*;


import com.plantagram.plantagramapi.Models.Album;
import com.plantagram.plantagramapi.Services.AlbumService;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class AlbumController {

    @Autowired
    private AlbumService service;

    // RESTful API methods for Retrieval operations
    @GetMapping("/albums")
    public List<Album> list() {
        return service.listAll();
    }


    @GetMapping("/albums/{id}")
    public ResponseEntity<Album> get(@PathVariable Integer id) {
        try {
            Album album = service.get(id);
            return new ResponseEntity<Album>(album, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Album>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Create operation
    @PostMapping("/albums")
    public ResponseEntity<Album> add(@RequestBody Album album) {
        try {
            service.save(album);
            return new ResponseEntity<Album>(album, HttpStatus.OK);
        } catch (NotReadablePropertyException e){
            return new ResponseEntity<Album>(HttpStatus.NOT_FOUND);
        }

    }
    // RESTful API method for Update operation
    @PutMapping("/albums/{id}")
    public ResponseEntity<Album> update(@RequestBody Album album, @PathVariable Integer id) {
        try {
            Album existAlbum = service.get(id);
            service.save(album);
            return new ResponseEntity<Album>(album, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Album>(album, HttpStatus.NOT_FOUND);
        }
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/albums/{id}")
    public ResponseEntity<Album> delete(@PathVariable Integer id) {
        Album album = service.get(id);
        service.delete(id);
        return new ResponseEntity<Album>(album, HttpStatus.OK
        );
    }
}
