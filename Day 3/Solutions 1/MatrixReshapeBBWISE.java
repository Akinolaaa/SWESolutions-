class Solution {
    static int [][] output;

  public int [][] matrixReshape(int [][] mat, int r, int c){
    int A=0,B=0,M=mat[0].length;
      int g=mat.length;
      if((r*c)!=(M*g)){return mat;}
    output=new int[r][c];
    for(int i=0;i<r;i++){
      for(int ii=0;ii<c;ii++){
        output[i][ii]=mat[A][B];
        if(B==M-1){
          A++;
          B=0;
        }
        else{
          B++;
        }
      }
    }
    return output;
  }
 }