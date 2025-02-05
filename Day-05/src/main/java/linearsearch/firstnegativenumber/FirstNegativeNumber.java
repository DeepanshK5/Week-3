package linearsearch.firstnegativenumber;

public class FirstNegativeNumber {

    public static int firstNegativeNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)return arr[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1,134,-2,34,124};

        System.out.println("First Negative Number is "+firstNegativeNumber(arr));
    }
}
