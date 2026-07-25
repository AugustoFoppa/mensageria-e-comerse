package org.acme.repo;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dtos.ItemDTO;

@ApplicationScoped
public class ItemRepo extends GenericRepo<ItemDTO> {
}
