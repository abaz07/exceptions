import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            CODE.check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException exception){
            System.out.println("неверные данные: " + exception.getMessage());
        }
    }
}