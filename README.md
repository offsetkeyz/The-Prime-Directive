# The-Prime-Directive
Author: Colin McAllister
Version: April 29, 2020

## Description
Takes in an array of numbers separated by commas, and returns two lists. One for prime numbers, and the other for non-prime numbers.

This project was inspired by the CodeCademy project at the end of the Loops section.

#### .isPrime()
The first method determines if an individual integer is prime by dividing that number by every integer less than the number divided by 2. This is because you will never have to divide a number by more than half of itself.  Then, if the remainder is 0, the number is not prime. If no division leaves a remainder of 0, the number is prime.

#### .onlyPrimes()
This method sorts the numbers in an ArrayList into two separate ArrayLists: primeNumbers and numbers. This is done by calling the .isPrime() method on each of the numbers in the ArrayList.

#### .sort()
This method sorts the arraylists by natural order.
