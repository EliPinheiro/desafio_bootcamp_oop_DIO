import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        curso1.setTitulo("java");
        curso1.setDescricao("dio");
        curso1.setCargaHoraria(5);

        curso2.setTitulo("python");
        curso2.setDescricao("python dio");
        curso2.setCargaHoraria(4);

        mentoria1.setTitulo("Mnetoria js");
        mentoria1.setDescricao("Curso de js");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java develpment");
        bootcamp.setDescricao("descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso2);

        Dev devEli = new Dev();
        Dev devDalia = new Dev();
        devDalia.setNome("Dalia");
        devEli.setNome("Eli");
        devDalia.increverBootcamp(bootcamp);
        devEli.increverBootcamp(bootcamp);

        devEli.progredir();
        devDalia.progredir();
        devDalia.progredir();
        devDalia.progredir();
        devDalia.progredir();

        System.out.println("Conteudos inscrito: " + devDalia.getConteudosIncritos());
        System.out.println("Conteudos Concluidos: " + devDalia.getConteudosConcluidos());
        System.out.println("Conteudos inscrito: " + devEli.getConteudosIncritos());
        System.out.println("Conteudos Concluidos: " + devEli.getConteudosConcluidos());


    }
}