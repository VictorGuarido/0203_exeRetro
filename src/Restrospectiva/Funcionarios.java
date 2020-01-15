package Restrospectiva;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<String> listaFunc = new ArrayList<>();

        listaFunc.add("josé");
        listaFunc.add("josefa");
        listaFunc.add("jefferson");
        listaFunc.add("jroger");

        int contador = 0;
        for (String funcionario : listaFunc){
            contador++;
            System.out.println(contador + " - " + funcionario);
        }

        System.out.println("(Digite corretamente) Qual nome você quer remover: ");
        String removeNome = ler.nextLine();

        listaFunc.remove(removeNome);

        int contador2 = 0;
        for (String funcionario : listaFunc){
            contador2++;
            System.out.println(contador2 + " - " + funcionario);
        }

    }

}
