import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.dio.dao.UserDAO;
import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.exception.ValidatorException;
import br.com.dio.validator.*;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

public class App {
    private static final UserDAO dao = new UserDAO();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Options();
    }

    private static void Options() {
        
        
        while(true) {
            System.out.println("Bem vindo ao cadastro de usuários");
            System.out.println("1 Cadastrar");
            System.out.println("2 Atualizar");
            System.out.println("3 Excluir");
            System.out.println("4 Buscar por ID");
            System.out.println("5 Buscar todos");
            System.out.println("6 Sair");
            Integer userInput = scanner.nextInt();
            MenuOption selectedOption = MenuOption.values()[userInput - 1];
            switch(selectedOption) {
                case SAVE -> {
                    try {
                        UserModel user = requestUserSave();
                        dao.save(user);
                    } catch (ValidatorException vex) {
                        System.out.println(vex.getMessage());
                    }
                }   
                case UPDATE -> {
                    try {
                        UserModel user = requestUserUpdate();
                        dao.update(user);
                    } catch(UserNotFoundException uex) {
                        System.out.println(uex.getMessage());
                    } catch(EmptyStorageException esx) {
                        System.out.println(esx.getMessage());
                    } catch (ValidatorException vex) {
                        // TODO Auto-generated catch block
                        System.out.println(vex.getMessage());
                    }
                } 
                case DELETE -> {
                    try {
                        dao.delete(requestUserId());
                    } catch(UserNotFoundException uex) {
                        System.out.println(uex.getMessage());
                    } catch(EmptyStorageException esx) {
                        System.out.println(esx.getMessage());
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var user = dao.findById(requestUserId());
                        System.out.println(user);
                    } catch(UserNotFoundException uex) {
                        System.out.println(uex.getMessage());
                    } catch(EmptyStorageException esx) {
                        System.out.println(esx.getMessage());
                    }
                }
                case FIND_ALL -> {
                    try {
                        var users = dao.findAll();
                        users.forEach(System.out::println);
                    } catch(UserNotFoundException uex) {
                        System.out.println(uex.getMessage());
                    } catch(EmptyStorageException esx) {
                        System.out.println(esx.getMessage());
                    }
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static UserModel requestUserSave() throws ValidatorException {
        System.out.println("Informe o nome do usuário");
        String name = scanner.next();
        System.out.println("Informe o email do usuário");
        String email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário");
        String birthdayString = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(birthdayString, formatter);
        UserModel user = new UserModel();
        user = validadeInputs(1, name, email, birthday);
        
        return user;
    }

    private static UserModel requestUserUpdate() throws ValidatorException {
        System.out.println("Informe o id do usuário");
        Integer id = scanner.nextInt();
        System.out.println("Informe o nome do usuário");
        String name = scanner.next();
        System.out.println("Informe o email do usuário");
        String email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário");
        String birthdayString = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(birthdayString, formatter);
        UserModel user = new UserModel();
        user = validadeInputs(1, name, email, birthday);
        
        return user;
    }

    private static long requestUserId() {
        System.out.println("Informe o id do usuário");
        Integer id = scanner.nextInt();
        return id;
    }

    private static UserModel validadeInputs(long id, String name, String email, LocalDate birthday) throws ValidatorException {
        UserModel user = new UserModel(id, name, email, birthday);
        UserValidator.verifyModel(user);

        return user;
    }
}
