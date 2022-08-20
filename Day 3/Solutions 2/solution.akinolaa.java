import java.util.ArrayList;

public class PascalsTriangle {

    public static ArrayList<ArrayList<Integer>> createTriangle(int n) {
        // Initialize first two rows of triangle
        ArrayList<ArrayList<Integer>> fullTriangle = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> line = new ArrayList<Integer>();
        line.add(1);
        fullTriangle.add(line); // row 1

        if(n == 1){
            return fullTriangle;
        }
        line = new ArrayList<Integer>();
        line.add(1); line.add(1);  // row 2
        fullTriangle.add(line);

        if(n == 2){
            return fullTriangle;
        }

        for(int i = 2; i<n; i++ ){
            //int prev = n-1;
            line = new ArrayList<Integer>();
            line.add(1);
            for(int j = 1; j<fullTriangle.get(i-1).size(); j++){
                line.add(fullTriangle.get(i-1).get(j-1) + fullTriangle.get(i-1).get(j));
            }
            line.add(1);
            fullTriangle.add(line);
        }
        return fullTriangle;
    }

    public static void main(String [] args) {
        System.out.println(createTriangle(4));
    }
}