package Task_1_2_3;

public class User {
    User() {

    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    private String login;
    private String password;

    public class Query {
        public Query() {
        }
        public void printToLog() {
            System.out.printf("Логин пользователя %15s, Пароль пользователя %15s " + "\n" , login, password);
        }
    }

    public void createQuery() {
        Query q1 = new Query();
        q1.printToLog();
    }

}
