public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double [] array2 = {1.57, 7.654, 9.986};
        int [] array3 = {7,8,9};
        System.out.println();

        System.out.println("Задача 2:");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);
            if (i<array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0;i<array2.length;i++){
            System.out.print(array2[i]);
            if (i<array2.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0;i<array3.length;i++){
            System.out.print(array3[i]);
            if (i<array3.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3:");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[array.length-i-1]);
            if (i<array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0;i<array2.length;i++){
            System.out.print(array2[array2.length-1-i]);
            if (i<array2.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0;i<array3.length;i++) {
            System.out.print(array3[array3.length - 1 - i]);
            if (i < array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4:");
        for(int i = 0;i<array.length;i++){
            if(array[i]%2!=0){
                array[i]=array[i]+1;
            }
            System.out.print(array[i]);
            if (i<array.length-1){
                System.out.print(", ");
            }
        }
    }
}