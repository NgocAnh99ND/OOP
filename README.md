BT2.1:
	1.	Vì sao Dog is-a Animal?
Dog is-a Animal vì Dog là một loại Animal.
Nói cách khác:
	•	Animal là khái niệm tổng quát (general).
	•	Dog là một trường hợp cụ thể của Animal
Trong OOP, quan hệ is-a được thể hiện bằng kế thừa (extends). Điều này có nghĩa:
	•	Dog kế thừa thuộc tính: name, age
	•	Dog kế thừa phương thức: eat(), sleep(), makeSound()
	2.	Nếu Elephant được thêm vào hệ thống thì phải làm gì?
	⁃	Ta chỉ cần tạo một class Elephant kế thừa Animal.
public class Elephant extends Animal {
    private double weight;
    public Elephant(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }
    public void trumpet() {
        System.out.println(name + " is trumpeting");
    }
}
	⁃	Sau đó tạo object: 
Elephant elephant = new Elephant("Dumbo", 5, 500);
	3.	Lớp Animal đã có method eat() thì Dog có cần viết lại không? Tại sao?
Không cần viết lại method eat() vì Dog kế thừa phương thức này từ lớp Animal. Tuy nhiên, nếu muốn thay đổi hành vi của phương thức cho phù hợp với Dog, ta có thể override method eat() trong lớp Dog.
	4.	Khi nào cần dùng super()?
super() được dùng để gọi constructor của lớp cha, lớp cha cần được khởi tạo trước để thiết lập các thuộc tính chung, sau đó lớp con mới tiếp tục khởi tạo các thuộc tính riêng của mình.
BT2.2: 
	1.	Nếu lớp Dog không khai báo lại phương thức eat() thì khi gọi:
Dog dog = new Dog("Buddy", 3, "Golden");
dog.eat();
Phương thức eat() của lớp Animal sẽ được thực thi. Vì Dog kế thừa từ Animal và không override phương thức eat(), nên Dog sẽ sử dụng phương thức eat() được kế thừa từ lớp cha.
	2.	Nếu lớp Dog override phương thức eat() như sau:

@Override
public void eat() {
    System.out.println(name + " is eating dog food");
}
	⁃	Khi gọi dog.eat() thì phương thức eat() của lớp Dog sẽ được thực thi, vì Dog đã override phương thức eat() của lớp Animal.
	⁃	Phương thức eat() của lớp Animal vẫn có thể được dùng, nhưng không được gọi tự động  khi gọi dog.eat(). Nếu muốn dùng lại method này của lớp cha, ta có thể gọi bằng super.eat().
	3.	Nếu trong lớp Dog ta muốn vừa dùng hành vi của Animal, vừa thêm hành vi riêng, hãy viết lại phương thức eat() bằng cách sử dụng super.

Ví dụ kết quả mong muốn phương thức eat() phải in ra:
Buddy is eating
Dog eats dog food

Thì viết lại phương thức eat() như sau:
@Override
public void eat() {
    super.eat(); 
    System.out.println(name + " eats dog food");
}