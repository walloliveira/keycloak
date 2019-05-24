package br.com.uds.keycloak.color;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
class ColorRepositoryImpl implements ColorRepository {
    private final Set<Color> repository = new HashSet<>();

    @Override
    public Color save(CreateColor request) {
        Color color = Color.of(request);
        this.repository.add(color);
        return color;
    }

    @Override
    public Set<Color> list() {
        return Collections.unmodifiableSet(repository);
    }
}
