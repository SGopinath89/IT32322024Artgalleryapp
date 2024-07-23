package sys.app.pack.Repository;

public interface AuthenticationRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
