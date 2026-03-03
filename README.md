Câu 2:

	1.	Vì sao Connectable không nên là abstract class?
	⁃	Connectable chỉ mô tả một khả năng kết nối WiFi, không phải là bản chất hay một loại đối tượng cụ thể. Nó không có state hay logic chung để tái sử dụng, vì mỗi thiết bị kết nối WiFi theo cách khác nhau. Abstract class thường phù hợp khi có code hoặc trạng thái chung cho các lớp con. Ngoài ra, Java chỉ cho phép kế thừa một class, nên nếu dùng abstract class sẽ làm giảm tính linh hoạt.  Nếu Connectable là abstract class, SmartTV phải extends Connectable . Lúc đó SmartTV không thể extends một class khác quan trọng hơn (ví dụ TV). Vì vậy Connectable nên là interface. Tuy nhiên, việc dùng abstract class vẫn không sai về mặt logic hay khả năng chạy chương trình, mà chỉ là kém phù hợp về mặt thiết kế
	2.	Vì sao LightBulb không cần connectWifi?
	⁃	Nguyên tắc ISP (Interface Segregation Principle): Không nên ép một class phải phụ thuộc vào những phương thức mà nó không sử dụng.
	⁃	Đèn chỉ có 1 nhóm chức năng chính:
	•	Bật (turnOn)
	•	Tắt (turnOff)
    Nó không có khả năng kết nối WiFi; nếu ép nó implement thì sẽ tạo method “rác” hoặc hành vi giả, vi phạm ISP.
	3.	Nếu SmartTV đã extends Device thì có thể extends thêm Connectable không?
Không vì trong Java: Một class chỉ được extends 1 class duy nhất
	4.	Một class có thể implement bao nhiêu interface?
	⁃	Một class có thể implement nhiều interface ( không giới hạn)
Java cấm đa kế thừa class để tránh mơ hồ và xung đột state/logic, nhưng cho phép implement nhiều interface để ghép nhiều “khả năng” một cách linh hoạt và an toàn.

Câu 3:
	1.	Biến trong interface mặc định là gì?
	⁃	Mọi biến trong interface mặc định là: public static final
	⁃	Đoạn code đúng là:
interface Switchable {
    public static final int power = 100;
}
	2.	Interface có constructor không?
Không thể có constructor trong interface vì Interface không tạo được object. Constructor chỉ dùng khi tạo object
→ Interface không cần và không thể có coóntructor
	3.	Interface có thể có private method không? (Java 9+)
	⁃	Từ Java 9, Interface  có private method 
	⁃	Private method trong interface chỉ tồn tại để phục vụ các default method, chỉ dùng bên trong interface, không cho class implement nhìn thấy hay gọi.
	4.	Vì sao interface cần private method? (Java 9+)
Trước Java 8:
	•	Interface chỉ có method abstract
Java 8:
	•	Có default method
	•	Bắt đầu có code
👉 Khi có nhiều default method, sẽ lặp code.
Private method sinh ra để:
	•	Gom code chung
	•	Tránh copy-paste
	•	Nhưng không làm lộ ra ngoài
	⁃	VD: 
interface Switchable {

    default void turnOn() {
        commonSteps();
        System.out.println("Turning ON");
    }

    default void turnOff() {
        commonSteps();
        System.out.println("Turning OFF");
    }

    private void commonSteps() {
        System.out.println("Check power");
        System.out.println("Log action");
    }
}