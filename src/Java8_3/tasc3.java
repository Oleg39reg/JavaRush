package Java8_3;

public class tasc3 {
        public static int sum(int[] arr){
            int total = 0;
            for (int num : arr){
                if(num>0){
                    total += num;
                }
            }
            return total;
        }

        public static void main(String[] args) {
            int[] arr = {-1, -4, -5, -8};
            int result = sum(arr);
            System.out.println(result);
        }

    }

