Bài tập ngày 13/3
Bài 1:  — Nhận diện đa hình qua kế thừa
Cho chương trình sau:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}

Yêu cầu
	1.	Cho biết kết quả in ra.
	2.	Giải thích vì sao a1 là kiểu Animal nhưng vẫn gọi Dog barks.
	3.	Chỉ ra đâu là kế thừa, đâu là overriding, đâu là đa hình.

1️⃣ Kết quả chương trình in ra
Chương trình sẽ in:
Dog barks
Cat meows
2️⃣ a1 tuy có kiểu là Animal, nhưng đối tượng thật mà nó trỏ tới là Dog.
Animal a1 = new Dog();
Nghĩa là:
a1 → đối tượng Dog
Khi gọi:
a1.sound();
Java sẽ xem đối tượng thật là gì. Vì a1 đang trỏ tới Dog, nên Java gọi:
Dog.sound()
→ nên chương trình in:
Dog barks
3️⃣ Chỉ ra kế thừa, overriding và đa hình
3.1 Kế thừa (Inheritance)
Là khi class con kế thừa class cha bằng extends.
class Dog extends Animal
class Cat extends Animal
Dog và Cat kế thừa thuộc tính và phương thức của Animal.

3.2 Overriding (Ghi đè phương thức)
Dog overriding phương thức sound() của lớp cha

@Override
void sound() {
    System.out.println("Dog barks");
}

Cat overriding phương thức sound() của lớp cha

@Override
void sound() {
    System.out.println("Cat meows");
}

3.3 Đa hình (Polymorphism)
Đa hình xảy ra ở dòng:
Animal a1 = new Dog();
Animal a2 = new Cat();

Một biến kiểu Animal nhưng có thể trỏ tới nhiều loại object khác nhau:

Animal a1 → Dog
Animal a2 → Cat

Và khi gọi:
a1.sound();
a2.sound();
Java sẽ gọi method tương ứng với object thực tế.
￼
Bài 2: 
 Phương thức nào được gọi
Cho chương trình:

class Person {
    void introduce() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    void introduce() {
        System.out.println("I am a student");
    }
}

class Teacher extends Person {
    @Override
    void introduce() {
        System.out.println("I am a teacher");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();
        Person p3 = new Person();

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}

Yêu cầu
	1.	Viết kết quả chương trình.
	2.	Giải thích tại sao 3 biến đều có kiểu Person nhưng kết quả khác nhau.
	3.	Nếu đổi Person p1 = new Student(); thành Student p1 = new Student(); thì bản chất đa hình có còn thể hiện rõ không?

1. Kết quả chương trình
Chương trình in ra:
I am a student
I am a teacher
I am a person

2. Vì sao 3 biến đều có kiểu Person nhưng kết quả khác nhau?
Vì tuy cả 3 biến đều khai báo kiểu Person, nhưng đối tượng thực sự mà mỗi biến trỏ tới lại khác nhau
Khi gọi:
p1.introduce();
p2.introduce();
p3.introduce();
Java sẽ nhìn đối tượng thật đang được trỏ tới để quyết định gọi phương thức nào:
	•	p1 trỏ tới Student → gọi Student.introduce()
	•	p2 trỏ tới Teacher → gọi Teacher.introduce()
	•	p3 trỏ tới Person → gọi Person.introduce()
Nên kết quả khác nhau.

3. Nếu đổi Person p1 = new Student(); thành Student p1 = new Student(); thì đa hình có còn thể hiện rõ không?
Vẫn chạy được, nhưng đa hình sẽ không còn thể hiện rõ bằng.
Vì khi viết:

Student p1 = new Student();

thì:
	•	biến là Student
	•	đối tượng cũng là Student
Hai bên giống nhau, nên nhìn vào là biết ngay sẽ gọi phương thức của Student.
Còn khi viết:

Person p1 = new Student();

thì mới thấy rõ ý tưởng đa hình:
	•	biến thuộc kiểu cha Person
	•	nhưng lại trỏ tới object con Student
Đây chính là chỗ thể hiện rõ nhất của đa hình: một biến kiểu cha có thể trỏ tới nhiều đối tượng con khác nhau.

Bài tập ngày 13/3
Bài 1:  — Nhận diện đa hình qua kế thừa
Cho chương trình sau:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}

Yêu cầu
	1.	Cho biết kết quả in ra.
	2.	Giải thích vì sao a1 là kiểu Animal nhưng vẫn gọi Dog barks.
	3.	Chỉ ra đâu là kế thừa, đâu là overriding, đâu là đa hình.

1️⃣ Kết quả chương trình in ra
Chương trình sẽ in:
Dog barks
Cat meows
2️⃣ a1 tuy có kiểu là Animal, nhưng đối tượng thật mà nó trỏ tới là Dog.
Animal a1 = new Dog();
Nghĩa là:
a1 → đối tượng Dog
Khi gọi:
a1.sound();
Java sẽ xem đối tượng thật là gì. Vì a1 đang trỏ tới Dog, nên Java gọi:
Dog.sound()
→ nên chương trình in:
Dog barks
3️⃣ Chỉ ra kế thừa, overriding và đa hình
3.1 Kế thừa (Inheritance)
Là khi class con kế thừa class cha bằng extends.
class Dog extends Animal
class Cat extends Animal
Dog và Cat kế thừa thuộc tính và phương thức của Animal.

3.2 Overriding (Ghi đè phương thức)
Dog overriding phương thức sound() của lớp cha

@Override
void sound() {
    System.out.println("Dog barks");
}

Cat overriding phương thức sound() của lớp cha

@Override
void sound() {
    System.out.println("Cat meows");
}

3.3 Đa hình (Polymorphism)
Đa hình xảy ra ở dòng:
Animal a1 = new Dog();
Animal a2 = new Cat();

Một biến kiểu Animal nhưng có thể trỏ tới nhiều loại object khác nhau:

Animal a1 → Dog
Animal a2 → Cat

Và khi gọi:
a1.sound();
a2.sound();
Java sẽ gọi method tương ứng với object thực tế.
￼
Bài 3:
 Bài tập viết chương trình cơ bản
Đề bài
Viết chương trình quản lý phương tiện giao thông:
	•	Lớp cha Vehicle
	•	phương thức move() in ra: "Vehicle is moving"
	•	Lớp con Car
	•	override move() in ra: "Car is moving on the road"
	•	Lớp con Boat
	•	override move() in ra: "Boat is moving on the water"
	•	Trong main:
	•	tạo 3 đối tượng:

Vehicle v1 = new Vehicle();
Vehicle v2 = new Car();
Vehicle v3 = new Boat();

	•	gọi move() cho từng đối tượng
Yêu cầu
	1.	Tự viết toàn bộ code.
	2.	Ghi kết quả chương trình.
	3.	Giải thích dòng nào thể hiện đa hình rõ nhất.

	0.	Share link tiêu đề bài 3 ở zalo
	0.	Chương trình in ra:
Vehicle is moving
Car is moving on the road
Boat is moving on the water
	0.	
Hai dòng này thể hiện đa hình rõ nhất:

Vehicle v2 = new Car();
Vehicle v3 = new Boat();

Vì:
	•	biến có kiểu Vehicle (lớp cha)
	•	nhưng lại trỏ tới object của lớp con

Vehicle v2 → Car object
Vehicle v3 → Boat object

Sau đó khi gọi:

v2.move();
v3.move();

Java sẽ gọi method của đúng object.

Car.move()
Boat.move()

→ 1 biến kiểu cha có thể trỏ tới nhiều object lớp con khác nhau
Bài 4: 
 Bài rất cốt lõi: mảng đối tượng cha
Cho chương trình:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Bird sings");
    }
}

Yêu cầu
	1.	Tạo mảng:

Animal[] animals = new Animal[3];

	1.	Gán lần lượt:

animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Bird();

	1.	Dùng vòng lặp gọi sound() cho từng phần tử.
	2.	Ghi kết quả.

Đã share link code ở zalo tiêu đề bài 4
Chương trình in ra:

Dog barks
Cat meows
Bird sings
Bài 5: 
Câu hỏi lý thuyết bám code
Cho đoạn mã:

class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

Yêu cầu
Trả lời ngắn các câu:
	1.	A obj = new B(); có hợp lệ không?
	2.	Đây là upcasting hay downcasting?
	3.	Khi gọi obj.show();, Java dựa vào kiểu của biến obj hay kiểu của đối tượng new B() để chọn phương thức?
	4.	Nếu bỏ @Override thì chương trình có chạy được không?

1️⃣ A obj = new B(); có hợp lệ không?
✅ Có, hợp lệ.
Vì B kế thừa từ A.

class B extends A

Do đó object của lớp con (B) có thể gán cho biến kiểu lớp cha (A).

2️⃣ Đây là upcasting hay downcasting?
Đây là upcasting.

A obj = new B();

	•	B → lớp con
	•	A → lớp cha
Gán con → cha gọi là upcasting.

3️⃣ Khi gọi obj.show(); Java dựa vào cái gì để chọn phương thức?
Java dựa vào kiểu của đối tượng thật.
Trong chương trình:

A obj = new B();

	•	kiểu biến → A
	•	object thật → B
Khi gọi:

obj.show();

Java sẽ gọi:

B.show()

nên chương trình in:

B

Đây là đa hình (runtime polymorphism).

4️⃣ Nếu bỏ @Override chương trình có chạy được không?
✅ Có, vẫn chạy bình thường.

class B extends A {
    void show() {
        System.out.println("B");
    }
}

@Override không bắt buộc.
Nó chỉ giúp:
	•	báo cho compiler biết đây là phương thức ghi đè
	•	nếu viết sai method (ví dụ sai tên) thì compiler sẽ báo lỗi.
Ví dụ sai:

void sho()   // viết sai tên

Nếu có @Override → compiler báo lỗi ngay.
Bài 6: 
Tìm lỗi trong đa hình dùng kế thừa
Cho chương trình:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("Dog barks");
    }
}

Yêu cầu
	1.	Chương trình có lỗi không?
	2.	Nếu có, lỗi nằm ở đâu?
	3.	Vì sao dùng @Override lại giúp phát hiện lỗi này ngay?
	4.	Sửa lại code cho đúng.

1️⃣ Chương trình có lỗi không?
❌ Có lỗi.

2️⃣ Lỗi nằm ở đâu?
Lỗi nằm ở phương thức trong class Dog:

void Sound()

Tên phương thức khác với phương thức của lớp cha:

void sound()

Java phân biệt chữ hoa và chữ thường.
Lớp	Method
Animal	sound()
Dog	Sound()
Vì vậy Dog không override được sound().

3️⃣ Vì sao @Override giúp phát hiện lỗi ngay?
Khi viết:

@Override
void Sound()

Java sẽ kiểm tra:
phương thức này có đang override phương thức của lớp cha không?
@Override giúp phát hiện ngay các lỗi như:
	•	sai tên method
	•	sai tham số
	•	method không tồn tại ở lớp cha
Nhưng trong Animal không có Sound(), chỉ có sound().
Vì vậy compiler báo lỗi ngay.
Nếu không có @Override, chương trình vẫn biên dịch nhưng Dog không thực sự override phương thức của Animal.

4️⃣ Sửa code cho đúng
Chỉ cần đổi Sound() thành sound().

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

1. Chương trình có lỗi không?

Có. Chương trình bị lỗi biên dịch.

2. Nếu lỗi, lỗi ở dòng nào?

Lỗi ở dòng:

a.run();

Vì biến a có kiểu Animal, mà trong class Animal không có phương thức run().

❓ Vì sao không gọi được a.run()?

Vì Java kiểm tra theo kiểu của biến, không phải object.

🧠 Hiểu bằng ví dụ đơn giản

Hãy tưởng tượng:

Animal = giấy phép cơ bản

Dog = phiên bản nâng cấp có thêm tính năng run()

Animal a = new Dog();

→ Bạn đang cầm giấy phép Animal

👉 Nên bạn chỉ được dùng những gì Animal có

📌 Animal có gì?
void sound()

👉 nên gọi được:

a.sound();   // OK
❌ Animal KHÔNG có gì?
void run()

👉 nên:

a.run();     // LỖI
🧠 Java làm 2 bước (rất quan trọng)
✅ Bước 1: Kiểm tra có được gọi không (compile time)

Java nhìn vào kiểu biến:

Animal a

Nó hỏi:

“Trong Animal có run() không?”

👉 Không có → chặn luôn, không cho chạy

⛔ Lỗi xảy ra trước khi chạy

✅ Bước 2: Nếu hợp lệ → mới quyết định gọi bản nào (runtime)

Chỉ khi method được phép gọi (tức là có trong Animal) thì Java mới xét:

“Object thật là gì?”

Ví dụ:

a.sound(); // OK vì Animal có sound()

→ lúc này mới dùng Dog.sound()

🔥 Áp vào run()
a.run();

Bước 1: Animal có run() không? → ❌ Không

👉 Java dừng luôn → không bao giờ tới bước runtime

🎯 Ví dụ dễ hiểu

Giống như:

Bạn có thẻ sinh viên (Animal)

Nhưng thực tế bạn là VIP (Dog)

👉 Bạn chỉ được dùng quyền của thẻ sinh viên

Thư viện → OK

Phòng VIP → ❌ không vào được

Dù bạn “thực chất là VIP”, nhưng giấy tờ không cho phép

✅ Muốn gọi run() thì làm sao?

Phải “nâng quyền”:

((Dog) a).run();

👉 Lúc này Java hiểu:

“À, đây là Dog thật” → cho phép gọi run()

4. Sửa lại theo 2 cách
Cách 1: không dùng ép kiểu

Đổi kiểu biến thành Dog:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog runs");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
        a.run();
    }
}
Kết quả:
Dog barks
Dog runs

Cách này chạy được vì biến a bây giờ là kiểu Dog, nên gọi được cả sound() và run().

Cách 2: dùng ép kiểu xuống

Giữ nguyên upcasting:

Animal a = new Dog();

Sau đó ép kiểu xuống Dog để gọi run():

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog runs");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        ((Dog) a).run();
    }
}
Kết quả:
Dog barks
Dog runs

Bài 8:
Câu khó hơn: gọi phương thức qua hàm
Cho chương trình:

class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager manages team");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

public class Main {
    static void doWork(Employee e) {
        e.work();
    }

    public static void main(String[] args) {
        doWork(new Employee());
        doWork(new Manager());
        doWork(new Developer());
    }
}

Yêu cầu
	1.	Ghi kết quả chương trình.
	2.	Giải thích vì sao cùng là tham số Employee e mà kết quả khác nhau.
	3.	Đây là ví dụ rất chuẩn của đa hình ở chỗ nào 

1. Kết quả chương trình
Chương trình in ra:

Employee works
Manager manages team
Developer writes code


2. Vì sao cùng là tham số Employee e mà kết quả khác nhau?
Hàm doWork nhận tham số là biến e kiểu Employee.
Khi gọi hàm, ta lần lượt truyền vào các đối tượng:
	•	new Employee()
	•	new Manager()
	•	new Developer()
Mặc dù e có kiểu là Employee, nhưng mỗi lần gọi hàm, e sẽ trỏ tới đối tượng thực tế khác nhau.
Trong hàm:

e.work();

Java sẽ gọi phương thức work() tương ứng với đối tượng mà e đang trỏ tới, nên kết quả in ra sẽ khác nhau.
3. Đây là ví dụ rất chuẩn của đa hình ở chỗ nào?
Ví dụ này thể hiện đa hình rất rõ ở 2 chỗ:
Chỗ 1: tham số hàm kiểu cha

static void doWork(Employee e)

Hàm chỉ nhận 1 kiểu chung là Employee, nhưng lại có thể nhận:
	•	Employee
	•	Manager
	•	Developer
Đây chính là ý tưởng của đa hình:
một kiểu cha có thể đại diện cho nhiều đối tượng con khác nhau

Chỗ 2: dòng gọi phương thức trong hàm

e.work();

Cùng một câu lệnh e.work(); nhưng kết quả thay đổi tùy theo object thật được truyền vào.
Đây là chỗ thể hiện đa hình chuẩn nhất.