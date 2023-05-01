package id.co.bca.spring.NanoLendingProduct.repository;
import id.co.bca.spring.NanoLendingProduct.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Integer> {
    UserModel findByUsername(String username);
}
