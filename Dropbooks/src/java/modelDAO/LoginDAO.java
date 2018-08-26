package modelDAO;

public class LoginDAO extends Conecta{
    String sql = "SELECT*FROM usuario WHERE email=? AND senha=?";
    
}
