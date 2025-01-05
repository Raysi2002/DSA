// function greet(){
//     const message = "Hello from this side !";
//     setTimeout(() => console.log(message), 2000);
//     console.log("This line should execute first !")
// }

// greet();


// If you're thinking the way js works, in this case also setTimeout thing should print after others even if we mention 0ms

function test2(){
    setTimeout(() => console.log("Testing....."), 0);
    console.log("it should print first");
}
test2();

function test3(){
    let i = 0;
    while(i != 5){
        setTimeout(() => console.log(i), i * 1000);
        i++;
    }
}
test3();