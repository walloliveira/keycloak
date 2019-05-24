package br.com.uds.keycloak.color;

import java.util.Set;

public interface ColorRepository {

    Color save(CreateColor request);

    Set<Color> list();
}
