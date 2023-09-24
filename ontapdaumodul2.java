package ontapdaumodul2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ontapdaumodul2 {
    //    public static void main(String[] args) {
//        Scanner songuyen = new Scanner(System.in);
//        System.out.println("nhập số bất kỳ");
//        int number = songuyen.nextInt();
//
//        if (number < 2) {
//            System.out.println("không phải số nguyên tố");
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i < number) {
//                if (number % 2 == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check) {
//                System.out.println("là số nguyên tố");
//            } else {
//                System.out.println(" không phải số nguyên tố");
//            }
//        }
//    }
//bài 1:Nhập vào 1 số, kiểm tra xem số đó là chẵn hay lẻ
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập một số bất kỳ");
//        int a = number.nextInt();
//
//        if (a % 2 == 0 ){
//            System.out.println(a + "là số chẵn");
//        }else {
//            System.out.println(a + "là số lẻ");
//        }
//    }

    //bài 2 :Nhập vào a, b. In ra các số lẻ từ a -> b
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 20;
//        for (int i = a; i <= b; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i + "đều là số lẻ");
//            }
//        }
//    }

    //    bài 3:Nhập vào a, b. Tính tổng các số từ a -> b
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập số A");
//        int soA = number.nextInt();
//        System.out.println("nhập số B");
//        int soB = number.nextInt();
//
//        int tong = 0;
//        for (int i = soA; i <= soB ; i++) {
//            tong += i;
//        }
//        System.out.println(tong);
//    }

    //    bài 4:Nhập vào n. Tính S = 1.2 + 2.3 + 3.4 + ... + n(n+1).
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("nhập số bất kỳ");
//        int n = number.nextInt();
//        int S = 0;
//        for (int i = 1; i < n; i++) {
//            S += i * (i +1);
//        }
//        System.out.println(S);
//    }

    //    bài 5 :Tìm số lớn nhất trong 3 số
//    public static void main(String[] args) {
//        int a = 64;
//        int b = 45;
//        int c = 98;
//        if (a > b && a > c) {
//            System.out.println(a + " là số lớn nhất");
//        }if (b > c) {
//            System.out.println(b + " là số lớn nhất");
//        }
//        else {
//            System.out.println(c + " là số lớn nhất");
//        }
//    }

    //    bài 6:Tính lãi ngân hàng
//    public static void main(String[] args) {
//        Scanner lainganHang = new Scanner(System.in);
//        System.out.println("nhập số tiền đã vay");
//        double sotienVay = lainganHang.nextDouble();
//        int sotienLai;
//
//        if (sotienVay > 1000 && sotienVay <= 1000000) {
//            sotienLai = (int) ((sotienVay * 2) / 100);
//            System.out.println(sotienLai + "là số tiền lãi bạn phải trả");
//        }
//        if (sotienVay > 1000000 && sotienVay <= 10000000) ;
//        sotienLai = (int) ((sotienVay * 4) / 100);
//        System.out.println(sotienLai + "là số tiền lãi bạn phải trả");
//    }


    //    sửi bọt
//    public static void main(String[] args) {
//
//    }

//    public static void bubbleSoft() {
//        int[] number = new int[]{12, 3, 11, 4, 1, 9};
//        for (int i = 1; i < number.length; i++) {
//            for (int j = 0; j < number.length - i; j++) {
//                if (number[j] > number[j + 1]) {
//                    int max = number[j];
//                    number[j] = number[j + 1];
//                    number[j + 1] = max;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(number));
//    }


    //    sắp xếp
//    public static void selectionSoft() {
//        int[] number = new int[]{3,12,21,2,4,7};
//        for (int i = 0; i < number.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < number.length ; j++) {
//                if (number[j] < number[minIndex]){
//                    minIndex = j;
//                }
//            }
//            int temp = number[i];
//            number[i] = number[minIndex];
//            number[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(number));
//    }


    //    chèn
//    public static void insertSoft() {
//        int[] number = new int[]{12, 1, 9, 8, 54, 22, 11};
//        for (int i = 1; i < number.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (number[j] < number[j - 1]) {
//                    int temp = number[j];
//                    number[j] = number[j - 1];
//                    number[j - 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(number));
//    }

    //    Bài 6: In ra các phần tử chẵn trong mảng
//    public static void main(String[] args) {
//        int[] number = new int[]{1, 2, 4, 6, 8, 5, 12, 22,};
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] % 2 == 0) {
//                System.out.println(number[i] + "là số chẵn");
//            }
//        }
//
//    }


    //    Bài 7: Nhập vào 3 cạnh tam giác, cho biết loại của tam giác đó

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập cạnh thứ 1:");
//        int a = input.nextInt();
//        System.out.println("nhập cạnh thứ 2:");
//        int b = input.nextInt();
//        System.out.println("nhập cạnh thứ 3:");
//        int c = input.nextInt();
//        if (((a + b) == c) || ((a + c) == b) || ((b + c) == a)) {
//            System.out.println("không phải là tam giác");
//        } else {
//            if (a == b && b == c) {
//                System.out.println("tam giác đều");
//            }
//            if (a == b || b == c || c == a) {
//                System.out.println("tam giác cân");
//            }
//            if (a * a == (b + c) * (b + c) || b * b == (a + c) * (a + c) || c * c == (b + a) * (b + a)) {
//                System.out.println("tam giác vuông");
//            }
//            if (a != b && a != c && b != c) {
//                System.out.println("tam giác thường");
//            }
//        }
//    }


//    Bài 8:"Nhập vào a, b. In từ a đến b:
//            - chia hết cho 3 in 'Fizz'
//            - chia hết cho 5 in 'Buzz'
//            - chia hết cho 3 và 5 in 'FizzBuzz'"

//    public static void main(String[] args) {
//        int[] number = new int[]{3,5,8,9,10,12,15,20};
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] % 3 == 0){
//                System.out.println(number[i] + "Fizz");
//            } else if (number[i] % 5 == 0) {
//                System.out.println(number[i] + "Buzz");
//            }if (number[i] % 3 == 0 && number[i] % 5 == 0){
//                System.out.println(number[i] + "FizzBuzz");
//            }
//
//        }
//    }


//    Bài 9: Nhập và a, b. In ra các số chính phương từ a đến b
//public static void main(String[] args) {
//    Scanner soBatky = new Scanner(System.in);
//    System.out.println("nhập số a");
//    int soA = soBatky.nextInt();
//    System.out.println("nhập số b");
//    int soB = soBatky.nextInt();
//
//    for (int i = soA; i < soB ; i++) {
//        int soChinhphuong = i * i;
//        System.out.println(soChinhphuong + " là số chính phương");
//    }


    //    Bài 10:- Nhập 2 số nguyên x và y. Viết chương trình tính tổng bình phương các số từ x đến y.
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập số X");
//        int soX = number.nextInt();
//        System.out.println("Nhập số Y");
//        int soY = number.nextInt();
//        int sum = 0;
//
//        for (int i = soX; i <= soY; i++) {
//            sum += (int) Math.pow(i,2);
//        }
//        System.out.println(sum);
//    }


    //    Bài 11: Tìm max
//    public static void main(String[] args) {
//        int[] number = new int[]{5, 2, 12, 4, 54, 6, 9, 33};
//        int max = 0;
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] > max) {
//                max = number[i];
//            }
//        }
//        System.out.println(max);
//    }


    //    bài 12:Tìm max thứ 2
//    public static void main(String[] args) {
//        int[] number = new int[]{5, 2, 12, 4, 54, 6, 9, 33};
//        Arrays.sort(number);
//        System.out.println(number[number.length - 2]);
//    }


//    bài 13:"- Cần có tổng 20000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng.
//    Lập chương trình để tìm ra tất cả các phương án có thể"

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int count = 0;
        for (a = 0; a < 20; a++) {
            for (b = 0; b < 10 ; b++) {
                for ( c = 0; c < 4 ; c++) {
                    if (a * 1000 + b * 2000 + c * 5000 == 20000){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}


