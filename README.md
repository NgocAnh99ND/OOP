1.	Vì sao Employee phải là abstract?
Vì Employee là khái niệm chung, không đủ thông tin để tạo đối tượng cụ thể.
	•	Không tồn tại “nhân viên chung chung”
	•	Chỉ tồn tại:
	•	FullTimeEmployee
	•	PartTimeEmployee
Ngoài ra:
	•	Employee có abstract method calculateSalary()
	•	Class chứa abstract method bắt buộc phải là abstract 

2.	Nếu implement calculateSalary() trong Employee thì có hợp lý không?
Không hợp lý trong bài này.
Vì:
	•	Mỗi loại nhân viên có cách tính lương khác nhau
	•	Employee không thể định nghĩa một công thức chung

3.	Khi nào nên dùng abstract class thay vì interface?
Nếu các đối tượng khác nhau nhưng cùng là “một loại” và có dữ liệu chung → abstract class
Nếu chỉ mô tả khả năng/hành vi mà nhiều loại đối tượng khác nhau có thể có → interface
4.	Sự khác nhau giữa kế thừa và trừu tượng là gì?
👉 Trừu tượng (Abstraction)
Là việc chỉ nói “cần làm gì”, không nói “làm như thế nào”.
→ Dùng để định nghĩa khuôn mẫu / hợp đồng chung.
👉 Kế thừa (Inheritance)
Là việc lớp con nhận lại và thực hiện những gì lớp cha đã định nghĩa.
→ Dùng để tái sử dụng và mở rộng.
Trừu tượng trả lời: Làm gì?
Kế thừa trả lời: Làm như thế nào?
	5.	BÀI NÂNG CAO 
Trong Employee thêm:

public void printInfo() {
    System.out.println(id + " - " + name);
}

Hỏi :
	•	Tại sao method này không abstract?
Vì mọi nhân viên đều có id và name,
và cách in thông tin là giống nhau, không phụ thuộc vào loại nhân viên,
nên printInfo() không cần trừu tượng và có thể được cài đặt ngay trong lớp cha.
	•	Vì sao abstract class có thể chứa method thường?
Abstract class vẫn là một class bình thường,
nhưng cho phép chứa abstract method và không thể khởi tạo trực tiếp.
Abstract class được tạo ra để:
	•	Chia sẻ những phần giống nhau cho các lớp con
	•	Trừu tượng hóa những phần khác nhau
Những gì:
	•	Giống nhau → viết thành method thường
	•	Khác nhau → để abstract method

	6.	BÀI test hiểu sâu
Cho code:
class Employee {
    double calculateSalary() {
        return 0;
    }
}

Hỏi:
	•	Thiết kế này có đúng trừu tượng không?
KHÔNG đúng trừu tượng.
Vì sao?
	•	Employee đã cài đặt sẵn cách tính lương (return 0)
	•	Trong khi thực tế:
	•	Mỗi loại nhân viên có cách tính khác nhau
	•	Lớp cha không biết cách tính cụ thể
	•	Nếu sau này thêm CommissionEmployee thì sao?