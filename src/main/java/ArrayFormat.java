import java.util.Arrays;
import java.util.*;
public class ArrayFormat {
    public static  void sortByAsc(int[] arr){
        Arrays.sort(arr);
    }
    public static  <T> void sortByAsc(T[] arr){
        Arrays.sort(arr);
    }
    public static  void sortByDesc(int[] arr){
        Arrays.sort(arr);
        reverse(arr);
    }
    //冒泡法排序
    public static void sortBubbleByAsc(int[] arr){
        int length = arr.length;
        int temp;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //选择法排序
    public static void sortSelectByAsc(int[] arr){
        int length = arr.length;
        int temp;
        for(int i = 0;i<length-1;i++){
            int k = i;
            for (int j=i+1;j<length;j++){
                if(arr[k]>arr[j]){
                    k = j;
                }
            }
            if (k != i) {
                temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
            }
        }
    }
    //插入法排序
    public static void sortInsertByAsc(int[] arr){
        int len = arr.length;
        int temp;
        for (int i =1;i<len;i++){
            for (int j=i-1;j>=0;j--){
                if(arr[j]<=arr[j+1]) break;
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
     //泛型方法
    public static  <T> void sortByDesc(T[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
    }
    public static  void reverse(int[] arr){
        int length = arr.length;
        int temp;
        for (int i=0; i < length/2;i++){
            temp = arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=temp;
        }
    }
    public static  <T> void reverse(T[] arr){
        int length = arr.length;
        for (int i=0; i < length/2;i++){
            T temp = arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=temp;
        }
    }
    public static <T> String toString(T[] arr){
        return Arrays.toString(arr);
    }
    public static <T> boolean isEqual(T[] arr1, T[] arr2){
        return Arrays.equals(arr1,arr2);
    }
    public static <T> String join(T[] arr){
        StringBuffer strResult= new StringBuffer("");
        for(int i = 0; i<arr.length;i++){
            if(i==arr.length-1){
                strResult.append(arr[i]);
            }
            else {
                strResult.append(arr[i] + ",");
            }
        }
        return strResult.toString();
    }
    public static <T> String join(T[] arr,String delimiter){
        StringBuffer strResult= new StringBuffer("");
        for(int i = 0; i<arr.length;i++){
            if(i==arr.length-1){
                strResult.append(arr[i]);
            }
            else {
                strResult.append(arr[i] + delimiter);
            }
        }
        return strResult.toString();
    }
    public static <T> void printArray(T[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static int indexOf(int[] arr, int ele){
        for (int i = 0;i<arr.length;i++){
            if(ele == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key){
        return Arrays.binarySearch(arr,key);
    }
    public static int[] insert(int[] arr, int ele, int index){
        if(index > arr.length) return arr;
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr,0,newArr,0,index);
        newArr[index] = ele;
        System.arraycopy(arr,index,newArr,index+1,arr.length-index);
        return newArr;

    }
}
