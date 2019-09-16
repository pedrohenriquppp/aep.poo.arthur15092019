package aeparthur.primary;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Aluno aluno1 = new Aluno();
        aluno1.setNomeAluno("Pedro");
        aluno1.setRaAluno("1821292");
        
        Aluno aluno2 = new Aluno();
        aluno2.setNomeAluno("Guilherme");
        aluno2.setRaAluno("122292");
        
        Aluno aluno3 = new Aluno();
        aluno3.setNomeAluno("Edinison");
        aluno3.setRaAluno("151292");
        
        Aluno aluno4 = new Aluno();
        aluno4.setNomeAluno("Thigo");
        aluno4.setRaAluno("141292");
        
        Nota nota1 = new Nota();
        nota1.setNota(6.0);
        
        Nota nota2 = new Nota();
        nota2.setNota(10.0);
        
        Nota nota3 = new Nota();
        nota3.setNota(5.0);
        
        Nota nota4 = new Nota();
        nota4.setNota(8.0);
        
        Avaliação avaliação1 = new Avaliação();
        avaliação1.setDataAplicação("10/01/2019");
        avaliação1.setNomeProfessor("Fernando");
        
        Avaliação avaliação2 = new Avaliação();
        avaliação2.setDataAplicação("10/01/2019");
        avaliação2.setNomeProfessor("Fernando");
       
        Avaliação avaliação3 = new Avaliação();
        avaliação3.setDataAplicação("10/01/2019");
        avaliação3.setNomeProfessor("Fernando");
        
        Avaliação avaliação4 = new Avaliação();
        avaliação4.setDataAplicação("10/01/2019");
        avaliação4.setNomeProfessor("Fernando");
        
        Conceito conceito1 = new Conceito("234", aluno1, avaliação1);
        conceito1.setNota(nota1);
        
        Conceito conceito2 = new Conceito("224", aluno2, avaliação2);
        conceito2.setNota(nota2);
        
        Conceito conceito3 = new Conceito("114", aluno3, avaliação3);
        conceito3.setNota(nota3);
        
        Conceito conceito4 = new Conceito("254", aluno4, avaliação4);
        conceito4.setNota(nota4);
        
        List<Conceito> conceitos = new ArrayList<Conceito>();
        conceitos.add(conceito1);
        conceitos.add(conceito2);
        conceitos.add(conceito3);
        conceitos.add(conceito4);
        
        for (Conceito conceito : conceitos) {
        	System.out.println();
        	System.out.println("ID:" + conceito.getId());
			System.out.println("Nome do Aluno:" + conceito.getAluno().getNomeAluno());
			System.out.println("RA Aluno:" + conceito.getAluno().getRaAluno());
			System.out.println("Nota:" + conceito.getNota().getNota());
			System.out.println("Avaliação:" + conceito.getAvaliação().getDataAplicação());
			System.out.println("Nome do Professor:" + conceito.getAvaliação().getNomeProfessor());
		}
           
        
        
    }
}
