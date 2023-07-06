package Task_1_2_3;

public class User2 {
    public User2() {
    }
    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }
    private String login;
    private String password;

    public void createQuery2() {
        class Query2 {
            final String login = User2.this.login, password = User2.this.password;

            public void printToLog() {
                System.out.printf("Логин пользователя %15s, Пароль пользователя %15s " + "\n" , login, password);
            }
        }
        Query2 q2 = new Query2();
        q2.printToLog();
    }
}

