package modelDAO;

import model.Usuario;
import java.sql.*;
import java.util.List;

public class UsuarioDAO {

    public static Usuario getUsuario(String email) {
        
        Usuario usuario = new Usuario();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM usuario WHERE email=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                usuario.setSexo(rs.getString("sexo"));
                usuario.setDataNascimento(rs.getDate("dataNascimento"));
                usuario.setId(rs.getInt("id"));
                usuario.setTipoPessoa(rs.getInt("tipoPessoa"));
                usuario.setComplemento(rs.getString("complemento"));
                usuario.setCpf_cnpj(rs.getString("cpf_cnpj"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setEmail(rs.getString("email"));
                usuario.setNomeRazao(rs.getString("nomeRazao"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setNumero(rs.getString("numero"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCep(rs.getString("cep"));
                usuario.setLogradouro(rs.getString("logradouro"));
                usuario.setSenha(rs.getString("senha"));
            }else{
                usuario = null;
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuario;
    }  
        
    }