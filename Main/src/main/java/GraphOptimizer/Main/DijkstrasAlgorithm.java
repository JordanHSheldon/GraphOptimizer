package GraphOptimizer.Main;

public class DijkstrasAlgorithm {

    int minDist(int[] dist, Boolean[] boo) {
        int min = Integer.MAX_VALUE, temp = -1;

        for (int i = 0; i < dist.length; i++)
            if (!boo[i] && dist[i] <= min) {
                min = dist[i];
                temp = i;
            }
        
        return temp;
    }

    int[] shortestPath(int[][] matrix, String start, String end, String[] array) {
        int size = matrix.length;
        int search = 0, searchEnd = 0;
        int[] arrayPath = new int[size];

        int distance = 0;
        int[] dist = new int[size];
        Boolean[] boo = new Boolean[size];
        for (int i = 0; i < size; i++) {
            dist[i] = Integer.MAX_VALUE;
            boo[i] = false;
        }
        dist[search] = 0;

        for (int j = 0; j < size - 1; j++) {
            distance = minDist(dist, boo);
            boo[distance] = true;

            for (int k = 0; k < size; k++)
                // checking to see which of the previous and current path length is shorter
                if (!boo[k] && matrix[distance][k] != 0 && dist[distance] != Integer.MAX_VALUE && dist[distance] + matrix[distance][k] < dist[k]) {
                    dist[k] = dist[distance] + matrix[distance][k];

                    //just needs to have the shortest path and distance added.
                    arrayPath[k] = matrix[distance][k];
                }
        }

        return arrayPath;
    }
}