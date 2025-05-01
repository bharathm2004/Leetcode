class Solution {
    static public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int n = tasks.length, m = workers.length;
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int res = 0, start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean ok = solve(tasks, workers, mid, m, pills, strength);
            if (ok) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    static private boolean solve(int[] t, int[] w, int k, int m, int pills, int strength) {
        if (k > m) return false;

        int[] tasksK = new int[k];
        int[] workersK = new int[k];
        for (int i = 0; i < k; i++) tasksK[i] = t[i];
        for (int i = 0; i < k; i++) workersK[i] = w[m - k + i];

        for (int i = k - 1; i >= 0 && pills > 0; i--) {
            if (tasksK[i] > workersK[i]) {
                tasksK[i] -= strength;
                pills--;
            }
        }

        Arrays.sort(tasksK);
        for (int i = 0; i < k; i++) {
            if (workersK[i] < tasksK[i]) return false;
        }
        return true;
    }
}