public class Stuff {
    public static void main(String[] args) {
        int[][] multidimensionalArray = {
            {1,2,3,4},
            {5,6,7,8},
            {4,3,2,1}
        };

        int[][][] threeLayerArray = {
            {
                {1,2,3,4},
                {5,6,7,8},
            },
            {
                {4,3,2,1},
                {8,7,6,4}
            }
        };

        for (int[] iArr : multidimensionalArray) {
            for (int i : iArr) {
                System.out.println(i);
            }
        }

    }
}