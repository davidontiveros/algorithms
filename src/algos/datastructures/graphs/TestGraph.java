package algos.datastructures.graphs; 

public class TestGraph
{
	public static void main(String args[])
	{
		UndirectedGraph graph = new UndirectedGraph(6);	
		/**/
		graph.addNode("1");
		graph.addNode("2");
		graph.addNode("3");
		graph.addNode("4");
		graph.addNode("5");
		graph.addNode("6");
		
		graph.addLink("6","4");
		graph.addLink("4","6");
		graph.addLink("4","3");
		graph.addLink("4","5");
		graph.addLink("5","4");
		graph.addLink("5","2");
		graph.addLink("5","1");
		graph.addLink("1","5");
		graph.addLink("1","2");
		graph.addLink("2","1");
		graph.addLink("2","5");
		graph.addLink("2","3");
		graph.addLink("3","2");
		graph.addLink("3","4");
		
		graph.printAdyMatrix();
		
		System.out.println(graph.getNode("4"));
		System.out.println(graph.getNode("2"));
		
	}	
	
}