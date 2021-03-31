package part4;

public class DCT_TransformSolver extends TransformSolver {

    /**
     * It is the function where calculations will be made according to the related method. In here DCT method calls..
     */
    @Override
    public void calculateTransformByMethod() {
        int N = input_arr.size();
        double k = Math.PI / N;
        for(int i = 0; i < N; i++) {
            double result = 0.0;
            for(int j = 0; j < N; j++) {
                result += input_arr.get(j) * Math.cos((0.5 + j) * i * k);
            }
            output_arr.add(result);
        }
    }
}
