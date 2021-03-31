package part2;

/**
 * It is a test main class.
 * @author Gökhan Has
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        GokturkThree gokturkThree = new GokturkThree(matrix);
        Iterator iterator = gokturkThree.createIterator();
        gokturkThree.traverse();


        // Operations within the GokturkThree.traverse() method can be called here via the iterator variable.
        iterator = gokturkThree.createIterator();
        System.out.print("TRAVERSE CLOCK WISE SPIRALLY (Main) :  ");
        System.out.print(matrix[0][0] + " ");
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }
}
