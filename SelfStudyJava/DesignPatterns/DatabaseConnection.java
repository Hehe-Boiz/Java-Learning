
public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance() { 
        if (instance == null) { 
            instance = new DatabaseConnection(); 
        } 
        return instance; 
    }

    public void connect() {
        System.out.println("Đang kết nối...");
    }

    public static void main(String[] args) {
        // Lấy thể hiện đầu tiên của DatabaseConnection
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        // Lấy thể hiện thứ hai của DatabaseConnection
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect();

        // Kiểm tra xem hai thể hiện có trùng nhau không
        if (connection1 == connection2) {
            System.out.println("Cả hai đều là cùng một thể hiện!");
        } else {
            System.out.println("Có nhiều thể hiện khác nhau.");
        }
    }
}
