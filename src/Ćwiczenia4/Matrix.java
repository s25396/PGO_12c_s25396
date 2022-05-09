package Ćwiczenia4;

public class Matrix {
    private static int[][] currentMatrix;
    private int [][] generalMatrix;

    private Matrix(int [][] generalMatrix){
        setGeneralMatrix(generalMatrix);

    }

    public int[][] getGeneralMatrix() {
        return generalMatrix;
    }

    public static int[][] getCurrentMatrix() {
        return currentMatrix;
    }

    public void setGeneralMatrix(int[][] generalMatrix) {

        this.generalMatrix = generalMatrix;
    }

    public static void setUpMatrix(int rowCount, int columnCount) {
        if(rowCount==0 || columnCount==0){
            throw new RuntimeException("Matrix cannot be empty");
        }
        currentMatrix = new int[rowCount][columnCount];
    }

    public static Matrix create() {
        Matrix now= new Matrix(currentMatrix);
        currentMatrix=null;
        return now;
    }

    public static void insertRow(int[] row) {
        for (int i = 0; i < currentMatrix.length; i++) {
            if (currentMatrix[i][0] == 0) {
                for (int k = 0; k < row.length; k++) {
                    currentMatrix[i][0] = row[k];
                    for (int j = 1; j < currentMatrix[i].length; j++) {
                        currentMatrix[i][j] = row[j];
                    }
                    break;
                }
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < generalMatrix.length; i++) {
            System.out.print("| ");
            int[] x = generalMatrix[i];
            for (int j = 0; j < x.length; j++) {
                System.out.print(generalMatrix[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }


    }

    public Matrix add(Matrix m) {
        if(this.generalMatrix.length!=m.getGeneralMatrix().length){
            throw new RuntimeException("Matrixes have different size!");
        }
        else{
            for(int i = 0; i< this.generalMatrix.length; i++){
            for(int j = 0; j<m.getGeneralMatrix().length; j++) {
                this.generalMatrix[i][j] = this.generalMatrix[i][j] + m.generalMatrix[i][j];
        }}
    return this;
    }
    }

    public static Matrix add(Matrix m, Matrix m2) {
        int cc[][]=new int[m.getGeneralMatrix().length][m2.getGeneralMatrix().length];
        Matrix c= new Matrix(cc);
        if(m.generalMatrix.length!=m2.getGeneralMatrix().length){
            throw new RuntimeException("Matrixes have different size!");
        }
        else{
            for(int i = 0; i< m.generalMatrix.length; i++){
                for(int j = 0; j<m2.getGeneralMatrix().length; j++) {
                    c.generalMatrix[i][j]= m.generalMatrix[i][j] + m2.generalMatrix[i][j];
                }}
            return c;
        }
    }

    public Matrix subtract(Matrix m) {
        if(this.generalMatrix.length!=m.getGeneralMatrix().length){
            throw new RuntimeException("Matrixes have different size!");
        }
        else{
            for(int i = 0; i< this.generalMatrix.length; i++){
                for(int j = 0; j<m.getGeneralMatrix().length; j++) {
                    this.generalMatrix[i][j] = this.generalMatrix[i][j] - m.generalMatrix[i][j];
                }}
            return this;
        }
    }

    public static Matrix subtract(Matrix m, Matrix m2) {
        int cc[][]=new int[m.getGeneralMatrix().length][m2.getGeneralMatrix().length];
        Matrix c= new Matrix(cc);
        if(m.generalMatrix.length!=m2.getGeneralMatrix().length){
            throw new RuntimeException("Matrixes have different size!");
        }
        else{
            for(int i = 0; i< m.generalMatrix.length; i++){
                for(int j = 0; j<m2.getGeneralMatrix().length; j++) {
                    c.generalMatrix[i][j]= m.generalMatrix[i][j] - m2.generalMatrix[i][j];
                }}
            return c;
        }
}

    public static Matrix multiply(Matrix m, Matrix m2){
        Matrix multiplied;
        if(m.getGeneralMatrix()[0].length!=m2.getGeneralMatrix().length){
            throw new RuntimeException(" You cannot multiply Matrixes in which number of rows of first matrix is not equal to number of columns of the second one!");
        }
        else{
            int [][] cc= new int[m.getGeneralMatrix().length][m2.getGeneralMatrix()[0].length];
            for(int row=0;row<m.generalMatrix.length;row++){
                for(int col=0;col<m2.generalMatrix[0].length;col++){
                    for(int i=0;i<m.generalMatrix[0].length;i++){
                        cc[row][col] += m.getGeneralMatrix()[row][i]*m2.getGeneralMatrix()[i][col];
                    }
                }
            }
            multiplied= new Matrix(cc);
        }

    return multiplied;
}}
