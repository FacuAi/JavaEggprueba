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

