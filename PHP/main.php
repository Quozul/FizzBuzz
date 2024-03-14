<?php
/*
 * Run with `php main.php`
 */

function FizzBuzz(int $end) {
  for ($i=0; $i < $end; $i++) { 
    $isDivisibleByThree = $i % 3 == 0;
    $isDivisibleByFive = $i % 5 == 0;
    if ($isDivisibleByThree && $isDivisibleByFive) {
      print("FizzBuzz\n");
    } elseif ($isDivisibleByThree) {
      print("Fizz\n");
    } elseif ($isDivisibleByFive) {
      print("Buzz\n");
    } else {
      printf("%d\n", $i);
    }
  }
}

FizzBuzz(10);

