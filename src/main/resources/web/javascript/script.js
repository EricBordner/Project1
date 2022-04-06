const url = "http://localhost:8080/"

getAllEmployees = () => {
	
	fetch(url + "employees") 
		.then(response=>response.json())
		.then(json=>displayAllEmployees(json));
		   
    displayAllEmployees = (json) => {
        const employeePart = document.getElementById('getall');
        let list = document.createElement('ul');
        for (i = 0; i < json.length; i++) {
            let item = document.createElement('li');
            item.innerHTML = json[i].id + "\n" + json[i].type + "\n" + json[i].email + "\n" + json[i].name + "\n" + json[i].password + "\n" + json[i].user;
            list.appendChild(item);
        };
        employeePart.appendChild(list);
    };
		
};