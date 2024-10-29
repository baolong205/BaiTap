
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng của lớp StudentMS (Quản lý sinh viên)
        StudentMS sms = new StudentMS();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("\n--- QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Cập nhật thông tin sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Đếm sinh viên theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới để tránh lỗi

            switch (choice) {
                case 1:
                    // Thêm sinh viên
                    System.out.print("Nhập mã sinh viên: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.print("Nhập điểm: ");
                    float score = scanner.nextFloat();
                    Student newStudent = new Student(id, name, age, score);
                    sms.addStudent(newStudent);
                    System.out.println("Đã thêm sinh viên thành công!");
                    break;

                case 2:
                    // In danh sách sinh viên
                    sms.printList();
                    break;

                    case 3:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = sms.find(searchId);
                    if (foundStudent != null) {
                        System.out.println("Tìm thấy: " + foundStudent);
                    } else {
                        System.out.println("Không tìm thấy sinh viên.");
                    }
                    break;
                

                case 4:
                    // Cập nhật thông tin sinh viên
                    System.out.print("Nhập mã sinh viên cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int updateAge = scanner.nextInt();
                    System.out.print("Nhập điểm mới: ");
                    float updateScore = scanner.nextFloat();
                    Student updatedStudent = new Student(updateId, updateName, updateAge, updateScore);
                    if (sms.update(updatedStudent)) {
                        System.out.println("Đã cập nhật thông tin sinh viên!");
                    } else {
                        System.out.println("Không tìm thấy sinh viên để cập nhật.");
                    }
                    break;

                    case 5:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String removeId = scanner.nextLine();
                    boolean isRemoved = sms.remove(removeId);
                    if (isRemoved) {
                        System.out.println("Đã xóa sinh viên thành công!");
                    } else {
                        System.out.println("Không tìm thấy sinh viên.");
                    }
                    break;
                

                case 6:
                    // Đếm số sinh viên theo tên
                    System.out.print("Nhập tên sinh viên cần đếm: ");
                    String countName = scanner.nextLine();
                    int count = sms.countStudent(countName);
                    System.out.println("Số sinh viên có tên \"" + countName + "\": " + count);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
