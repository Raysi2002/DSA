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
    