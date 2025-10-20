public class ArrayOperations {

    public static int[] add_array_numbers(int[] array1, int[] array2) {
            int lange = array1.length;
            int[] tempResult = new int[lange];
            int carry = 0;


            for (int i = lange - 1; i >= 0; i--) {
                    int sum = array1[i] + array2[i] + carry;
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

    public static int[] subtract_array_numbers(int[] array1, int[] array2) {
        int lange = array1.length;
        int[] result = new int[lange];
        int borrow = 0;

        for (int i = lange - 1; i >= 0; i--) {
            int diff = array1[i] - borrow - array2[i];

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        int firstNonZero = 0;

        while (firstNonZero < lange && result[firstNonZero] == 0) {
            firstNonZero++;
        }

        if (firstNonZero == lange) {
            return new int[]{0};
        }

        int[] endResult = new int[lange - firstNonZero];
        for (int i = 0; i < endResult.length; i++) {
            endResult[i] = result[firstNonZero + i];
        }

        return endResult;

    }

    public static int[] multiplikation_on_array(int[] array1, int ziffer){

        int lange = array1.length;
        int[] tempResult = new int[lange];
        int carry = 0;

        for (int i = lange - 1; i >= 0; i--) {
            int produkt = array1[i] * ziffer + carry;
            tempResult[i] = produkt%10;
            carry = produkt / 10;
        }

        if(carry > 0){
            int[] result = new int[lange + 1];
            result[0] = carry;

            for(int i = 1; i <= lange; i++){
                result[i] = tempResult[i - 1];
            }
            return result;
        }
        else{
            return tempResult;
        }
    }

    public static int[] division_on_array(int[] array1, int ziffer){
        int lange = array1.length;
        int[] tempResult = new int[lange];
        int rest = 0;

        for (int i = 0; i < lange; i++) {
            int division = rest * 10 + array1[i];
            tempResult[i] = division / ziffer;
            rest = division % ziffer;
        }

        int firstNonZero = 0;

        while (firstNonZero < lange && tempResult[firstNonZero] == 0) {
            firstNonZero++;
        }

        if (firstNonZero == lange) {
            return new int[]{0};
        }

        int[] result = new int[lange - firstNonZero];

        for (int i = 0; i < result.length; i++) {
            result[i] = tempResult[firstNonZero + i];
        }

        return result;

    }


}
