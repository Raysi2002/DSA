What is setTimeout()?

setTimeout() is a built-in JavaScript function that executes a piece of code or a function after a specified delay (in milliseconds). It’s commonly used for scheduling tasks to run asynchronously after a certain time.

Basic Syntax

setTimeout(function, delay, param1, param2, ...);

	•	function: The function to execute after the delay.
	•	delay: The time in milliseconds to wait before executing the function.
	•	param1, param2, ...: Optional parameters to pass to the function.

Basic Example

console.log("Start");
setTimeout(() => {
    console.log("This runs after 2 seconds");
}, 2000);
console.log("End");

Output:

Start
End
This runs after 2 seconds

How it Works
	1.	Asynchronous Nature: The setTimeout() function schedules the callback function to execute after the specified delay without blocking the main thread.
	2.	Event Loop: After the delay, the callback function is pushed into the event loop and executed when the call stack is empty.

Closures in Relation to setTimeout()

Closures are functions that “remember” the scope in which they were created. When you use setTimeout() within a function, it often relies on closures to access variables from the outer scope.

Example: Closures with setTimeout()

function greeting(name) {
    setTimeout(() => {
        console.log(`Hello, ${name}!`);
    }, 1000);
}

greeting("Aashish");

Explanation:
	•	The setTimeout() callback forms a closure around the variable name.
	•	Even though the greeting function finishes execution, the callback still has access to name because of closures.

Output:

Hello, Aashish!

Common Pitfall: Closures and Loops

When using setTimeout() in loops, closures can lead to unexpected results if not handled correctly.

Problematic Example:

for (var i = 1; i <= 3; i++) {
    setTimeout(() => {
        console.log(i);
    }, 1000);
}

Output:

4
4
4

Why?
	•	The setTimeout() callback captures the reference to i, not its value.
	•	By the time the callbacks execute, the loop has finished, and i is 4.

Solution 1: Use let

for (let i = 1; i <= 3; i++) {
    setTimeout(() => {
        console.log(i);
    }, 1000);
}

Output:

1
2
3

	•	let creates a block-scoped variable, so each iteration gets its own i.

Solution 2: Use an IIFE

for (var i = 1; i <= 3; i++) {
    (function(i) {
        setTimeout(() => {
            console.log(i);
        }, 1000);
    })(i);
}

Output:

1
2
3

	•	The Immediately Invoked Function Expression (IIFE) captures the current value of i for each iteration.

Practical Example: Timer with Closures

function startTimer() {
    for (let i = 1; i <= 5; i++) {
        setTimeout(() => {
            console.log(`Timer: ${i} seconds`);
        }, i * 1000);
    }
}

startTimer();

Output:

Timer: 1 seconds
Timer: 2 seconds
Timer: 3 seconds
Timer: 4 seconds
Timer: 5 seconds

Here, closures ensure that each callback remembers its respective value of i.

Key Takeaways
	1.	setTimeout() is asynchronous and does not block the execution of subsequent code.
	2.	Closures allow setTimeout() callbacks to access variables from their outer scope, even after the scope has exited.
	3.	Be mindful of scoping issues in loops when using var; prefer let or IIFEs for correct behavior.