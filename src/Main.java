//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ArrayOperations a = new ArrayOperations();
    int[] a1 = {1, 3, 0, 0, 0, 0, 0, 0};
    int[] b1 = {8, 7, 0, 0, 0, 0, 0, 0};
    int[] sum = a.add_array_numbers(a1, b1);

    int[] a2 = {8,3,0,0,0,0,0,0,0};
    int[] b2 = {8,2,0,0,0,0,0,0,0};
    int[] diff = a.subtract_array_numbers(a2, b2);

    int[] mul = a.multiplikation_on_array(a1,9);
    int[] div = a.division_on_array(b2,5);

    System.out.println("\nAddition: ");

    for (int i = 0; i < sum.length; i++) {
        System.out.print(sum[i]);
        if (i < sum.length - 1) {
            System.out.print(" ");
        }
    }


    System.out.println("\nSubtrakiton: ");

    for (int i = 0; i < diff.length; i++) {
        System.out.print(diff[i]);
        if (i < diff.length - 1) {
            System.out.print(" ");
        }
    }

    System.out.println("\n Multiplikation:");
    for (int i = 0; i < mul.length; i++) {
        System.out.print(mul[i]);
        if (i < mul.length - 1) {
            System.out.print(" ");
        }
    }

    System.out.println("\nDivision: ");
    for (int i = 0; i < div.length; i++) {
        System.out.print(div[i]);
        if (i < div.length - 1) {
            System.out.print(" ");
        }
    }






}

