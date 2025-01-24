fetch("http://localhost:8080/api/vehicles")
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        console.log(data);
    })
    .catch(error => console.error(error));