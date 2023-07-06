package Task_1_2_3;

public class User3 {
    User3() {
    }
    User3(String login, String password) {
        this.login = login;
        this.password = password;
    }
    private String login;
    private String password;
    public static class Query3 extends User3 {
        public Query3(String login, String password) {
            super(login, password);
        }
    }
    public void printToLog() {
        System.out.printf("Логин пользователя %15s, Пароль пользователя %15s " + "\n", login, password);
    }
}

