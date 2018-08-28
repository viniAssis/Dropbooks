
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript" src="jquery-3.3.1.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#enviar').click(function(){

                    alert("");

                     var email = $("#email").val();
                     var senha = $("#senha").val();

                     $.ajax({
                                type:'POST',
                                url : "UsuarioServlet",
                                data : {
                                    email : email,
                                    senha : senha
                                },
                                success : function(results){
                                    if(results === "1"){
                                        $("#email").css("color", "red");
                                    }else if(results === "2"){
                                        $("#senha").css("color", "red");
                                    }else{
                                        $("#email").css("color", "green");
                                        $("#senha").css("color", "green");
                                    }
                                }
                    });
                });
            });
        </script>
    </head>
    <body>
        
        <%-- 
        Páginha envia email e senha para o Servlet
        --%>

        <p><input type="text" id="email"></p>
        <p><input type="text" id="senha"></p>
        <p><input type="submit" id="enviar"></p>
    </body>
</html>
