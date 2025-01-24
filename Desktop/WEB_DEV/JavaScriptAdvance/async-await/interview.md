# Important Things to Know About `async/await` for Interviews

## Core Concepts

### 1. **`async` Functions**
- Declares a function as asynchronous
- Always returns a `Promise`, either resolved or rejected
- If a function explicitly returns a value, it is wrapped in a `Promise`

### 2. **`await` Keyword**
- Can only be used inside an `async` function
- Pauses the execution of the function until the Promise resolves or rejects
- Does not block the main thread, only the `async` function is paused

## Common Scenarios and Use Cases

### 1. **Error Handling**
- Use `try...catch` to handle errors in `async/await`
- If no `try...catch` is used, unhandled errors can cause runtime issues

**Example:**
```javascript
async function fetchData() {
  try {
    const response = await fetch("https://invalid-url.com");
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error("Error:", error);
  }
}
```

### 2. **Parallel Execution**
- Multiple await calls can run in parallel using Promise.all

**Example:**
```javascript
async function fetchMultipleData() {
  const [data1, data2] = await Promise.all([
    fetch("https://api.example.com/data1").then((res) => res.json()),
    fetch("https://api.example.com/data2").then((res) => res.json()),
  ]);
  console.log(data1, data2);
}
```

### 3. **Sequential Execution**
- Use multiple await statements for sequential execution when there are dependencies

**Example:**
```javascript
async function fetchSequentialData() {
  const response1 = await fetch("https://api.example.com/data1");
  const data1 = await response1.json();

  const response2 = await fetch(`https://api.example.com/data2?ref=${data1.id}`);
  const data2 = await response2.json();

  console.log(data1, data2);
}
```

## Important Questions and Concepts for Interviews

### 1. Why Use async/await Over Promises?
- async/await makes asynchronous code look synchronous and improves readability
- It reduces "callback hell" and simplifies error handling with try...catch

### 2. What Happens if You Don't Use await?
- The async function continues execution without waiting for the Promise to resolve
- The unresolved Promise is returned

**Example:**
```javascript
async function fetchData() {
  const response = fetch("https://api.example.com/data"); // No await
  console.log(response); // Logs a Promise, not the resolved data
}
```

### 3. Can await Block the Main Thread?
- No, await only pauses the execution of the async function. It does not block the main thread

### 4. What Happens When an Error Occurs?
- If an error occurs in a Promise that is awaited, it throws an exception
- This exception can be caught using try...catch

## Common Mistakes to Avoid

### 1. Using await Outside async
- Results in a SyntaxError
- Always wrap await inside an async function

**Example:**
```javascript
await fetch("https://api.example.com"); // SyntaxError
```

### 2. Not Handling Errors
- Always use try...catch to prevent unhandled errors in async functions

### 3. Blocking Code with Sequential await
- Use Promise.all for independent operations to improve performance

## Advanced Topics

### 1. Top-Level await
- Supported in modern JavaScript (ES2022)
- Allows await to be used outside of an async function in module scripts

**Example:**
```javascript
const data = await fetch("https://api.example.com").then((res) => res.json());
console.log(data);
```

### 2. Combining async/await with Promises
- async/await works seamlessly with existing Promises
- You can mix await with .then() chains if necessary

## Example Interview Problem

**Question:** Fetch user data and their posts from an API using async/await. Ensure both API calls handle errors gracefully.

**Solution:**
```javascript
async function fetchUserData() {
  try {
    const userResponse = await fetch("https://api.example.com/user");
    const user = await userResponse.json();

    const postsResponse = await fetch(`https://api.example.com/posts?userId=${user.id}`);
    const posts = await postsResponse.json();

    return { user, posts };
  } catch (error) {
    console.error("Error fetching data:", error);
  }
}
```

## Key Takeaways for Interviews

1. Understand how async and await work under the hood (Promises)
2. Explain error handling strategies with try...catch
3. Know when to use Promise.all for parallelism
4. Be ready to discuss the benefits of async/await over traditional Promises or callbacks
5. Practice common interview problems using async/await for clarity and readability