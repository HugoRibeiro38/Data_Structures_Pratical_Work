package API.Interfaces;

import com.so.Collections.Arrays.ArrayList;
import com.so.Collections.Arrays.ArrayUnorderedList;
import com.so.Collections.Map.HashMap;

/**
 * Representa as operações para manipulação de um grafo.
 */
public interface IConcreteGraph {

  /**
   * Adiciona uma rota.
   * @param start O ponto de início da rota.
   * @param end O ponto de destino da rota.
   */
  void addRoute(int start, int end);

  /**
   * Remove uma rota.
   * @param start O ponto de início da rota.
   * @param end O ponto de destino da rota.
   */
  void removeRoute(int start, int end);

  /**
   * Remove um lugar pelo ID.
   * @param id O ID do lugar a ser removido.
   */
  void removePlace(int id);

  /**
   * Obtém todas as rotas.
   * @return Um HashMap que mapeia os pontos de início para uma lista de pontos de destino.
   */
  HashMap<Integer, ArrayUnorderedList<Integer>> getRoutes();

  /**
   * Adiciona um lugar ao grafo.
   * @param place O lugar a ser adicionado.
   */
  void addPlace(ILocalType place);

  /**
   * Executa o algoritmo de Dijkstra a partir do ponto de início até o ponto final.
   * @param start O ponto de início.
   * @param end O ponto final.
   * @return Uma lista de lugares que representam o caminho mais curto entre o ponto de início e o ponto final.
   */
  ArrayList<ILocalType> djistkra(ILocalType start, ILocalType end);

  /**
   * Encontra todos os caminhos possíveis entre o ponto de início e o ponto final que passam pelos pontos fornecidos.
   * @param toPass Uma lista de pontos a serem visitados.
   * @param start O ponto de início.
   * @param end O ponto final.
   * @return Uma lista de listas de lugares que representam todos os caminhos possíveis entre o ponto de início e o ponto final que passam pelos pontos fornecidos.
   */
  ArrayList<ILocalType> findPaths(ArrayList<ILocalType> toPass, ILocalType start, ILocalType end);

}
