package com.wvitorcorp.ecommerceaula.daos;

import org.springframework.data.repository.CrudRepository;

import com.wvitorcorp.ecommerceaula.models.Produto;

public interface IProdutosDao extends CrudRepository<Produto, Integer> {

}
