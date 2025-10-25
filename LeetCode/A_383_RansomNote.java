public class A_383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        int i=0, j=0;
        while(i<r.length && j< m.length){
            if(r[i] == m[j]){
                i++;
                j++;
            }else if(r[i] > m[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
}
