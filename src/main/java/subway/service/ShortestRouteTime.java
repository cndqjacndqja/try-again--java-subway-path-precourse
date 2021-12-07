package subway.service;

import java.util.List;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class ShortestRouteTime {
	public static WeightedMultigraph<String, DefaultWeightedEdge> graph = new WeightedMultigraph(DefaultWeightedEdge.class);
	public static DijkstraShortestPath dijkstraShortestPath;

	static {
		graph.addVertex("교대역");
		graph.addVertex("강남역");
		graph.addVertex("역삼역");
		graph.addVertex("남부터미널역");
		graph.addVertex("양재역");
		graph.addVertex("양재시민의숲역");
		graph.addVertex("매봉역");
		graph.setEdgeWeight(graph.addEdge("교대역", "강남역"), 3);
		graph.setEdgeWeight(graph.addEdge("강남역", "역삼역"), 3);
		graph.setEdgeWeight(graph.addEdge("교대역", "남부터미널역"), 2);
		graph.setEdgeWeight(graph.addEdge("남부터미널역", "양재역"), 5);
		graph.setEdgeWeight(graph.addEdge("양재역", "매봉역"), 1);
		graph.setEdgeWeight(graph.addEdge("강남역", "양재역"), 8);
		graph.setEdgeWeight(graph.addEdge("양재역", "양재시민의숲역"), 3);
		dijkstraShortestPath = new DijkstraShortestPath(graph);
	}
}
