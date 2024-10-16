package br.com.alura.Api_tabela_fipe.Principal;

import br.com.alura.Api_tabela_fipe.model.Dados;
import br.com.alura.Api_tabela_fipe.model.Modelos;
import br.com.alura.Api_tabela_fipe.model.Veiculo;
import br.com.alura.Api_tabela_fipe.service.ConsumindoAPI;
import br.com.alura.Api_tabela_fipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    ///Chamada de consumo da Api
    private ConsumindoAPI consumo = new ConsumindoAPI();
    //Chamada de conversor dedos para lista
    private ConverteDados conversor =new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu() {
        var menu = """
                *** OPÇÔES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar:
                """ ;

        System.out.println(menu);

        var opcao = leitura.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        //Conversor de dados para lista
        var json = consumo.ObterDados(endereco);
        System.out.println(json);
        var marcas = conversor.obterLista(json, Dados.class);
        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        //Interação com usuário sobre as marcas:
        System.out.println("Informe o código da marca para consulta: ");
        var codigoMarca = leitura.nextLine();

        //Conversor de dados da lista de marcas por código
        endereco = endereco + "/" + codigoMarca + "/modelos";
        json = consumo.ObterDados(endereco);
        var modeloLista = conversor.ObterDados(json, Modelos.class);

        System.out.println("\nModelos desta marca: ");
        modeloLista.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("\nDigite um trecho do nome do carro a ser buscado: ");
        var nomeVeiculo = leitura.nextLine();

        List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                        .collect(Collectors.toList());

        System.out.println("\nModelos Filtrados: ");
        modelosFiltrados.forEach(System.out::println);

        System.out.println("Difgite por favor o código do modelo para buscar os valores de avaliação: ");
        var codigoModelo = leitura.nextLine();

        endereco = endereco + "/" + codigoModelo + "/anos";
        json = consumo.ObterDados(endereco);
        List<Dados> anos = conversor.obterLista(json, Dados.class);

        List<Veiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            var enderecoAnos = endereco + "/" + anos.get(i).codigo();
            json = consumo.ObterDados(enderecoAnos);

            Veiculo veiculo = conversor.ObterDados(json, Veiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("\nTodos os veículos filtrads com avaliações por ano: ");
        veiculos.forEach(System.out::println);

    }
}
