package compra;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class HistoricoDeCompras implements Serializable {
  private static final long serialVersionUID = 1L;
  private ArrayList<Compra> listaCompras;

  public HistoricoDeCompras() {
    this.listaCompras = new ArrayList<Compra>();
  }

  public void addCompra(Compra c) {
    listaCompras.add(c);
  }

  public ArrayList<Compra> getListaCompras() {
    return this.listaCompras;
  }

  public void imprimeComprasPorCPF(String cpf) {
    System.out.println();
    Collections.sort(listaCompras);
    for (Compra c : listaCompras) {
      if (c.getCpf().equals(cpf)) {
        System.out.println(c);
      }
    }
    System.out.println();
  }
}
