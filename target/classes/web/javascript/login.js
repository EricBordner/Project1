const url = "http://localhost:8080/"

async function loginFunction(username, password){
	let username1 = {
		user:username,
		password:password 
	};
	let response = await fetch(url + 'secondlogin', {
		method:'POST',
		headers:{'Content-Type':'application/json'}, 
		body:JSON.stringify(username1)} );
		let result = await response.json();
		//alert(result);
		console.log(result.user);
		if(result.user === null){alert("Resubmit")}
		else {
			if(result.type == "manager"){
				window.location.href="/secondlogin.html";
				alert("This works you are a manager");
			}
				
			else {window.location.href="/index.html"} 
		}
		
		
		//if (result){ if()
		//window.location.href="/index.html";
			//}
		//else (alert("Resubmit your username and password")
} //this ends async function

function getInputFunction(){
	let username = document.getElementById("user").value   //usernametextbox
	let password = document.getElementById("password").value   //passwordtextbox
	//alert("thisisworking" + username + ""+ password)
	loginFunction(username, password)
}

function refreshPage(){
	window.location.href="/secondlogin.html";
}