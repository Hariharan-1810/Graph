import java.util.*;

public class bfs
{
    
    public static ArrayList<Integer> find(int v, ArrayList<ArrayList<Integer>> neighbors)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<Integer>();

        int node = 0;
        visited[node] = true;
        queue.add(node);

        while(!queue.isEmpty())
        {
            node = queue.poll();
            ans.add(node);

            for(int i=0; i<neighbors.get(node).size(); i++)
            {
                int neighbor = neighbors.get(node).get(i);
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }


        return ans;
    }

    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> neighbors = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<5; i++)
        {
            neighbors.add(new ArrayList<Integer>());
        }

        neighbors.get(0).add(1);
        neighbors.get(0).add(2);

        neighbors.get(1).add(0);
        neighbors.get(1).add(3);

        neighbors.get(2).add(0);
        neighbors.get(2).add(3);

        neighbors.get(3).add(1);
        neighbors.get(3).add(2);
        neighbors.get(3).add(4);

        neighbors.get(4).add(3);

        System.out.println(find(5, neighbors));
    }
}