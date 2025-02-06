# Đồ án môn Thiết kế hướng đối tượng NLU 2023-2024
## Cài đặt
- Repository này chỉ cần clone về một Java Project là có thể chạy được vì chỉ chứa source code có sẵn.
- Chạy project ở file `src/Demo.java`.
## Mô tả Project
### I. Chức năng lật hình 
 - Khi xuất hiện màn chơi, trên màn hình xuất hiện các thành phần bao gồm: **ô điểm, tính thời gian, khu hình để chơi**. Các thẻ hình sẽ úp sấp xuống, khi nhấn vào từng hình sẽ lật ngược lại, mỗi hình có thời gian lật cố định. Trong thời gian đó người dùng ghi nhớ và tìm hình khác tương tự. Người dùng thao tác trên hình, mỗi lần chơi máy sẽ tính điểm.
 - Số hình chơi phụ thuộc vào cấp độ màn chơi người dùng. 
 - Nếu thắng màn chơi, người dùng sẽ chuyển đến màn tiếp theo.
 - Sau khi qua màn sẽ cập nhật thứ hạng bên trái màn hình.
 - Trước khi vào chơi sẽ đăng nhập nhưng làm cho có nên không quan trọng.
### II. Chức năng tính điểm 
 - Nếu người dùng chọn đúng hình và chơi xong trong thời gian đếm ngược, máy sẽ cộng điểm cho người chơi. Ngược lại, nếu chọn sai hình thì người chơi bị trừ điểm và nếu quá thời gian cho phép điểm màn chơi sẽ về 0.
 - Lưu điểm vào một danh sách màn chơi.
### III. Chức năng lưu và xem điểm ở màn chơi gần nhất
 - Người dùng có thể xem điểm các màn đã chơi ở màn hình chính. Các phần: **tên, điểm hiện có, điểm cao nhất**.
 - Sau khi hoàn thành chơi 1 cấp độ, hệ thống sẽ cập nhật cấp độ, điểm hiện có và điểm cao nhất nếu điểm màn chơi đó lớn hơn điểm cao nhất của một màn chơi trước đó.
### IV. Chức năng tạo màn chơi theo độ khó tăng dần
 - Khi bắt đầu trò chơi, người dùng được mặc định mức độ chơi của màn. Người dùng sẽ chơi tuần tự từ cấp độ dễ đến khó (1 đến 4).
 - Sau khi level 4 hoàn thành, hệ thống sẽ thông báo người dùng đã chơi hết màn và gợi ý cho người chơi quay lại từ đầu.
 - Nếu người dùng chơi quá thời gian, màn hình sẽ chuyển sang màn hình ngừng chơi và trở về màn hình đăng nhập.
 - Một màn chơi được đặt trong một thời gian cố định. Khi người dùng bắt đầu chơi, thời gian chơi sẽ tự động đặt ra.
 - Nếu quá thời gian, màn chơi sẽ kết thúc và điểm màn đó về 0.
### V. Chức năng trợ giúp người chơi
 - Khi có quá nhiều thẻ hình trong một màn chơi, người dùng cần sự trợ giúp.
 - Khi người dùng nhấn vào nút **HELP**, tất cả các thẻ hình sẽ lật lên trong một khoảng thời gian để người dùng ghi nhớ và sau đó sẽ quay lại trạng thái chưa lật.
 - Khi người chơi nhận trợ giúp, hệ thống sẽ tự động trừ vào điểm đã có của người chơi.
### VI. Chức năng xếp hạng người chơi
 - Khi kết thúc 1 lượt chơi, hệ thống sẽ cập nhật lại điểm cao nhất đạt được của người chơi và cập nhật điểm người chơi trên bảng xếp hạng.
 - Sau khi thoát khỏi trò chơi, hệ thống sẽ lưu điểm người chơi trên bảng xếp hạng đã được sắp xếp.
## Hình ảnh Demo
![image](https://github.com/user-attachments/assets/17bc1d54-016d-449a-8810-ec9546882a5c)
![image](https://github.com/user-attachments/assets/ddc18976-216f-47ab-8dfb-7108e80ab1ff)
![image](https://github.com/user-attachments/assets/812fdff7-9bd3-40ec-85de-e5b46b904772)
![image](https://github.com/user-attachments/assets/0f3cc8e5-47ac-4a7f-b7d3-30d4dfb0de3c)
![image](https://github.com/user-attachments/assets/3e7d4637-d7e7-4b01-aa4e-8ac0b0a955f6)
![image](https://github.com/user-attachments/assets/f90f77d7-d6a3-4906-bacc-8885f648fff8)





