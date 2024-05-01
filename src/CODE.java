import java.util.regex.Pattern;

public class CODE {
    private CODE(){

    }
    private static final Pattern PATTERN = Pattern.compile("\\w{1,20}");

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        // if(!login.matches("\\w{1,20}"))
        if (!PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Логин " + login + " не корректный");
        }

        if(!PATTERN.matcher(password).matches()) {
            throw new WrongPasswordException("Пароль " + password + " не корректный");
        }

        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException(" password != confirmPassword");
        }
    }
}