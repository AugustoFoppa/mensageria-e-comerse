package org.acme.repo;

import org.acme.dtos.Entity;
import org.acme.dtos.UsuarioDTO;

import java.util.HashMap;

public class GenericRepo<T extends Entity> {

    private final HashMap<Long, T> database = new HashMap<>();
    private Long lastId = 1L;

    public Long insert(T entity) {
        entity.setId(lastId);
        database.put(lastId, entity);
        lastId++;
        return lastId;
    }

    public T findById(Long id) {
        if(database.containsKey(id)) {
            return database.get(id);
        }
        throw new  IllegalArgumentException("Nenhum ID encontrado: " + id);
    }

    public T update(Long id, T entity) {
        if(!database.containsKey(id)) {
            throw new IllegalArgumentException("Nenhum id encontrado: " + id);
        }
        return database.put(id, entity);
    }
}
