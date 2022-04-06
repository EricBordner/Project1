const url = "http://localhost:8080/"

async function loginFunction(username, password){
	let username1 = {
		user:username,
		password:password 
	};
	let response = await fetch(url + 'login', {
		method:'POST',
		headers:{'Content-Type':'application/json'}, 
		body:JSON.stringify(username1)} );
		let result = await response.json();
		alert(result);
} //this ends async function

function getInputFunction(){
	let username = document.getElementById("user").value   //usernametextbox
	let password = document.getElementById("password").value   //passwordtextbox
	alert("thisisworking" + username + ""+ password)
	loginFunction(username, password)
}