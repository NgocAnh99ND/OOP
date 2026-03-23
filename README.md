Bài 1:
Nhận diện đa hình qua interface
Cho các lớp sau:

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}

Yêu cầu
	1.	Tạo biến kiểu Flyable trỏ tới Bird và Airplane.
	2.	Gọi fly() cho cả hai.
	3.	Ghi kết quả chương trình.
	4.	Giải thích tại sao cùng kiểu biến Flyable nhưng phương thức gọi khác nhau.

✅ 1. Tạo biến kiểu Flyable trỏ tới Bird và Ariplane, Gọi fly() cho cả hai

public class Main {
    public static void main(String[] args) {

        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();

        f1.fly();
        f2.fly();
    }
}

✅ 3. Kết quả chương trình

Bird is flying
Airplane is flying

✅ 4. Giải thích bản chất 
✔️ Bước 1: Compile-time (kiểm tra quyền gọi)
Java nhìn vào kiểu biến:

Flyable f1;

Nó hỏi:
"Trong Flyable có method fly() không?"
👉 Có → cho phép gọi

✔️ Bước 2: Runtime (quyết định gọi bản nào)
Java không nhìn vào kiểu biến nữa, mà nhìn vào object thật sự:

f1 = new Bird();      // object là Bird
f2 = new Airplane();  // object là Airplane

👉 Khi chạy:
Biến	Object thực	Method được gọi
f1	Bird	Bird.fly()
f2	Airplane	Airplane.fly()

Bài 2: 
Viết chương trình cơ bản
Đề bài
Viết interface Playable với phương thức:

void play();

	•	Lớp Guitar implement Playable và override play() in ra "Guitar is playing".
	•	Lớp Piano implement Playable và override play() in ra "Piano is playing".
Trong main:
	•	Tạo mảng Playable[] instruments gồm 1 Guitar và 1 Piano.
	•	Duyệt mảng gọi play().
Yêu cầu
	1.	Viết toàn bộ code.
	2.	Ghi kết quả.
	3.	Đây là ví dụ rõ ràng của đa hình runtime qua interface.

✅ 1. Toàn bộ code

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}

public class Main {
    public static void main(String[] args) {

        Playable[] instruments = new Playable[2];

        instruments[0] = new Guitar();
        instruments[1] = new Piano();

        for (Playable p : instruments) {
            p.play();
        }
    }
}

✅ 2. Kết quả chương trình

Guitar is playing
Piano is playing

Bài 3:
 Gọi phương thức qua biến interface

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }

    void paintColor() {
        System.out.println("Paint rectangle color");
    }
}

Yêu cầu
	1.	Tạo:

Drawable d1 = new Circle();
Drawable d2 = new Rectangle();

	1.	Gọi draw() cho cả hai.
	2.	Thử gọi d2.paintColor() và giải thích kết quả.
	3.	Nếu muốn gọi được paintColor(), phải làm thế nào?

✅ 1. Code + gọi draw()

public class Main {
    public static void main(String[] args) {

        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();

        d1.draw();
        d2.draw();
    }
}

✅ 2. Kết quả

Draw circle
Draw rectangle
Vì sao d2.paintColor() lỗi?

Drawable d2 = new Rectangle();
d2.paintColor(); // lỗi


🧠 Java xử lý lời gọi method theo 2 bước

✅ Bước 1: Compile-time (QUAN TRỌNG NHẤT)
Java nhìn vào kiểu biến:

Drawable d2;

👉 Nó hỏi:
“Trong Drawable có method paintColor() không?”
	•	Drawable chỉ có:

void draw();

👉 Không có paintColor() ❌

⛔ Kết luận ở bước 1:
❌ Không cho gọi → lỗi ngay khi compile
👉 Chương trình không chạy tới bước runtime

❌ Bước 2: Runtime
👉 Không bao giờ tới được bước này vì đã bị chặn từ bước 1

🎯 Chốt cực quan trọng
👉 Compile-time kiểm tra “có được gọi không” 👉 Nếu không có trong kiểu biến → chặn luôn, không quan tâm object thật

🔥 Câu 3 — Làm sao để gọi được paintColor()?

✅ Cách 1: Ép kiểu (Downcasting)

((Rectangle) d2).paintColor();

✅ Cách 2: Dùng đúng kiểu biến (không dùng interface nữa)

Rectangle d2 = new Rectangle();
d2.paintColor();

Cách	Bản chất	Ưu điểm	Nhược điểm
Ép kiểu	Giữ interface	Linh hoạt	Có thể lỗi runtime
Dùng đúng class	Không cần ép	An toàn	Mất đa hình

Bài 4:
Truyền đối tượng qua tham số interface

interface Worker {
    void work();
}

class Teacher implements Worker {
    @Override
    public void work() {
        System.out.println("Teacher is teaching");
    }
}

class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is coding");
    }
}

Yêu cầu
	1.	Viết hàm:

static void doWork(Worker w) {
    w.work();
}

	1.	Gọi doWork(new Teacher()) và doWork(new Developer()).
	2.	Ghi kết quả.
	3.	Giải thích vì sao tham số kiểu Worker nhưng phương thức gọi khác nhau.

✅ 1. Toàn bộ code
interface Worker {
    void work();
}

class Teacher implements Worker {
    @Override
    public void work() {
        System.out.println("Teacher is teaching");
    }
}

class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is coding");
    }
}

public class Main {

    static void doWork(Worker w) {
        w.work();
    }

    public static void main(String[] args) {

        doWork(new Teacher());
        doWork(new Developer());

    }
}
✅ 2. Kết quả chương trình

Teacher is teaching
Developer is coding

Hàm doWork nhận tham số là biến w kiểu Worker.
Khi gọi hàm, ta lần lượt truyền vào các đối tượng:

new Teacher()
new Developer()

🎯 Phân tích
Mặc dù w có kiểu là Worker, nhưng mỗi lần gọi hàm, w sẽ trỏ tới đối tượng thực tế khác nhau:
	•	Lần 1: w → Teacher
	•	Lần 2: w → Developer

⚙️ Trong hàm

w.work();

👉 Java sẽ:
	•	Không chỉ nhìn kiểu Worker
	•	Mà nhìn vào object thật mà w đang trỏ tới

✅ Kết quả
	•	Nếu w trỏ tới Teacher → gọi Teacher.work()
	•	Nếu w trỏ tới Developer → gọi Developer.work()

    Bài 5:
 Bài nâng cao: interface + nhiều lớp
Đề bài
	•	Interface Movable:

void move();

	•	Interface Soundable:

void makeSound();

	•	Lớp Dog implements cả 2 interface, move() in "Dog runs", makeSound() in "Dog barks".
	•	Lớp Bird implements cả 2 interface, move() in "Bird flies", makeSound() in "Bird sings".
Trong main:
	•	Tạo mảng Movable[] movers = {new Dog(), new Bird()} và gọi move().
	•	Tạo mảng Soundable[] singers = {new Dog(), new Bird()} và gọi makeSound().
Yêu cầu
	1.	Viết code đầy đủ.
	2.	Ghi kết quả.
	3.	Giải thích cơ chế đa hình runtime khi implement interface với nhiều lớp khác

2. Kết quả

Dog runs
Bird flies
Dog barks
Bird sings


3. Giải thích cơ chế đa hình runtime
Ở đây có 2 interface:
	•	Movable dùng cho hành vi move()
	•	Soundable dùng cho hành vi makeSound()
Cả Dog và Bird đều implement cả 2 interface, nghĩa là mỗi object vừa “di chuyển được”, vừa “phát ra âm thanh được”.
Trường hợp 1: mảng Movable[]

Movable[] movers = {new Dog(), new Bird()};

Mảng này chứa các biến kiểu Movable.
Khi duyệt:

for (Movable m : movers) {
    m.move();
}

Mỗi lần lặp, biến m có kiểu là Movable, nhưng nó lần lượt trỏ tới:
	•	new Dog()
	•	new Bird()
Khi gọi:

m.move();

Java sẽ gọi phương thức move() đúng với object thực tế mà m đang trỏ tới:
	•	m trỏ tới Dog → gọi Dog.move() → in Dog runs
	•	m trỏ tới Bird → gọi Bird.move() → in Bird flies

Trường hợp 2: mảng Soundable[]

Soundable[] singers = {new Dog(), new Bird()};

Mảng này chứa các biến kiểu Soundable.
Khi duyệt:

for (Soundable s : singers) {
    s.makeSound();
}

Mỗi lần lặp, biến s có kiểu là Soundable, nhưng object thực tế có thể khác nhau:
	•	Dog
	•	Bird
Khi gọi:

s.makeSound();

Java sẽ chọn đúng phương thức theo object thực tế:
	•	s trỏ tới Dog → gọi Dog.makeSound() → in Dog barks
	•	s trỏ tới Bird → gọi Bird.makeSound() → in Bird sings