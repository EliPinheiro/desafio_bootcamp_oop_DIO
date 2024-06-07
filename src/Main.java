import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        curso1.setTitulo("java");
        curso1.setDescricao("dio");
        curso1.setCargaHoraria(5);

        mentoria1.setTitulo("Mnetoria js");
        mentoria1.setDescricao("Curso de js");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}