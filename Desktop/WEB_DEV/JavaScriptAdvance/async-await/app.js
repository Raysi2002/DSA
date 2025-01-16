async function promiseOne(){
    return `This is promise`;
}

const p1 = promiseOne();

p1
    .then((response) => {
        console.log(response);
    })
    .catch((error) => {
        console.error(error);
    })