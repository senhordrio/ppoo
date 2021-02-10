package compra;

import java.io.Serializable;

public class Compra implements Comparable<Compra>, Serializable {
  private static final long serialVersionUID = 1L;
  private String cpf;
  private String data;
  private String nomeProduto;
  private double preco;

  public Compra(String cpf, String data, String nomeProduco, double preco) {
    this.cpf = cpf;
    this.data = data;
    this.nomeProduto = nomeProduco;
    this.preco = preco;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getData() {
    return this.data;
  }

  public String getNomeProduto() {
    return this.nomeProduto;
  }

  public double getPreco() {
    return this.preco;
  }

  @Override
  public int compareTo(Compra c) {
    if (this.preco > c.preco) {
      return 1;
    } else if (this.preco < c.preco) {
      return -1;
    }
    return 0;
  }

  @Override
  public String toString() {
    return getData() + ", " + getNomeProduto() + ", " + getPreco();
  }
}
