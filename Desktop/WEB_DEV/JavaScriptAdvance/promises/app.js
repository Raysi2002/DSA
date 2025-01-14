const promiseOne = new Promise((resolve, reject) => {
    const success = true;
    setTimeout(() => {
        if(success){
            console.log("SUCCESS");
            resolve();
        }
        else{
            console.log("FAILED");
            reject();
        }
    }, 1000)
})

promiseOne
    .then(() => {
        console.log("Then is exectued");
    })
    .catch((error) => console.error(error));
    


new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log("Async task is done");
        resolve();
    }, 500)
})
    .then(() => {
        console.log("Promise is exectued");
    })
    .catch((error) => {
        console.error(error);
    })