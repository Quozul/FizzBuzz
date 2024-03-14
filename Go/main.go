/*
 * Run with `go run main.go`
 */

package main

import "fmt"

func FizzBuzz(end int)  {
	for i := 0; i <= 10; i++ {
		var divisibleByThree = i % 3 == 0
		var divisibleByFive = i % 5 == 0
		if divisibleByThree && divisibleByFive {
			fmt.Println("FizzBuzz")
		} else if divisibleByThree {
			fmt.Println("Fizz")
		} else if divisibleByFive {
			fmt.Println("Buzz")
		} else {
			fmt.Println(i)
		}
	}
}

func main() {
	FizzBuzz(10)
}

