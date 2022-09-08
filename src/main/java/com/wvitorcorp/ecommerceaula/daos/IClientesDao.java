package com.wvitorcorp.ecommerceaula.daos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wvitorcorp.ecommerceaula.models.Cliente;

public interface IClientesDao extends CrudRepository<Cliente, Integer> {
  @Query(value = "select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from clientes where email = :email", nativeQuery = true)
  public boolean emailExiste(String email);
}
