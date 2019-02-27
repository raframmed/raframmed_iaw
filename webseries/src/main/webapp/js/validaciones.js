/**
 * 
 */

function validarFormulario() {
	var login = document.getElementById("username");
	if (login.value == null || login.value.trim().length == 0) {
		document.getElementById("spusername").innerHTML = "Debe rellenar el campo";
		return false;
	} else {
		document.getElementById("spusername").innerHTML = "";
	}
	
	
	var email = document.getElementById("email");
	var re = /\S+@\S+\.\S+/;
	if (!re.test(email.value)) {
		document.getElementById("spemail").innerHTML = "Email incorrecto";
		return false;
	} else {
		document.getElementById("spemail").innerHTML = "";
	}
	
	return true;
}