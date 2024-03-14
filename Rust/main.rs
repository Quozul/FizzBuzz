/// Run with `rustc main.rs && ./main`

fn fizz_buzz(end: i32) {
    for i in 0..end {
        let is_divisible_by_three = i % 3 == 0;
        let is_divisible_by_five = i % 5 == 0;
        if is_divisible_by_three && is_divisible_by_five {
            println!("FizzBuzz");
        } else if is_divisible_by_three {
            println!("Fizz");
        } else if is_divisible_by_five {
            println!("Buzz");
        } else {
            println!("{i}");
        }
    }
}

fn main() {
    fizz_buzz(10);
}

