package Estudos_POO.TesteCarro;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCarros {

    static int opcao;
    static int indice;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Carro> listaCarros = new ArrayList<>();
        boolean executando = true;

        while (executando){

            System.out.println("\n======= MENU =======");
            System.out.println("1 - Cadastrar um novo carro");
            System.out.println("2 - Exibir carros cadastrados");
            System.out.println("3 - Remover carro cadastrado");
            System.out.println("4 - Procurar carro cadastrado pela marca ou modelo");
            System.out.println("5 - Encerrar o programa");

            while (executando) {
                System.out.println("Digite a opção: ");
                try {
                    opcao = Integer.parseInt(scan.next());
                } catch (NumberFormatException e ){
                    System.err.println("\nERRO: Selecione uma opção valida\n");
                    continue;
                }
                break;
            }

            switch (opcao){
                case 1: {
                    System.out.println("Digite a marca: ");
                    String marca = scan.next();
                    System.out.println("Digite o modelo: ");
                    String modelo = scan.next();
                    System.out.println("Digite o ano: ");
                    int ano = scan.nextInt();

                    Carro novoCarro = new Carro(marca, modelo, ano);
                    listaCarros.add(novoCarro);

                    System.out.println("Carro cadastrado com sucesso!");
                    break;
                }

                case 2: {

                    if (listaCarros.isEmpty()){
                        System.err.println("\nERRO: Nenhum carro cadastrado\n");
                    }else {
                        for(Carro carro : listaCarros){
                        carro.exibirInformacoes();
                        }
                    }
                    break;
                }

                case 3:{
                    if (listaCarros.isEmpty()){
                        System.out.println("Nenhum carro cadastrado para ser removido");
                    } else {
                        for (int i = 0; i < listaCarros.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            listaCarros.get(i).exibirInformacoes();
                        }
                        while (executando) {
                            System.out.println("Qual numero do carro que deseja remover: ");
                            try {
                                indice = Integer.parseInt(scan.next());
                            } catch (NumberFormatException e) {
                                System.err.println("ERRO: Digite uma opção valida");
                                continue;
                            }
                            break;
                        }
                        if (indice > 0 && indice <= listaCarros.size()){
                            Carro removido = listaCarros.remove(indice - 1);
                            System.out.println("Carro removido: " + removido.getMarca() + " " + removido.getModelo() + " - Ano " + removido.getAno());
                        } else {
                            System.err.println("Opção invalida. Tente novamente!");
                        }
                    }
                    break;
                }

                case 4: {
                    if (listaCarros.isEmpty()){
                        System.out.println("Nenhum carro cadastrado no momento");
                        break;
                    } else {
                        System.out.println("Digite a marca ou modelo do carro: ");
                        String busca = scan.next().toLowerCase();
                        boolean encontrado = false;

                        for (Carro carro : listaCarros) {
                            if (carro.getModelo().toLowerCase().contentEquals(busca) || carro.getMarca().toLowerCase().contentEquals(busca)) {
                                carro.exibirInformacoes();
                                encontrado = true;
                            }
                        }

                        if (!encontrado){
                            System.out.println("Nenhum carro encontrado com esse nome");
                        }

                    }
                    break;
                }
                case 5: {
                    System.out.println("Encerrando... Obrigado por utilizar nosso programa!");
                    executando = false;
                    break;
                }
                default: {
                    System.err.println("\nERRO: Selecione uma opção do 1 ao 4");
                }

            }
        }

    }

}
