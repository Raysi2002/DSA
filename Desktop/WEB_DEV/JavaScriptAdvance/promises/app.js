// const promiseOne = new Promise((resolve, reject) => {
//     const success = true;
//     setTimeout(() => {
//         if(success){
//             console.log("SUCCESS");
//             resolve();
//         }
//         else{
//             console.log("FAILED");
//             reject();
//         }
//     }, 1000)
// })

// promiseOne
//     .then(() => {
//         console.log("Then is exectued");
//     })
//     .catch((error) => console.error(error));
    


// new Promise((resolve, reject) => {
//     setTimeout(() => {
//         console.log("Async task is done");
//         resolve();
//     }, 500)
// })
//     .then(() => {
//         console.log("Promise is exectued");
//     })
//     .catch((error) => {
//         console.error(error);
//     })

// const promiseThree = new Promise((resolve, reject) => {
//     const user = {
//         username : "Preeti",
//         email : "2004preeti@gmail.com"
//     }
//     setTimeout(() => {
//         resolve(user);
//     }, 1000);
// })

// promiseThree
//     .then((user) => {
//         console.log(user);
//     })

// const promiseFour = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         reject("Promise is rejected");
//     }, 1000)
// })

// promiseFour
//     .then(() => {
//         console.log("Promise is accepted");
//     })
//     .catch((error) => {
//         console.error(error);
//     })


// const promiseFive = new Promise((resolve, rejevt) => {
//     const user = {
//         username : "raysi2002",
//         email : "2002raysi@gmail.com"
//     }
//     setTimeout(() => {
//         resolve(user);
//     }, 500);
// })

// promiseFive
//     .then((user) => {
//         console.log(user);
//         return user.username;
//     })
//     .then((username) => {
//         console.log(username);
//     })
//     .catch((error) => console.error(error));


// const promiseSix = new Promise((resolve, reject) => {

//     const user = {
//         username : "sonu2004",
//         email : "sonu2004@gmail.com"
//     }
//     const error = true;

//     setTimeout(() => {
//         return !error ? resolve(user) : reject("Something went wrong"); 
//     }, 100)
// })

// promiseSix
//     .then((user) => {
//         console.log(user);
//         return user.email;
//     })
//     .then((userEmail) => {
//         console.log(userEmail);
//     })
//     .catch((error) => {
//         console.error(error);
//     })


// const promiseSeven = new Promise((resolve, reject) => {

//     const user = {
//         username : "sonu2004",
//         email : "sonu2004@gmail.com"
//     }
//     const error = true;

//     setTimeout(() => {
//         return !error ? resolve(user) : reject("Something went wrong"); 
//     }, 100)
// })

// promiseSeven
//     .then((user) => {
//         console.log(user);
//         return user.email;
//     })
//     .then((userEmail) => {
//         console.log(userEmail);
//     })
//     .catch((error) => {
//         console.error(error);
//     })
//     .finally(() => console.log("Program is finished"));

// -------pre-fetch------------
// async function userData(){
//     try{
//         const response = await fetch("https://jsonplaceholder.typicode.com/users");
//         const data = await response.json();
//         console.log(data)
//     }catch(error){
//         console.error(error);
//     }
// }

// userData();

fetch("https://jsonplaceholder.typicode.com/users")
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        console.log(data);
    })
    .catch((err) => {
        console.error(err);
    })
    .finally(() => console.log("Thanks for using this code !"));

