package Gun31._02_Enum;

public class User {
        // USER ROLÜ ve STATUSU değişkenleri
       Role role;
       Statu statu;
       String username;

        public User(String username, Role role, Statu statu) {
            this.username = username;
            this.role = role;
            this.statu = statu;
        }

        }