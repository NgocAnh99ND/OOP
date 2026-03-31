Bài 1: part2
Ép kiểu và phép chia
Yêu cầu
Viết chương trình khai báo:
	•	hai số nguyên a và b
	•	một số thực x
Thực hiện và in ra:
	1.	kết quả của a / b
	2.	kết quả của (double) a / b
	3.	giá trị của x sau khi ép về int
	4.	giá trị của một ký tự char khi chuyển sang int

public class Main {
    public static void main(String[] args) {

        int a = 7;
        int b = 2;
        double x = 8.9;
        char ch = 'A';

        // 1. chia số nguyên
        System.out.println("a / b = " + (a / b));

        // 2. chia có ép kiểu
        System.out.println("(double) a / b = " + ((double) a / b));

        // 3. ép double -> int
        System.out.println("x (double) = " + x);
        System.out.println("(int) x = " + (int) x);

        // 4. char -> int
        System.out.println("ch = " + ch);
        System.out.println("(int) ch = " + (int) ch);
    }
}