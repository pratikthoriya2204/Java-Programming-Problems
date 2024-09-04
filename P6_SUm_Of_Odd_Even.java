public class P6_SUm_Of_Odd_Even {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int even=0,odd=0,i;

        for(i=0;i<arr.length;i++){
            if (i % 2 == 0) {
                even += arr[i];
            }else{
                odd += arr[i];
            }
        }
        System.out.println("sum of odd:"+odd);
        System.out.println("sum of EVEN:"+even);
    }
}
