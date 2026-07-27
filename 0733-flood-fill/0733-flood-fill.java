class Solution {

    public void helper(int[][] image, int sr, int sc, int color, int orgColor) {

        // Boundary check
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }

        // Stop if the color is different
        if (image[sr][sc] != orgColor) {
            return;
        }

        // Paint the current pixel
        image[sr][sc] = color;

        // Explore all 4 directions
        helper(image, sr, sc - 1, color, orgColor); // Left
        helper(image, sr, sc + 1, color, orgColor); // Right
        helper(image, sr - 1, sc, color, orgColor); // Up
        helper(image, sr + 1, sc, color, orgColor); // Down
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int orgColor = image[sr][sc];

        // If the new color is the same as the original, do nothing
        if (orgColor == color) {
            return image;
        }

        helper(image, sr, sc, color, orgColor);

        return image;
    }
}