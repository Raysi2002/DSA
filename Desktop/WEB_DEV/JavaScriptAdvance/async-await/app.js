// async function promiseOne(){
//     return `This is promise`;
// }

// const p1 = promiseOne();

// p1
//     .then((response) => {
//         console.log(response);
//     })
//     .catch((error) => {
//         console.error(error);
//     })


console.log("Data is loading");
async function dataHandling(){
    try{
        const response = await fetch("https://jsonplaceholder.typicode.com/users");
        const data =  await response.json();
        console.log(data);
    }catch{
        throw new error("Something went wrong in fetching data");
    }
}

dataHandling();