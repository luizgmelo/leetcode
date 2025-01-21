public class ContainerWithMostWater {

    public static void main(String[] args) {
        var solution = new ContainerWithMostWater();
        int[] heights = new int[]{1,7,2,5,4,7,3,6};
        int maxArea = solution.maxArea(heights);
        System.out.println(maxArea);
    }

    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(heights[left], heights[right]) * (right-left);
            maxArea = Math.max(maxArea, currentArea);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

