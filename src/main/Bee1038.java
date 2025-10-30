package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 * A seguir, calcule e mostre o valor da conta a pagar.
 * Entrada: O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
 * Saída: O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */
public class Bee1038 {

    public static void main(String[] args) {
        Map<Integer, Double> menu = new HashMap<>();
        menu.put(1, 4.0);
        menu.put(2, 4.5);
        menu.put(3, 5.0);
        menu.put(4, 2.0);
        menu.put(5, 1.5);

        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        if (menu.containsKey(codigo)){
            System.out.printf("Total: R$ %.2f", (menu.get(codigo) * quantidade));
        }

    }
}
