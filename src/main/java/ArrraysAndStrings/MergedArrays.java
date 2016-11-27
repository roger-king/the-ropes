package ArrraysAndStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roger on 11/27/16.
 */
public class MergedArrays {
    public  int[] merge(int[] a, int[] b)
    {
        int[] answer = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                answer[k] = a[i];
                i++;
            }else
            {
                answer[k] = b[j];
                j++;
            }
        }
        while(i < a.length)
        {
            answer[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length)
        {
            answer[k] = b[j];
            j++;
            k++;
        }
        return answer;
    }
    public List reverse(int[] arr){
        List<Integer> revArr = new ArrayList<Integer>();
        int i = 1;
        while(revArr.size() < arr.length)
        {
            revArr.add(arr[arr.length - i]);
            i++;
        }
        return revArr;
    }
}
