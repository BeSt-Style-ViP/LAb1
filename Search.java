public class Search {

    public  static int binSearch(int[] arr, int num) {
        int max = arr.length;
        int min = 0;
        while (true) {
            int i = min + ((max - min) / 2);
            int curVal = arr[i];
            if (curVal < num) {
                if (i == min)
                    break;
                min = i;
            }
            else if (curVal > num)
                max = i;
            else
                return i;
        }
        return -1;
    }
}
