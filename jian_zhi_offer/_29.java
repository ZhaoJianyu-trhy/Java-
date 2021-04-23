public class _29 {
    public static int[] spiralOrder(int[][] matrix) {
        int verticalStart = 0, verticalEnd = matrix.length - 1, horizontalStart = 0, horizontalEnd = matrix[0].length - 1, index = 0;
        int[] ans = new int[matrix.length * matrix[0].length];
        while (true) {
            //打印的顺序
            //1.左->右
            for (int i = horizontalStart; i <= horizontalEnd; i++) {
                ans[index++] = matrix[verticalStart][i];
            }
            if (ans[ans.length - 1] != 0) break;
            verticalStart++;
            //2.上->下
            for (int i = verticalStart; i <= verticalEnd; i++) {
                ans[index++] = matrix[i][horizontalEnd];
            }
            if (ans[ans.length - 1] != 0) break;
            horizontalEnd--;
            //3.左->右
            for (int i = horizontalEnd; i >= horizontalStart; i--) {
                ans[index++] = matrix[verticalEnd][i];
            }
            if (ans[ans.length - 1] != 0) break;
            verticalEnd--;
            //4.下->上
            for (int i = verticalEnd; i >= verticalStart; i--) {
                ans[index++] = matrix[i][horizontalStart];
            }
            if (ans[ans.length - 1] != 0) break;
            horizontalStart++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] test = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int ans[] = spiralOrder(test);
        for (int nun :
                ans) {
            System.out.print(nun + " ");
        }
    }
}
