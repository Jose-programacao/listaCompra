package com.gmail.pedrofenixbidu.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gmail.pedrofenixbidu.model.ListaCompraModel;

public interface ListaCompraRepositories extends JpaRepository<ListaCompraModel, UUID> {

}
