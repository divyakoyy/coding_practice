import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class CourseScheduler {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		HashMap<Integer, ArrayList<Integer>> g = new HashMap<Integer, ArrayList<Integer>>();
		HashSet<Integer> notSourceNodes = new HashSet<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();


		// fill in g

		for(int i = 0; i < prerequisites.length; i++) {
			int course = prerequisites[i][0];
			int prereq = prerequisites[i][1];
			notSourceNodes.add(course);
			if(g.containsKey(prereq)) {
				g.get(prereq).add(course);
			}
			else {
				g.put(prereq, new ArrayList<Integer>());
				g.get(prereq).add(course);
			}
		}
		// find source node
		int source = Integer.MIN_VALUE;
		for(int i = 0; i < numCourses; i++) {
			if(!notSourceNodes.contains(i)) {
				source = i;
			}
		}
		
		if(source < 0) return false;

		return dfs(g, visited, source);
	}

	public boolean dfs(HashMap<Integer, ArrayList<Integer>> g, HashSet<Integer> visited, int source) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(source);
		while(!s.isEmpty()) {
			int top = s.pop();
			
			visited.add(top);
			
			if(g.containsKey(top)){
				for(int n: g.get(top)) {
					if(!visited.contains(n)) {
						visited.add(n);
						s.push(n);
					}
					else {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] in = {{1,0}, {0,1}};
		int n = 2;
		CourseScheduler c = new CourseScheduler();
		System.out.println(c.canFinish(n,in));
	}
}
