package dominio;

import java.time.LocalDate;

public class Mentoria extends Atividade {

    private final LocalDate dataInicio = LocalDate.now();

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    @Override
    public double calcularXp() {
        return XP + 25d;
    }

    @Override
    public String toString() {
        return "Mentoria [data inicio: " + dataInicio + ", titulo: " + getTitulo() + ", descricao: "
                + getDescricao() + ", instrutor: " + getInstrutor() + "]";
    }

}
