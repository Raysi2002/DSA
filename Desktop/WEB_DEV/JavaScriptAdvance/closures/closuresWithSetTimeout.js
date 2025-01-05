// function greet(){
//     const message = "Hello from this side !";
//     setTimeout(() => console.log(message), 2000);
//     console.log("This line should execute first !")
// }

// greet();


// If you're thinking the way js works, in this case also setTimeout thing should print after others even if we mention 0ms

// function test2(){
//     setTimeout(() => console.log("Testing....."), 0);
//     console.log("it should print first");
// }
// test2();

// function test3(){
//     for(let i = 1; i <= 5; i++){
//         setTimeout(() => console.log(i), i * 1000);
//     }
// }
// test3();

// function test4(){
//     for(var i = 1; i <= 5; i++){
//         setTimeout(() => console.log(i), i * 1000);
//     }
// }
// test4();

// function test5(){
//     setTimeout(f1, 100);
//     function f1(){
//         console.log("END")
//     }
// }
// test5();

// function test6(){
//     setTimeout(() => console.log("It should print at last"), 0);
//     for(let i = 0; i <= 10000; i++){
//         console.log(i);
//     }
// }
// test6();