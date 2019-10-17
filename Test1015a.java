import java.util.Arrays;

/*import java.util.Arrays;
1       //数组转字符串
public class Test1015a {
    public static void main(String[] args){
       int[] arr = {1,2,3,4,5};
       String newArr = Arrays.toString(arr);
               System.out.println(newArr);
    }
}*/
//拷贝数组
/*public class Test1015a{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int [] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));
    }
}
*/
//寻找最大值。
/*public class Test1015a{
    public static int  max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;++i){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {45,33,34,232,678,7,78};
        System.out.println(max(arr));
    }
}
*/
//求数组所有元素的平均值。
/*public class Test1015a{
    public static double avg(int[] arr){
        int sum = 0;
        double ave = 0.0;
        for(int i=0;i<arr.length;++i){
            sum +=arr[i];
        }
        return (double)sum/((double)arr.length);
    }

    public static void main(String[] args){
        int[] arr = {45,33,34,232,678,7,78};
       double num = avg(arr);
        System.out.println(num);
    }
}
*/
//查找指定元素。
/*public class Test1015a{
    public static int find(int[] arr,int find){
        for(int i=0;i<arr.length;++i) {
            if (find == arr[i]) {
                return i;
            }
            }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,56,67,34,54,7689,675,5};
        int result = find(arr,67);
        System.out.println(result);
    }
}
*/
/*
//同学问题
public class Test1015a{
    public static void main(String[] args){
    int num = 1234;
    func(num);
    }
    public static void  func(int num){
        if(num>9){
      func(num/10);
    }
    System.out.print(num%10+" ");
}
}
*/
//顺序数组二分查找。
/*public  class Test1015a{
    public  static void main(String[] args){
           int[] arr = {12,23,45,67,89,123,456,789};
           System.out.println(binarySearch(arr,123));
    }
    public static int binarySearch(int[] arr,int toFind){
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if  ( toFind < arr[mid] )  {
                right=mid-1;   //到左边查找。
            } else if (toFind>arr[mid]) {
                left=mid+1;    //到右边查找。
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
*/
//冒泡排序
/*public class Test1015a {
    public static void main(String[] args) {
        int[] arr = {12, 45, 34, 65, 1, 2, 456, 67};
        bit(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bit(int[] arr) {
        for (int i = 0; i < arr.length-1; ++i) {
            for (int j = 0; j < arr.length - 1-i; ++j) {
                if (arr[j ] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
*/
//数组逆序。
/*public class Test1015a{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        num(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void num(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int  temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            ++left;
            --right;
        }
    }
}
*/
//给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分.
/*public class Test1015a{
    public static  void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(left<right&&arr[left]%2==0){
                ++left;
            }
            while (left<right&&arr[right]%2!=0){
                --right;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}*/
//二维数组。
/*public class Test1015a {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
*/
