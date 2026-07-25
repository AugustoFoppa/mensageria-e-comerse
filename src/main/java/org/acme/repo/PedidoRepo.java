package org.acme.repo;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dtos.PedidoDTO;

@ApplicationScoped
public class PedidoRepo extends GenericRepo<PedidoDTO> {
}
