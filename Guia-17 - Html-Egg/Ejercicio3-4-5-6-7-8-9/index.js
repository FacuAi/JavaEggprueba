       function scrollToTop() {
            window.scrollTo({
                top: 0,
                behavior: 'smooth' // Desplazamiento suave
            });
        }

        window.onscroll = function () {
            if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
                document.querySelector('.scroll-to-top').style.display = 'block';
            } else {
                document.querySelector('.scroll-to-top').style.display = 'none';
            }
        };
        function Login(){ 
            var done=0; 
            var usuario=document.login.usuario.value; 
            var password=document.login.password.value; 
            if (usuario=="USUARIO1" && password=="CONTRASEÑA1") { 
            window.location="TU_PAGINA_WEB.HTML"; 
            } 
            if (usuario=="USUARIO2" && password=="CONTRASEÑA2") { 
            window.location="TU_PAGINA_WEB.HTML"; 
            } 
            if (usuario=="" && password=="") { 
            window.location="errorpopup.html"; 
            } 
            } 

document.oncontextmenu = function() {
    return false;
}
