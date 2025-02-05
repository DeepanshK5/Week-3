package linearsearch.searchword;

public class SearchWord {

    public static String Search(String[] arr, String target){
        for(int i=0;i<arr.length;i++){
            String[] line = arr[i].split(" ");
            for(int j=0;j<line.length;j++){
                if(line[j].equals(target))return arr[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"My name is XYZ","I age is $","Search for target ends here","Your target is King","Good Day"};
        System.out.println(Search(arr,"King"));
    }
}
