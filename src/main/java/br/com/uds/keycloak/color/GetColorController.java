package br.com.uds.keycloak.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/colors")
public class GetColorController {

    private final ColorRepository repository;

    @Autowired
    GetColorController(ColorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<Set<Color>> get() {
        return ResponseEntity.ok(repository.list());
    }
}
