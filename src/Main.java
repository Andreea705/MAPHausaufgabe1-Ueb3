//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ArrayOperations a = new ArrayOperations();
    int[] a1 = {1, 3, 0, 0, 0, 0, 0, 0};
    int[] b1 = {8, 7, 0, 0, 0, 0, 0, 0};
    int[] sum = a.add_array_numbers(a1, b1);

    System.out.print("Addition: ");

    for (int i = 0; i < sum.length; i++) {
        System.out.print(sum[i]);
        if (i < sum.length - 1) {
            System.out.print(" ");
        }
    }



}

