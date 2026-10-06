import java.util.*;

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<double[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(new double[]{v, succProb[i]});
            graph.get(v).add(new double[]{u, succProb[i]});
        }

        double[] prob = new double[n];
        prob[start] = 1.0;

        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[1], a[1])
        );

        pq.offer(new double[]{start, 1.0});

        while (!pq.isEmpty()) {
            double[] current = pq.poll();
            int node = (int) current[0];
            double currentProb = current[1];

            if (node == end) {
                return currentProb;
            }

            if (currentProb < prob[node]) {
                continue;
            }

            for (double[] edge : graph.get(node)) {
                int next = (int) edge[0];
                double newProb = currentProb * edge[1];

                if (newProb > prob[next]) {
                    prob[next] = newProb;
                    pq.offer(new double[]{next, newProb});
                }
            }
        }

        return 0.0;
    }
}