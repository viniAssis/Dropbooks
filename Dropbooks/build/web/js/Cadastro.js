function aparecerCaixa() {
            var fisico = document.getElementById("idFisico");
            var juridico = document.getElementById("idJuridico");
            var caixaFisico= document.getElementById("fisico");
            var caixaJuridico=document.getElementById("juridico");
            var cpf = document.getElementById("cpf");
            var cnpj = document.getElementById("cnpj");
            
            fisico.onclick=function(){ caixaFisico.style.display="block", caixaJuridico.style.display="none"; cnpj.value="";};
            
            juridico.onclick=function(){caixaFisico.style.display="none", caixaJuridico.style.display="block", cpf.value="";};
            
        }

function campoVazio(){
            var cpf = document.getElementById("cpf");
            var cnpj = document.getElementById("cnpj");
            var fisico = document.getElementById("idFisico");
            var juridico = document.getElementById("idJuridico");
            
            var teste= false;
            if(cpf.value == "" && cnpj.value == ""){
              
                    teste = false;
                    
               
            }
            else{
                teste = true;
            }
            return teste;
            
        }
        
        function teste(){return false;}
        
        window.onload=function(){
            
         
            
            
            
            
            
            
            aparecerCaixa();
            
            alert("JQUERY dentro do .js");
                    
                        /*alert("Consultando o email " + $("#email").val());

                         var email = $("#email").val();
                     

                         $.ajax({
                                type:'POST',
                                url : "ConsultaEmail",
                                data : {
                                    email : email,
                                    
                                },
                                success : function(results){
                                    if(results === "Ja existente"){
                                        $("#email").css("color", "red");
                                        alert(results);
                                    }else if(results === "Valido"){
                                        $("#email").css("color", "green");
                                        alert(results);
                                    }
                                    }
                                });*/
            
           
                
                
                
                    
                    
                
            
           
                
               
                
                    
                    
                
            
                
                
                
                
                
                
                
                
                
				
		
				
              document.getElementById("form").onsubmit = function(){
                    
                    var valid = campoVazio();
                
                    var fisico = document.getElementById("idFisico");
                    var juridico = document.getElementById("idJuridico");
            	
				var cpf = document.getElementById("cpf");
				var nome = document.getElementById("nome");
				var data = document.getElementById("data");
				var masc = document.form.sexo[0];
				var femi = document.form.sexo[1];
				
                    var cnpj = document.getElementById("cnpj");
                    var nomeRazao = document.getElementById("nomeRazao");  
                    var emailDisponivel = true;
                    var valid1 = true;
                    var fisicoValid = true;
                    var juridicoIValid = true;
                     
                  
                  
                  
                        /*if($("#email").val() == $("#reemail").val()){
                            alert("Email divergentes");
                            $("#email").css("border-color", "red");
                            $("#remail").css("border-color", "red");
                            return false;
                        }*/
                        
                        
                  
                  

                         var email = $("#email").val();
                     
                         /*Consulta email*/
                         $.ajax({
                                type:'POST',
                                url : "ConsultaEmail",
                                data : {
                                    email : email,
                                    
                                },
                                success : function(results){
                                    if(results === "Ja existente"){
                                        $("#email").css("background-color", "lightred");
                                        alert(results);
                                        emailDisponivel = false;
                                        
                                    }else if(results === "Valido"){
                                        $("#email").css("background-color", "lightgreen");
                                        alert(results);
                                        emailDisponivel = true;
                                                         
                                    }
                                }
                         });
                  
                  
                                        if(valid == false){
                                                alert("Preencher campos ssssss");
                                            if(fisico.checked){
						cpf.focus();
						cpf.placeholder = "Obrigatório";
                                            }
                                            if(juridico.checked){
						cnpj.focus();
						cnpj.placeholder = "Obrigatório";
                                            }
					
						
                                            valid1 = false;
                                        }
                
                
                                        if(fisico.checked){
                                            if(!masc.checked && !femi.checked){
						masc.focus();
						 fisicoValid = false;
						
                                            }
					
                                            if(nome.value == ""){
						nome.focus();
						nome.placeholder = "Obrigatório";
						 fisicoValid = false;
                                            }
                                            
                                            if(data.value == ""){
						data.focus();
						 fisicoValid = false;
                                            }
                                        }
                                            
                                
                                
                                        if(juridico.checked){
                                            if(nomeRazao.value == ""){
						nomeRazao.focus();
						nomeRazao.placeholder = "Obrigatório";
						juridicoIValid = false;
                                            }
                                        }
                                        
                                        alert(cpf.value +" eeeeeeee "+cnpj.value);
                                        
                                        if(valid1 === false || fisicoValid === false || juridicoIValid === false || emailDisponivel === false){
                                                alert("valid1 "+valid1)
                                                alert("fisicovalid "+fisicoValid)
                                                alert("juridicovalid "+juridicoIValid)
                                                alert("emailvalid "+emailDisponivel)
                                                
                                                return false;                        
                                        }
                                            
                                        document.getElementById("form").submit;    
                                            
                  
                  
                  
                  
                  
                    
                    
                    
                  
              };
		
				
				
                
                
				
				
				
				
				
					
				
				
				
				
                
        }
    
        
               
        
        