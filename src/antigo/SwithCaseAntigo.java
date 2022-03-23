package antigo;

import java.util.Scanner;

public class SwithCaseAntigo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia  da semana (EX: seg, ter, qua, qui, sex, sab, dom): ");
        String diaDaSemana = scanner.nextLine();

        String horarioDeFuncionamento;

        // swith case "ANTIGO"

        switch (diaDaSemana) {
            case "seg":
                horarioDeFuncionamento = "FECHADO";
                break;
            case "ter":
            case "qua":
            case "qui":
            case "sex":
                horarioDeFuncionamento = "ABERTO DAS:  08:00 AS 18:00";
                break;
            case "sab":
            case "dom":
                horarioDeFuncionamento = "ABERTO DAS: 08:00 AS 12:00";
                break;
            default:
                horarioDeFuncionamento = "DIA INVALIDO";
        }
        System.out.println(horarioDeFuncionamento);
    }
}
