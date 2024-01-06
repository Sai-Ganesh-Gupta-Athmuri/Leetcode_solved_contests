class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(new int[]{x, 0});
        visited.add(x);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int operations = current[1];

            if (value == y) {
                return operations;
            }

            if (!visited.contains(value + 1)) {
                queue.offer(new int[]{value + 1, operations + 1});
                visited.add(value + 1);
            }

            if (!visited.contains(value - 1)) {
                queue.offer(new int[]{value - 1, operations + 1});
                visited.add(value - 1);
            }

            if (value % 5 == 0 && !visited.contains(value / 5)) {
                queue.offer(new int[]{value / 5, operations + 1});
                visited.add(value / 5);
            }

            if (value % 11 == 0 && !visited.contains(value / 11)) {
                queue.offer(new int[]{value / 11, operations + 1});
                visited.add(value / 11);
            }
        }

        return -1;
    
    }
}
