package br.com.uds.keycloak.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colors")
public class PostColorController {

    private final ColorRepository repository;

    @Autowired
    PostColorController(ColorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Color> post(@RequestBody CreateColor createColor) {
        return ResponseEntity.ok(this.repository.save(createColor));
    }
}
