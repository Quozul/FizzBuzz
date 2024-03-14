/*
 * Run with `node index.js`
 */

function fizzBuzz(end) {
  for (let i = 0; i < end; i++) {
    const isDivisibleByThree = i % 3 === 0;
    const isDivisibleByFive = i % 5 === 0;
    if (isDivisibleByThree && isDivisibleByFive) {
      console.log("FizzBuzz");
    } else if (isDivisibleByThree) {
      console.log("Fizz");
    } else if (isDivisibleByFive) {
      console.log("Buzz");
    } else {
      console.log(i);
    }
  }
}

fizzBuzz(10);

