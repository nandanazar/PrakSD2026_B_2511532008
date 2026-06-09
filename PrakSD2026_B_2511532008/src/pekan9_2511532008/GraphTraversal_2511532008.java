package pekan9_2511532008;
import java.util.*;

public class GraphTraversal_2511532008 {
	private Map <String, List <String>> graph_2008 = new HashMap <> ();
	

	public void addEdge_2008 (String node1_2008, String node2_2008) {
		graph_2008.putIfAbsent(node1_2008, new ArrayList<>());
		graph_2008.putIfAbsent(node2_2008, new ArrayList<>());
		graph_2008.get(node1_2008).add(node2_2008);
		graph_2008.get(node2_2008).add(node1_2008);
	}
	

	public void printGraph_2008() {
		System.out.println("Graf Awal (Adjancency List) : ");
		for (String node_2008 : graph_2008.keySet()) {
			System.out.print(node_2008 + "-> ");
			List<String> neighbors_2008 = graph_2008.get(node_2008);
			System.out.println(String.join(",", neighbors_2008));
		}
		System.out.println();
	}

	public void dfs_2008 (String start_2008) {
		Set <String> visited_2008 = new HashSet <>();
		System.out.println("Penelusuran DFS : ");
		dfsHelper_2008(start_2008, visited_2008);
		System.out.println();
	}
	
	
	private void dfsHelper_2008 (String current_2008, Set <String> visited_2008) {
		if (visited_2008.contains(current_2008)) return;
		visited_2008.add(current_2008);
		System.out.print(current_2008 + " ");
		for (String neighbor_2008 : graph_2008.getOrDefault(current_2008, new ArrayList<>())) {
			dfsHelper_2008(neighbor_2008, visited_2008);
		}
	}
	
	void bfs_2008 (String start_2008) {
		Set<String> visited_2008 = new HashSet <>();
		Queue <String> queue_2008 = new LinkedList<>();
		queue_2008.add(start_2008);
		visited_2008.add(start_2008);
		System.out.println("Penelusuran BFS :");
		while (!queue_2008.isEmpty()) {
			String current_2008 = queue_2008.poll();
			System.out.print(current_2008 + " ");
			for (String neighbor_2008 : graph_2008.getOrDefault(current_2008, new ArrayList<>())) {
				if (!visited_2008.contains(neighbor_2008)) {
					queue_2008.add(neighbor_2008);
					visited_2008.add(neighbor_2008);
				}
			}
		}
		System.out.println();
	}
	
	public static void main (String [] Args) {
		GraphTraversal_2511532008 graph_2008 = new GraphTraversal_2511532008();
		
	
		graph_2008.addEdge_2008("A", "B");
		graph_2008.addEdge_2008("A", "C");
		graph_2008.addEdge_2008("B", "D");
		graph_2008.addEdge_2008("B", "E");
		
		System.out.println("Graf Awal adalah : ");
		graph_2008.printGraph_2008();
		
		//lakukan penelusuran
		graph_2008.dfs_2008("A");
		graph_2008.bfs_2008("A");
	}
}