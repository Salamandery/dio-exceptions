package br.com.dio.validator;

import br.com.dio.exception.ValidatorException;
import br.com.dio.model.UserModel;

public class UserValidator {
    private UserValidator() {

    }

    public static void verifyModel(UserModel userModel) throws ValidatorException {
        if (userModel.getName() == null || userModel.getName().isEmpty()) {
            throw new ValidatorException("Informa um nome valido ou não nulo");
        }
        if (!userModel.getEmail().contains("@") || !userModel.getEmail().contains(".")) {
            throw new ValidatorException("Informe um email valido");
        }
    }
}
