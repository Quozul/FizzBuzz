"""
Run with `python main.py`
"""

def main(end):
    for i in range(end):
        is_divisible_by_three = i % 3 == 0
        is_divisible_by_five = i % 5 == 0
        if is_divisible_by_three and is_divisible_by_five:
            print("FizzBuzz")
        elif is_divisible_by_three:
            print("Fizz")
        elif is_divisible_by_five:
            print("Buzz")
        else:
            print(i)

if __name__ == "__main__":
    main(10)

