import java.util.ArrayList;
import java.util.List;

public class A_22_GenerateParentese {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, 0, 0 , "", n);
        return result;
    }
    public static void backtrack(List<String> result, int left, int right, String s, int n){
        if(s.length() == n*2){
            result.add(s);
            return;
        }if(left<n){
            backtrack(result,left+1, right, s+"(", n);
        }if(right<left){
            backtrack(result,left,right+1,s+")",n);
        }
    }

    public static void main(String[] args) {
        System.out.println(generatePar(3));
    }


    public static List<String> generatePar(int n) {
        List<String> result = new ArrayList<>();
        back(result,0,0,"", n);
        return result;
    }

    private static void back(List<String> result, int start, int end, String s, int n){
        if(s.length() == 2*n){
            result.add(s);
        }if(start<n){
            back(result,start+1, end, s+"(", n);
        }if(end<start){
            back(result, start, end+1, s+")", n);
        }
    }
































}
