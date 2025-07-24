package br.com.dio.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.UserModel;

public class UserDAO {
    private long nextId = 1;
    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(UserModel model) {
        model.setId(nextId++);
        this.models.add(model);

        return model;
    }

    public UserModel update(UserModel model) {
        UserModel toUpdate = findById(nextId);
        models.remove(toUpdate);
        models.add(model);

        return model;
    }

    public void delete(long id) {
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public UserModel findById(long id) {
        verifyStorage();
        String message = "Não existe usuário com esse ID.";
        return models.stream().filter(u -> u.getId() == id)
            .findFirst()
            .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll() {
        List<UserModel> result = null;
        try {
            verifyStorage();
            result = models;
        } catch (EmptyStorageException esx) {
            // TODO: handle exception
            esx.printStackTrace();
            result = new ArrayList<>();
        }
        return result;
    }

    public void verifyStorage() {
        if (models.isEmpty()) throw new EmptyStorageException("O armazenamento está vazio");
    }
}
