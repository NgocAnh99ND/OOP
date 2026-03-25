Bài 1:
Khai báo biến, nhận diện kiểu dữ liệu và literal
Yêu cầu
Viết chương trình khai báo các thông tin sau bằng kiểu dữ liệu phù hợp:
	•	tên sinh viên
	•	tuổi
	•	điểm trung bình
	•	giới tính nam/nữ dưới dạng đúng/sai
	•	ký tự xếp loại
	•	dân số của một thành phố rất lớn
Sau đó in toàn bộ các giá trị ra màn hình.

🧠 1. Chọn kiểu dữ liệu phù hợp
Ta có:
Thông tin	                Kiểu dữ liệu	        Giải thích
Tên sinh viên	            String	                Chuỗi ký tự
Tuổi	                    int	                    Số nguyên
Điểm trung bình	            double	                Số thực
Giới tính (nam/nữ)	        boolean	                Đúng/Sai
Ký tự xếp loại	            char	                1 ký tự
Dân số thành phố lớn	    long	                Số rất lớn


✅ Literal trong code là gì?
👉 Literal = giá trị viết trực tiếp trong code

25        // int literal
8.5       // double literal
"Ngoc Anh"       // String literal
'A'       // char literal
true      // boolean literal
10000000000L // long literal

Bài 2:
Primitive và Reference
Yêu cầu
Cho đoạn ý tưởng sau, hãy viết chương trình để quan sát kết quả:
Phần A
Khai báo:
	•	một biến int a = 10
	•	một biến int b = a
Sau đó:
	•	đổi a thành giá trị khác
	•	in cả a và b

Phần B
Khai báo:
	•	một biến String s1 = "Java"
	•	một biến String s2 = s1
Sau đó:
	•	gán s1 sang một chuỗi khác
	•	in cả s1 và s2
Mục tiêu luyện
Bài này giúp học viên:
	•	thấy được primitive khi gán sẽ sao chép giá trị
	•	bước đầu quan sát reference type khi gán biến
	•	hiểu rằng String không phải primitive

Câu hỏi yêu cầu trả lời thêm
Sau khi chạy chương trình, giải thích:
	•	vì sao b không đổi khi a đổi?
	•	vì sao s2 vẫn giữ giá trị cũ?

	⁃	b không đổi khi a đổi vì với primitive, khi gán b = a, Java sẽ copy giá trị của a sang b. Khi đó b có một bản riêng trong bộ nhớ. Khi a thay đổi thì chỉ giá trị của a thay đổi, còn b không bị ảnh hưởng.
	⁃	s2 vẫn giữ giá trị cũ vì String là kiểu tham chiếu. Ban đầu s1 giữ địa chỉ tới object chứa giá trị "Java". Khi gán s2 = s1, cả hai cùng giữ địa chỉ đó. Khi gán lại s1 = "Python", s1 chuyển sang giữ địa chỉ của object mới chứa giá trị "Python", còn s2 vẫn giữ địa chỉ cũ nên không bị ảnh hưởng..