
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <script type="text/javascript" src="jquery-3.3.1.js">
    <script type="text/javascript">
            $(document).ready(function(){
                    $('#enviar').click(function(){

            alert("");
            var email = $("#email").val();
            var senha = $("#senha").val();
            $.ajax({
            type:'POST',
                    url : "ServletLogin",
                    data : {
                    email : email,
                            senha : senha
            },
                    success : function(results){
                    if (results === "1"){
                    $("#email").css("color", "red");
                    }else if(results === "2"){
                            $("#senha").css("color", "red");
                             }els e{
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
            if(session.getAttribute("email")==null){
                response.sendRedirect("login.jsp");
            }
        --%>

        <div class="container col-lg-6">
            <div class="row">
                <div class="formLogin col-md-8 ">
                    <p class="h3 text-center">Identifique-se</p>
                    <form action="Login" method="post">
                        <div class="form-group">
                            <label for="labelLogin">Email</label>
                            <input type="text" class="form-control" name="email"
                                   pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"  required="required" 
                                   aria-describedby="email" placeholder="email@email.com"
                              />
                        </div>
                        <div class="form-group">
                            <label for="labelSenha">Senha</label>
                             <small class="text-left novaSenha "><a href="recupSenha.jsp">Esqueceu sua senha?</a></small>
                            <input type="password" class="form-control" name="senha" required="required"
                                   required aria-describedby="senha" placeholder="Digite sua senha">
                           
                        </div>
                        <button type="submit" value="login" class="btn btn-primary btn-block">Enviar</button>
                    </form><hr>

                    <!--Adicionar link chamando um novo registro-->
                    <div class="goRegistro">
                        <label for="labelNovoReg">Primeira vez no Dropbooks?</label><br>
                        <button type="submit" class="btn btn-outline-primary btn-md btn-block">Cadastre-se</button>
                    </div>
                </div><br>
            </div>
        </div>
    </body>

</html>
