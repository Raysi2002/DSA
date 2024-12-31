// --------Normal flow of the Program---------
// var x = 10; 
// function fun(){
//     console.log("Namaste World");
// }

// console.log(x);
// console.log(fun);
// fun();

// -------------To Test Hoisting in JS-----------



// fun(); //------It will give the  "Hello Kanxu"
// console.log(x); // ----> Will give undefined but who give undefined if initilized with 'let' or 'const' keyword
// console.log(fun) // It will give ƒ fun(){ 
// //     console.log("Hello Kanxu"); 
// // }

// var x = 10; 
// function fun(){ 
//     console.log("Hello Kanxu"); 
// }



// -------Incase of anynomous function or lamda expression ---------


console.log("Fun: ", fun); // Will show undefined
fun(); //Will throw console.error();


var fun = () =>{
    console.log("Hello world");
}