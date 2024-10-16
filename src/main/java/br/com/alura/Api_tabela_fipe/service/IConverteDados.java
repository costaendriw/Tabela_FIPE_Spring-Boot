package br.com.alura.Api_tabela_fipe.service;

import java.util.List;

public interface IConverteDados {
 <T> T ObterDados(String json, Class <T> classe);

 <T> List<T> obterLista(String json, Class<T> classe);
}
