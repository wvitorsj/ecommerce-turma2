package com.wvitorcorp.ecommerceaula.models;

import java.time.LocalDateTime;

public class Pedido {
  private int idCliente;
  private double valorTotal;
  private LocalDateTime data;

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

}
