package com.nttdata.nttdatacentersspringt3AHB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliente, Long> {

	public List<Cliente> buscarPorNombreYApellido(final String nombre, final String apellido);
}
