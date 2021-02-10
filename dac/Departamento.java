package dac;

import java.util.ArrayList;

public class Departamento {
    private String sigla;
    private ArrayList<Disciplina> disciplinas;
    
    public Departamento(String sigla) {
        this.sigla = sigla;
        disciplinas = new ArrayList<Disciplina>();
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    private Disciplina buscarDisciplina(String codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public void removerDisciplina(String codigo) {
        Disciplina d = buscarDisciplina(codigo);
        if (d != null) {
            disciplinas.remove(d);
        }
    }

    public void listarDisciplinas() {
        for (Disciplina d : disciplinas) {
            System.out.printf("Disciplina: %s / Carga Horária Semanal: %d%n", d.getCodigo(),
                    d.getCargaHorariaSemanal());
        }
    }
}