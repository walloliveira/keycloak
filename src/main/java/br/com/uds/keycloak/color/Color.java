package br.com.uds.keycloak.color;

import java.io.Serializable;
import java.util.UUID;

final class Color implements Serializable {

    private UUID id;
    private String name;


    private Color(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    private Color() {
    }

    public static Color of(CreateColor request) {
        return new Color(request.name);
    }
}
