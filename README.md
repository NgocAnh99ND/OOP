BT1:
	1.	Car có method start() không?
Car không định nghĩa method start(), nhưng nó có thể sử dụng method này vì được kế thừa từ class cha Vehicle.
	2.	Method đó được định nghĩa ở đâu?
Method start() được định nghĩa trong class Vehicle.
	3.	Nếu xóa method start() trong Vehicle thì chuyện gì xảy ra?
Nếu xóa method start() trong Vehicle thì chương trình sẽ bị lỗi compile vì Car không còn kế thừa method start() để gọi car.start().
Java sẽ đi tìm method start() theo thứ tự:
	1.	Tìm trong Car → không có
	2.	Tìm trong Vehicle → cũng không có (vì đã xóa)
➡️ Không tìm thấy method start(), nên chương trình không biên dịch được.

BT2: 
	1.	Vì sao cần @Override?
	⁃	@Override dùng để cho Java biết rằng method này đang ghi đè (override) method của lớp cha.
	⁃	Đảm bảo rằng method đang ghi đè đúng method của lớp cha và tránh lỗi viết sai.
	2.	Điều gì xảy ra nếu method signature khác?
Nếu method signature khác (khác tên hoặc khác tham số) thì method đó không còn là override nữa.
Java sẽ coi đó là một method mới trong class con. Kết quả:
Khi gọi method, chương trình sẽ chạy method của class cha, không phải của class con.
	3.	Nếu không override thì kết quả sẽ thế nào?
Nếu không override, thì class con sẽ dùng method của class cha. Vì Dog không có method makeSound(), nên Java sẽ sử dụng method trong class Animal.

BT4:
	1.	Nếu không gọi super() thì điều gì xảy ra?
Nếu không gọi super(name, age), chương trình sẽ bị lỗi compile.
Vì sao?
Vì class Person chỉ có constructor:
Person(String name, int age)
Khi Student tạo object, Java sẽ tự động cố gọi:
super();
Nhưng Person không có constructor Person(), nên Java không biết phải gọi constructor nào.
➡️ Kết quả: lỗi compile.

	2.	Vì sao constructor của lớp cha phải chạy trước?
Constructor của lớp cha phải chạy trước vì lớp con được xây dựng dựa trên lớp cha.
Lớp cha chứa những thông tin cơ bản, nên phải được tạo trước. Sau đó lớp con mới thêm phần của mình.

Ví dụ
	•	Person có: name, age
	•	Student = Person + studentId
Khi tạo Student:

Student s = new Student("John", 20, "S123");

Java sẽ làm theo thứ tự:
1️⃣ Tạo phần Person trước (name, age) 2️⃣ Sau đó tạo phần Student (studentId)