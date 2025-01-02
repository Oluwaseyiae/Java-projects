package Array;

public class multiDimentionalArray {
    public static void main(String[] args) {

        int [][]num = {{11,23,45,23} , {32,43,53}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
        }
    }
}
