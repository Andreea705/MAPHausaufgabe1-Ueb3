public class ArrayOperations {

    public static int[] add_array_numbers(int[] a, int[] b) {
            int lange = a.length;
            int[] tempResult = new int[lange];
            int carry = 0;


            for (int i = lange - 1; i >= 0; i--) {
                    int sum = a[i] + b[i] + carry;
                    tempResult[i] = sum % 10;
                    carry = sum / 10;
            }


            if (carry > 0) {

                int[] result = new int[lange + 1];
                result[0] = carry;

                for(int i = 1; i <= lange; i++) {
                    result[i] = tempResult[i - 1];
                }

                return result;
            }
            
            else {
                return tempResult;
            }
        }

}
