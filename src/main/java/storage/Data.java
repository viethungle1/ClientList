package storage;

import java.util.ArrayList;
import java.util.List;
public class Data {
    public static List<User> user = new ArrayList<>();
    static {
        user.add(new User("Mai Văn Hoàng", 30, "Hà Nội", "https://viettelinternet24h.com/wp-content/uploads/2022/12/1-1-400x400.png"));
        user.add(new User("Nguyễn Văn Nam", 25, "Bắc Giang", "https://i.pinimg.com/474x/86/b7/cc/86b7cc8bffd47fd6162dab856b41f332.jpg"));
        user.add(new User("Nguyễn Thái Hòa", 18, "Nam Định", "https://i.pinimg.com/474x/e3/b1/7e/e3b17e6e2c5784f72b7259ebde245c14.jpg"));
        user.add(new User("Trần Đăng Khoa", 41, "Hà Tây", "https://i.pinimg.com/474x/a7/b0/5e/a7b05eed960c1c288f05012082008f03.jpg"));
        user.add(new User("Nguyễn Đình Thi", 50, "Hà Nội", "https://i.pinimg.com/474x/cb/6b/e3/cb6be38306562aebada013eb20cf25fb.jpg"));
    }
}

