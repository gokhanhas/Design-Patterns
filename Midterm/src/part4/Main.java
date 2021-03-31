package part4;

/**
 * @author Gökhan Has - 161044067
 */
public class Main {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("ERROR ! Input file name doesnt exist ");
            return;
        }


        if(args[0] == null) {
            System.out.println("ERROR ! Input file name doesnt exist ");
            return;
        }


        TransformSolver transformSolver = new DFT_TransformSolver();
        System.out.println("Calculating DFT Transform : ");
        transformSolver.calculateTransform(args[0], "outputDFT.txt");


        transformSolver = new DCT_TransformSolver();
        System.out.println("Calculating DCT Transform : ");
        transformSolver.calculateTransform(args[0], "outputDCT.txt");
    }
}
