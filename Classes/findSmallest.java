public class findSmallest {
    int findSmall(int[] value) {
        int minIndex = 0;
        for (int i = 1; i < value.length; i++){
            if(value[i]<value[minIndex]){
                minIndex=1;
            }
        }
        return minIndex;
    }
}
