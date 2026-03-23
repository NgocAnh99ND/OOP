Bài 1: 
Biến static dùng chung
Viết lớp Student gồm:
	•	thuộc tính name
	•	thuộc tính static String school = "Hoang Long"
	•	constructor để gán name
	•	phương thức display() in ra tên và trường
Yêu cầu
	1.	Tạo 2 đối tượng Student.
	2.	Gọi display() cho cả 2.
	3.	Đổi giá trị school thành "Tran Phu".
	4.	Gọi lại display() cho cả 2.
	5.	Giải thích vì sao đổi một lần mà cả 2 đối tượng đều thay đổi.

✅ Bài 1 — Biến static dùng chung
🔹 Code hoàn chỉnh
class Student {

    String name;
    static String school = "Hoang Long";

    // Constructor
    Student(String name) {
        this.name = name;
    }

    // Method hiển thị
    void display() {
        System.out.println("Name: " + name + ", School: " + school);
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Tạo 2 đối tượng
        Student s1 = new Student("An");
        Student s2 = new Student("Binh");

        // 2. Gọi display()
        s1.display();
        s2.display();

        System.out.println("---- After change ----");

        // 3. Đổi giá trị school
        Student.school = "Tran Phu";

        // 4. Gọi lại display()
        s1.display();
        s2.display();
    }
}

🔹 Kết quả chạy

Name: An, School: Hoang Long
Name: Binh, School: Hoang Long
---- After change ----
Name: An, School: Tran Phu
Name: Binh, School: Tran Phu

❓ Vì sao đổi 1 lần mà cả 2 object đều thay đổi?
Vì school là biến static , nó không thuộc từng object mà thuộc class,  không tạo bản sao riêng,  nên đổi 1 lần → tất cả cùng thay đổi.

Bài 2:
 Phương thức static
Viết lớp Calculator có các phương thức static:
	•	add(int a, int b)
	•	subtract(int a, int b)
	•	multiply(int a, int b)
Yêu cầu
	1.	Gọi các phương thức này trong main.
	2.	Không tạo đối tượng Calculator.
	3.	Giải thích vì sao vẫn gọi được phương thức.

✅ Bài 2 — Phương thức static
🔹 Code hoàn chỉnh

class Calculator {

    // static methods
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1 & 2: Gọi trực tiếp, không tạo object
        System.out.println(Calculator.add(5, 3));
        System.out.println(Calculator.subtract(5, 3));
        System.out.println(Calculator.multiply(5, 3));
    }
}

🔹 Kết quả

8
2
15

❓ Vì sao KHÔNG cần tạo object vẫn gọi được?
Vì phương thức static thuộc về class, được load vào bộ nhớ khi class được nạp, nên có thể gọi trực tiếp qua tên class mà không cần tạo object

Bài 3:

Phân biệt static và non-static
Cho chương trình sau:

class Test {
    int x = 10;
    static int y = 20;

    void show1() {
        System.out.println(x);
        System.out.println(y);
    }

    static void show2() {
        System.out.println(x);
        System.out.println(y);
    }
}

Yêu cầu
	1.	Chương trình sai ở đâu?
	2.	Vì sao sai?
	3.	Sửa lại để chương trình chạy được.
❌ 1. Chương trình sai ở đâu?
👉 Sai ở dòng trong show2():

System.out.println(x); // ❌ lỗi

🧠 2. Vì sao sai?
🔥 Quy tắc cực quan trọng:
Method static KHÔNG truy cập trực tiếp được biến non-static

🎯 Giải thích dễ hiểu:
	•	x → thuộc object (non-static)
	•	y → thuộc class (static)

❗ Vấn đề:

static void show2()

👉 Method này không có object
➡️ Nhưng bạn lại muốn dùng:

x // cần object mới có

⛔ Java không biết lấy x của object nào ➡️ nên báo lỗi

✅ 3. Cách sửa
✔️ Cách 1 — Tạo object để truy cập x

class Test {
    int x = 10;
    static int y = 20;

    void show1() {
        System.out.println(x);
        System.out.println(y);
    }

    static void show2() {
        Test t = new Test(); // tạo object
        System.out.println(t.x); // truy cập qua object
        System.out.println(y);
    }
}

Bài 4:
 Đếm số đối tượng bằng static
Viết lớp Student có:
	•	thuộc tính name
	•	thuộc tính static int count = 0
	•	mỗi khi tạo một đối tượng mới thì count tăng lên 1
	•	phương thức displayCount() để in ra tổng số đối tượng đã tạo
Yêu cầu
	1.	Tạo 3 đối tượng.
	2.	In ra số lượng đối tượng.
	3.	Giải thích vì sao count phải là static.

✅ Bài 4 — Đếm số đối tượng bằng static
🔹 Code hoàn chỉnh

class Student {

    String name;
    static int count = 0; // biến dùng chung

    // Constructor
    Student(String name) {
        this.name = name;
        count++; // mỗi lần tạo object → tăng count
    }

    // Hiển thị số lượng object
    static void displayCount() {
        System.out.println("Total students: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Tạo 3 đối tượng
        Student s1 = new Student("An");
        Student s2 = new Student("Binh");
        Student s3 = new Student("Cuong");

        // 2. In số lượng
        Student.displayCount();
    }
}

🔹 Kết quả

Total students: 3

❓ Vì sao count phải là static?
👉 Vì:
Ta cần 1 biến dùng chung để đếm tất cả object

👉 Vì:
Ta cần 1 biến dùng chung để đếm tất cả object

🎯 Nếu KHÔNG dùng static thì sao?

int count = 0; // non-static

👉 Mỗi object sẽ có 1 biến count riêng
￼
⛔ Không thể biết tổng là bao nhiêu

✅ Khi dùng static
👉 Chỉ có 1 biến duy nhất trong class
￼
➡️ Đếm được toàn bộ object

Bài 5:
main là static vì sao?
Cho đoạn mã:

class Demo {
    void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        show();
    }
}

Yêu cầu
	1.	Đoạn mã có lỗi không?
	2.	Nếu có, lỗi ở đâu?
	3.	Sửa lại theo 2 cách:
	•	cách 1: tạo đối tượng
	•	cách 2: đổi show() thành phù hợp

❌ 1. Đoạn mã có lỗi không?
👉 CÓ lỗi

❌ 2. Lỗi ở đâu?
👉 Lỗi ở dòng:

show(); // ❌

🧠 3. Vì sao sai?
	•	main là static
	•	show() là non-static

🔥 Quy tắc:
Method static không gọi trực tiếp được method non-static
✅ 3. Cách sửa

✔️ Cách 1: Tạo object

class Demo {
    void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo d = new Demo(); // tạo object
        d.show();            // gọi qua object
    }
}

✔️ Cách 2: Đổi show() thành static

class Demo {
    static void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        show(); // gọi trực tiếp
    }
}

Bài 6: 
 Biến final
Viết lớp Person có:
	•	final String country = "Vietnam"
	•	thuộc tính name
Yêu cầu
	1.	Tạo đối tượng và in ra country.
	2.	Thử gán lại country = "Japan".
	3.	Quan sát lỗi và giải thích.

✅ Bài 6 — Biến final
🔹 Code

class Person {

    final String country = "Vietnam"; // hằng số
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Tạo object và in country
        Person p = new Person("An");
        System.out.println(p.country);

        // 2. Thử gán lại
        p.country = "Japan"; // ❌ lỗi
    }
}

🔥 Kết quả

error: cannot assign a value to final variable country

🧠 Giải thích 
Vì biến final chỉ được gán giá trị một lần, nên không thể gán lại giá trị mới.

Bài 7: 
Gán final trong constructor
Viết lớp Student có:
	•	final int id
	•	String name
Constructor dùng để gán cả id và name.
Yêu cầu
	1.	Tạo 2 đối tượng với id khác nhau.
	2.	In thông tin ra màn hình.
	3.	Giải thích vì sao id là final nhưng mỗi đối tượng vẫn có thể khác nhau.

✅ Bài 7 — Gán final trong constructor
🔹 Code hoàn chỉnh

class Student {

    final int id; // chỉ gán 1 lần
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;     // gán tại đây
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Tạo 2 object
        Student s1 = new Student(1, "An");
        Student s2 = new Student(2, "Binh");

        // 2. In ra
        s1.display();
        s2.display();
    }
}

🔹 Kết quả

ID: 1, Name: An
ID: 2, Name: Binh

Vì sao id là final mà mỗi object vẫn khác nhau?
👉 Vì:
final chỉ có nghĩa là mỗi object không được đổi giá trị sau khi gán

🔥 Hiểu đúng:
	•	final ❌ không có nghĩa là “mọi object giống nhau”
	•	final ✔️ nghĩa là “mỗi object chỉ được gán 1 lần”

💡 Hình dung dễ hiểu
👤 Mỗi Student là 1 người
	•	id = số CCCD
👉 Mỗi người:
	•	Có số khác nhau ✅
	•	Nhưng không được đổi ❌

    Bài 8:
Final method
Cho chương trình:

class Animal {
    final void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats");
    }
}

Yêu cầu
	1.	Chương trình có lỗi không?
	2.	Nếu có, lỗi gì?
	3.	Giải thích ý nghĩa của final trong phương thức.
	4.	Sửa code để chương trình đúng.

❌ 1. Chương trình có lỗi không?
👉 CÓ lỗi

❌ 2. Lỗi gì?
👉 Lỗi ở class Dog:

void eat() { // ❌ lỗi compile

🔥 Lỗi cụ thể:
Cannot override the final method from Animal

🧠 3. Vì sao sai?
🔥 Quy tắc:
Method final không được phép override

🎯 Trong code:

class Animal {
    final void eat() { ... }
}

👉 Nghĩa là:
“Method này KHÔNG cho lớp con thay đổi”
🎯 3. Ý nghĩa của final trong method
Ngăn không cho lớp con override phương thức để đảm bảo hành vi không bị thay đổi.

✅ 4. Cách sửa

✔️ Cách 1: Xóa override ở Dog

class Animal {
    final void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    // không override
}

✔️ Cách 2: Bỏ final ở Animal

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eats");
    }
}

Bài 9:
 Final class
Cho chương trình:

final class A {
}

class B extends A {
}

Yêu cầu
	1.	Đoạn mã có lỗi không?
	2.	Vì sao?
	3.	Nêu ý nghĩa của final class.

❌ 1. Đoạn mã có lỗi không?
👉 CÓ lỗi

❌ 2. Vì sao?
👉 Lỗi ở dòng:

class B extends A { // ❌
}

🔥 Lỗi cụ thể:

cannot inherit from final A

🧠 Giải thích

final class A {
}

👉 final class nghĩa là:
Không cho bất kỳ class nào kế thừa

👉 Nhưng bạn lại viết:

class B extends A

⛔ Vi phạm → lỗi compile

🎯 3. Ý nghĩa của final class
Ngăn không cho class khác kế thừa để bảo vệ thiết kế và đảm bảo không bị thay đổi hành vi.

🔥 Khi nào dùng?
	•	Class đã hoàn chỉnh, không muốn bị sửa
	•	Class liên quan bảo mật
	•	Class tiện ích (utility)
💡 Ví dụ thực tế

String

👉 String là final class
➡️ Không ai được kế thừa để tránh phá vỡ logic

Bài 10: 
Phân biệt final với static
Cho lớp:

class Test {
    static int a = 10;
    final int b = 20;
}

Yêu cầu
	1.	Biến nào là biến dùng chung cho mọi đối tượng?
	2.	Biến nào không đổi giá trị?
	3.	Nếu tạo 2 đối tượng Test, thì a và b được hiểu khác nhau thế nào?
	4.	Giải thích rõ sự khác nhau giữa static và final.

🎯 1. Biến nào dùng chung cho mọi object?
👉 a (static)
✔️ Vì:
static thuộc về class → chỉ có 1 bản duy nhất

🎯 2. Biến nào không đổi giá trị?
👉 b (final)
✔️ Vì:
final chỉ được gán 1 lần → không thể thay đổi

🎯 3. Nếu tạo 2 object thì a và b khác nhau thế nào?

Test t1 = new Test();
Test t2 = new Test();

🔥 Biến a (static)
👉 Chỉ có 1 bản duy nhất

t1.a = 10
t2.a = 10

👉 Nếu đổi:

Test.a = 50;

➡️ Cả t1 và t2 đều thấy 50

🔥 Biến b (final)
👉 Mỗi object có bản riêng

t1.b = 20
t2.b = 20

👉 Nhưng:
⛔ Không đổi được

📊 So sánh trực quan
￼
a dùng chung cho mọi object, còn b là riêng từng object nhưng không thể thay đổi.

🎯 4. Giải thích rõ sự khác nhau
🔥 Bản chất khác nhau hoàn toàn
✅ static = “dùng chung”
	•	Thuộc class
	•	1 bản duy nhất
	•	Mọi object dùng chung
	•	Có thể thay đổi

✅ final = “không đổi”
	•	Gán 1 lần
	•	Không được thay đổi
	•	Có thể là static hoặc non-static

Bài 11:
Hằng số static final
Viết lớp MathConst có:
	•	static final double PI = 3.14159
Yêu cầu
	1.	In giá trị của PI trong main.
	2.	Thử sửa PI = 3.14.
	3.	Giải thích vì sao PI thường được khai báo là static final.

✅ Bài 11 — Hằng số static final
🔹 Code

class MathConst {

    static final double PI = 3.14159; // hằng số
}

public class Main {
    public static void main(String[] args) {

        // 1. In giá trị PI
        System.out.println(MathConst.PI);

        // 2. Thử sửa
        MathConst.PI = 3.14; // ❌ lỗi
    }
}

🔥 Kết quả

error: cannot assign a value to final variable PI


🎯 1. In giá trị
👉 In bằng:

MathConst.PI

✔️ Không cần tạo object vì là static

❌ 2. Thử sửa

MathConst.PI = 3.14;

👉 Lỗi vì final

🧠 3. Vì sao PI thường là static final?
🔥 Vì nó có 2 đặc điểm:
✔️ 1. Là giá trị dùng chung → static
	•	PI giống nhau cho mọi nơi
	•	Không cần mỗi object 1 bản

✔️ 2. Không được thay đổi → final
	•	PI là hằng số toán học
	•	Không thể sửa

💡 Ví dụ đời thường
👉 PI giống như:
“Số ngày trong tuần = 7”
	•	Ai cũng dùng chung → static
	•	Không đổi → final

📊 Nếu không dùng static final thì sao?
❌ Không static

double PI = 3.14159;

👉 Mỗi object có 1 bản → lãng phí

❌ Không final

static double PI = 3.14159;

👉 Có thể bị sửa → nguy hiểm

🎯 Kết luận chuẩn
static final dùng để khai báo hằng số vì:
	•	static giúp dùng chung cho toàn bộ chương trình
	•	final đảm bảo giá trị không bị thay đổi

Bài 12: 
Viết chương trình tính diện tích hình tròn
Viết lớp Circle có:
	•	thuộc tính radius
	•	hằng số static final double PI = 3.14159
	•	constructor để gán radius
	•	phương thức area() tính diện tích
Yêu cầu
	1.	Tạo 2 đối tượng Circle.
	2.	In diện tích từng hình tròn.
	3.	Giải thích vì sao PI nên là static final, còn radius thì không.

Tính diện tích hình tròn
🔹 Code hoàn chỉnh

class Circle {

    double radius; // mỗi object có riêng
    static final double PI = 3.14159; // hằng số dùng chung

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    double area() {
        return PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Tạo 2 object
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);

        // 2. In diện tích
        System.out.println("Area c1: " + c1.area());
        System.out.println("Area c2: " + c2.area());
    }
}


🔹 Kết quả

Area c1: 12.56636
Area c2: 28.27431

Bài 13:
 Bộ đếm đối tượng + mã không đổi
Viết lớp Student có:
	•	final int id
	•	String name
	•	static int nextId = 1
Mỗi khi tạo đối tượng:
	•	id = nextId
	•	sau đó tăng nextId
Yêu cầu
	1.	Tạo 3 đối tượng.
	2.	In ra id và name của từng đối tượng.
	3.	Giải thích vai trò của final và static trong bài này.

✅ Code hoàn chỉnh

class Student {

    final int id;      // không đổi sau khi gán
    String name;
    static int nextId = 1; // dùng chung để đếm

    // Constructor
    Student(String name) {
        this.id = nextId; // gán id
        nextId++;         // tăng cho object tiếp theo
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Tạo 3 object
        Student s1 = new Student("An");
        Student s2 = new Student("Binh");
        Student s3 = new Student("Cuong");

        // 2. In ra
        s1.display();
        s2.display();
        s3.display();
    }
}


🔹 Kết quả

ID: 1, Name: An
ID: 2, Name: Binh
ID: 3, Name: Cuong


🧠 3. Giải thích bản chất

🎯 Vai trò của static (nextId)
👉 nextId là biến dùng chung cho tất cả object
	•	Ban đầu: nextId = 1
	•	Tạo s1 → id = 1 → nextId = 2
	•	Tạo s2 → id = 2 → nextId = 3
	•	Tạo s3 → id = 3 → nextId = 4
👉 Nếu không static:
⛔ Mỗi object sẽ có nextId = 1 → tất cả id đều = 1 (sai)

🎯 Vai trò của final (id)
👉 id:
Chỉ được gán 1 lần trong constructor Sau đó không thể thay đổi

💡 Hiểu đơn giản
	•	nextId = máy phát số thứ tự 🎟️
	•	id = số đã cấp cho mỗi người 👤
👉 Máy phát số là dùng chung (static) 👉 Số của mỗi người là không đổi (final)

Bài 14:
 Tìm tất cả lỗi
Cho chương trình:

class Test {
    final int x;
    static int y = 10;

    static void show() {
        System.out.println(x);
        System.out.println(y);
    }
}

Yêu cầu
	1.	Tìm tất cả lỗi.
	2.	Giải thích từng lỗi.
	3.	Sửa lại để chạy được.

1. Tìm tất cả lỗi
Chương trình có 2 lỗi chính:
Lỗi 1: final int x; chưa được gán giá trị

final int x;

👉 x là biến final nhưng chưa được gán ngay, cũng không được gán trong constructor hay block khởi tạo.
Lỗi 2: method static show() truy cập trực tiếp biến x

System.out.println(x);

👉 x là biến non-static 👉 show() là method static
⛔ static không truy cập trực tiếp được non-static

2. Giải thích từng lỗi
❌ Lỗi 1: final int x chưa được gán
Vì sao sai?
final nghĩa là:
biến đó phải được gán đúng 1 lần trước khi object được dùng.
Ở đây bạn chỉ khai báo:

final int x;

nhưng không gán:
	•	không gán ngay tại chỗ
	•	không có constructor để gán
	•	không có block khởi tạo để gán
➡️ Java sẽ báo lỗi vì có thể tạo object mà x vẫn chưa có giá trị.
❌ Lỗi 2: static show() dùng trực tiếp x

static void show() {
    System.out.println(x); // lỗi
}

Vì sao sai?
	•	show() là của class
	•	x là của từng object
Nên Java sẽ hỏi:
“Lấy x của object nào?”
Không có object cụ thể nào ở đây cả → lỗi
Cách sửa đúng bản chất: gán x trong constructor và tạo object trong show()

class Test {
    final int x;
    static int y = 10;

    Test(int x) {
        this.x = x;
    }
    static void show() {
        Test t = new Test(5);
        System.out.println(t.x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        show();
    }
}

Kết quả

5
10

Bài 15:
Static method và this
Cho chương trình:

class Student {
    String name;

    static void display() {
        System.out.println(this.name);
    }
}

Yêu cầu
	1.	Chương trình sai ở đâu?
	2.	Vì sao this không dùng được trong phương thức static?
	3.	Sửa lại theo cách đúng.

❌ 1. Chương trình sai ở đâu?
👉 Sai ở dòng:

System.out.println(this.name); // ❌


❌ 2. Vì sao this không dùng được trong static?
🔥 Bản chất của this
this = đại diện cho object hiện tại

🔥 Nhưng method static thì sao?

static void display()

👉 Method static:
	•	❌ Không gắn với object
	•	❌ Không có “this”

💥 Mâu thuẫn xảy ra
Bạn đang viết:

this.name

👉 Nghĩa là:
“Lấy name của object hiện tại”

👉 Nhưng:
⛔ Không có object nào cả
➡️ Java không biết “this” là ai → lỗi

✅ 3. Cách sửa

✔️ Cách 1: Bỏ static

class Student {
    String name;

    void display() {
        System.out.println(this.name);
    }
}

👉 Gọi:

Student s = new Student();
s.name = "An";
s.display();

✔️ Cách 2: Giữ static → truyền object vào

class Student {
    String name;

    static void display(Student s) {
        System.out.println(s.name);
    }
}

👉 Gọi:

Student s = new Student();
s.name = "An";
Student.display(s);

Bài 16:
Final chưa được gán
Cho chương trình:

class Test {
    final int x;

    void show() {
        System.out.println(x);
    }
}

Yêu cầu
	1.	Chương trình có lỗi không?
	2.	Nếu có, vì sao?
	3.	Sửa lại theo 2 cách:
	•	gán ngay khi khai báo
	•	gán trong constructor
❌ 1. Chương trình có lỗi không?
👉 CÓ lỗi

❌ 2. Vì sao?

final int x;

👉 x là biến final nhưng:
	•	❌ Không gán khi khai báo
	•	❌ Không gán trong constructor
	•	❌ Không có block khởi tạo
➡️ Java không đảm bảo x có giá trị khi dùng

🔥 Lỗi sẽ là:

variable x might not have been initialized
Cách sửa

✔️ Cách 1: Gán ngay khi khai báo

class Test {
    final int x = 10;

    void show() {
        System.out.println(x);
    }
}

👉 x có giá trị ngay từ đầu → hợp lệ

✔️ Cách 2: Gán trong constructor

class Test {
    final int x;

    Test(int x) {
        this.x = x;
    }

    void show() {
        System.out.println(x);
    }
}

👉 Khi tạo object:

Test t = new Test(5);
t.show();

🎯 So sánh 2 cách
Cách	Khi nào dùng
Gán ngay	giá trị cố định
Constructor	mỗi object khác nhau

Bài 17:
 Static có phải là hằng không?
Cho đoạn mã:

class Demo {
    static int x = 5;
}

Yêu cầu
	1.	Có thể đổi Demo.x = 10; không?
	2.	Nếu được, vậy static có nghĩa là gì?
	3.	Khi nào một biến mới thực sự là hằng?

🎯 1. Có thể đổi Demo.x = 10 không?
👉 ✔️ CÓ thể

Demo.x = 10; // hợp lệ


🔥 Vì sao?
👉 Vì x chỉ là static, chưa phải final
➡️ Nên vẫn thay đổi được

🎯 2. Vậy static có nghĩa là gì?
static = biến dùng chung cho tất cả object

🧠 Hiểu đơn giản:
	•	Thuộc về class
	•	Chỉ có 1 bản duy nhất
	•	Mọi object dùng chung

💡 Ví dụ đời thường
👉 x giống như:
“Tên trường”
	•	Tất cả học sinh dùng chung
	•	Nhưng có thể đổi tên trường

🎯 3. Khi nào biến thực sự là hằng?
👉 Khi có final

✔️ Ví dụ:

static final int x = 5;

👉 Lúc này:
	•	static → dùng chung
	•	final → không đổi
➡️ hằng số

❌ Nếu chỉ static

static int x = 5;

👉 Không phải hằng → đổi được

Bài 18:
Final có phải là dùng chung không?
Cho đoạn mã:

class Demo {
    final int x = 10;
}

Yêu cầu
	1.	x có phải biến dùng chung cho mọi đối tượng không?
	2.	Nếu tạo 2 đối tượng, mỗi đối tượng có x thế nào?
	3.	Muốn vừa dùng chung vừa không đổi thì phải khai báo ra sao?

🎯 1. x có phải biến dùng chung không?
👉 ❌ KHÔNG

final int x = 10;

	•	x là non-static
	•	⇒ thuộc về từng object

🎯 2. Nếu tạo 2 object thì sao?

Demo d1 = new Demo();
Demo d2 = new Demo();

🧠 Bộ nhớ sẽ như sau:
Object	x
d1	10
d2	10
👉 Nhìn giống nhau nhưng:
❗ là 2 bản khác nhau

🔥 Quan trọng
	•	d1.x và d2.x không phải cùng 1 biến
	•	chỉ là trùng giá trị

💡 Ví dụ đời thường
👉 x giống như:
“ngày sinh”
	•	Mỗi người có 1 ngày sinh riêng
	•	Có thể trùng nhau
	•	Nhưng không phải dùng chung

🎯 3. Muốn vừa dùng chung vừa không đổi?
👉 Phải dùng:

static final int x = 10;


✔️ Ý nghĩa:
	•	static → dùng chung
	•	final → không đổi
➡️ hằng số dùng chung

Bài 19:
Static method có override không?
Cho chương trình:

class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}

Yêu cầu
	1.	Đây có phải overriding không?
	2.	Nếu không, đây là gì?
	3.	Tìm kết quả của:

A obj = new B();
obj.show();

	4.	Giải thích vì sao kết quả đó xảy ra.

🎯 1. Đây có phải overriding không?
👉 ❌ KHÔNG

🎯 2. Nếu không thì đây là gì?
👉 Đây là:
method hiding (che khuất phương thức)

🔥 Vì sao?
	•	show() là static
	•	static thuộc về class, không phải object
➡️ Không có đa hình runtime ➡️ Không override được

🎯 3. Kết quả của:

A obj = new B();
obj.show();

👉 Kết quả:

A

🧠 4. Vì sao ra kết quả đó?
🔥 Bản chất quan trọng
static method được quyết định tại compile-time, dựa vào kiểu biến
🔍 Phân tích từng bước

A obj = new B();

👉 Biến obj có kiểu A

obj.show();

👉 Java nhìn vào kiểu biến (A)
➡️ Gọi:

A.show();

👉 Không quan tâm object thực là B