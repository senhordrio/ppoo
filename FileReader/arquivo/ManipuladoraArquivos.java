package arquivo;

import java.io.*;
import compra.Compra;
import compra.HistoricoDeCompras;

public class ManipuladoraArquivos {

  public HistoricoDeCompras lerAquivoTexto(String nomeArquivo) {
    HistoricoDeCompras hc = new HistoricoDeCompras();
    try (BufferedReader arq = new BufferedReader(new FileReader(nomeArquivo))) {
      String linha = arq.readLine();
      while (linha != null) {
        String[] campos = linha.split(",");
        Compra c = new Compra(campos[0], campos[1], campos[2], Double.parseDouble(campos[3]));
        hc.addCompra(c);
        linha = arq.readLine();
      }
    } catch (IOException e) {
      System.out.println("Falha ao abrir arquivo " + nomeArquivo);
    }
    return hc;
  }

  public HistoricoDeCompras lerArquivoBinario(String nomeArquivo) {
    HistoricoDeCompras hc = null;
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
      hc = (HistoricoDeCompras) ois.readObject();
    } catch (Exception e) {
      System.out.println("Aconteceu um erro no arquivo: " + e.getMessage());
    }
    return hc;
  }

  public void GeraArquivoBinario(HistoricoDeCompras hc, String nomeArquivo) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
      oos.writeObject(hc);
    } catch (IOException e) {
      System.out.println("Aconteceu um erro no arquivo: " + e.getMessage());
    }
  }

  public void GeraRelatorioArquivoTexto(HistoricoDeCompras hc, String nomeArquivo) {
    String nomeArquivoTXT = nomeArquivo.concat(".txt");
    try (FileWriter arq = new FileWriter(nomeArquivoTXT)) {
      for (Compra c : hc.getListaCompras()) {
        if (c.getCpf().equals(nomeArquivo)) {
          arq.write(c.getData() + ", " + c.getNomeProduto() + ", " + c.getPreco() + "\n");
        }
      }
    } catch (IOException e) {
      System.out.println("Falha ao salvar no arquivo: " + nomeArquivo);
    }
  }
}
