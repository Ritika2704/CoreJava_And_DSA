package RevisionDSABasic;

import java.util.ArrayList;
import java.util.List;

public class flatenArray {

    public static List<Integer> flattenArray(Object[] arr) {
        List<Integer> result = new ArrayList<>();
        for (Object element : arr) {
            if (element instanceof Integer) {
                result.add((Integer) element);
            } else if (element instanceof Object[]) {
                result.addAll(flattenArray((Object[]) element));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Object[] arr = {
                new Object[] {1, 2, 3},
                new Object[] {4, 5, 6},
                new Object[] {7, 8, new Object[] {9, 10, 11}, 12},
                new Object[] {13, 14, 15}
        };

        List<Integer> flattenedList = flattenArray(arr);
        System.out.println(flattenedList);
    }
}
