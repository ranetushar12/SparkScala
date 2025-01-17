object Assignment_logical_operator {
    def main(args: Array[String]): Unit = {
      // 1. Check for Even AND Positive Number

      val number = 14
      val a = number > 0 && number % 2 == 0

      println(s"1 Is the number positive and even? $a")

      // 2. Range Check with or

      val number2 = -15
      val a2 = number2 < -10 || number2 > 0

      println(s"2 the number is in range? $a2")

      // 3. Odd Number Check with AND
      val number3 = 27
      val a3 = number3 % 2 != 0 && number3 % 3 != 0
      println(s"3 Is $number3 odd and not divisible by 3? $a3")

      // 4. Divisibility by 4 OR 6
      val number4 = 18
      if (number4 % 4 == 0 || number4 % 6 == 0) {
        println(s"4 number is divisible by either 4 or 6.")
      } else {
        println(s"4 number is not divisible by either 4 or 6.")
      }

      // 5. Eligibility for Voting OR Driving
      val age = 20

      if (age >= 18) {
        println("5-Eligible to vote.")
      } else if (age >= 16) {
        println("5-Eligible to drive.")
      } else {
        println("5-Not eligible to vote or drive.")
      }

      // 6. Multiple Range Check
      val number6 = 25

      if ((1 <= number && number <= 10) || (20 <= number && number <= 30)) {
        println(s"6-  $number6 is within the specified range.")
      } else {
        println(s"6-  $number6 is not within the specified range.")
      }

      // 7. Check for Negative AND Odd Number
      val n7 = -7

      if (n7 < 0 && n7 % 2 != 0) {
        println(s"7- $n7 is both negative and odd.")
      } else {
        println(s"7- $n7 is not both negative and odd.")
      }

      // 8. Eligibility for Senior Discount OR Student Discount

      val age2 = 63

      if (age2 > 60) {
        println("8  Eligible for senior citizen discount.")
      } else if (age2 < 25) {
        println("8  Eligible for student discount.")
      } else {
        println("8  Not eligible for any discount.")
      }

      // Divisibility by 5 AND 7:

      val number9 = 35

      if (number9 % 5 == 0 && number9 % 7 == 0) {
        println(s"9  $number9  is divisible by both 5 and 7.")
      } else {
        println(s"9  $number9  is not divisible by both 5 and 7.")
      }

      // Check for Non-Negative OR Even Number:

      val n10 = -8

      if (n10 >= 0 || n10 % 2 == 0) {
        println(s"10  $n10 is either non-negative or even.")
      } else {
        println(s"10   $n10 is neither non-negative nor even.")
      }

      // 11 Check for Prime AND Odd Number:

      val n11 = 17

      if (
        (n11 <= 1) ||
          (n11 <= 3 && n11 % 2 != 0) ||
          (n11 % 2 == 0 || n11 % 3 == 0) ||
          (5 to math.sqrt(n11).toInt by 6).exists(i => n11 % i == 0 || n11 % (i + 2) == 0)
      ) {
        println(s"11  $n11 is not both a prime number and an odd number.")
      } else {
        println(s"11  $n11 is both a prime number and an odd number.")
      }

      // 12)Eligibility for Discount OR Free Shipping:

      val purchaseAmount = 120

      if (purchaseAmount > 150) {
        println("12 ligible for discount.")
      } else if (purchaseAmount > 100) {
        println("12 Qualifies for free shipping.")
      } else {
        println("12 Not eligible for discount or free shipping.")
      }


      // 13 Divisibility by 3 OR 8:

      val z = 24

      if (z % 3 == 0 || z % 8 == 0) {
        println(s"13  $z is divisible by either 3 or 8.")
      } else {
        println(s"13  $z is not divisible by either 3 or 8.")
      }

      // 14 Check for Non-Positive AND Even Number:

      val x = -6

      if (x <= 0 && x % 2 == 0) {
        println(s"14 $x is both non-positive and even.")
      } else {
        println(s"14 $x is not both non-positive and even.")
      }

      // 15)Age Group Classification with AND:

      val age3 = 15

      if ((age3 >= 0) && (age3 < 13)) {
        println("14  Child")
      } else if ((age3 >= 13) && (age3 <= 19)) {
        println("14  Teenager")
      } else if (age3 >= 20) {
        println("14  Adult")
      } else {
        println("14 Invalid Age")
      }

      // 16)Check for Divisibility by 2 OR 5:

      val c = 25

      if (c % 2 == 0 || c % 5 == 0) {
        println(s"16  $c is divisible by either 2 or 5.")
      } else {
        println(s"16  $c is not divisible by either 2 or 5.")
      }

      // 17)Eligibility for Senior Discount AND Student Discount:

      val age4 = 70

      if (age4 > 60 && age4 < 25) {
        println("17  Eligible for both senior citizen and student discount.")
      } else {
        println("17 Not eligible for both senior citizen and student discount.")
      }

      // 19)Check for Multiple of 3 AND 7:

      val v = 21

      if (v % 3 == 0 && v % 7 == 0) {
        println(s"19  $v is both a multiple of 3 and 7.")
      } else {
        println(s"19  $v is not both a multiple of 3 and 7.")
      }

      //20)Divisibility by 5 OR 9:

      val b = 45

      if (b % 5 == 0 || b % 9 == 0) {
        println(s"20  $b is divisible by either 5 or 9.")
      } else {
        println(s"20  $b is not divisible by either 5 or 9.")
      }

      // 21)Check for Odd AND Not Divisible by 4:

      val n = 15

      if (n % 2 != 0 && n % 4 != 0) {
        println(s"21  $n is both odd and not divisible by 4.")
      } else {
        println(s"21  $n is not both odd and not divisible by 4.")
      }

      // 22)Check for Divisibility by 3 AND 5:

      val L = 15

      if (L % 3 == 0 && L % 5 == 0) {
        println(s"22- $L is divisible by both 3 and 5.")
      } else {
        println(s"22- $L is not divisible by both 3 and 5.")
      }

      //23)Eligibility for Discount OR Membership Benefits:

      val purchaseAmount1 = 180
      val hasLoyaltyCard = true

      if (purchaseAmount1 > 200) {
        println("23-  Eligible for discount.")
      } else if (hasLoyaltyCard) {
        println("23-  Qualifies for membership benefits.")
      } else {
        println("23-  Not eligible for any benefits.")
      }

      // 24)Divisibility by 2 OR 3:

      val K = 9

      if (K % 2 == 0 || K % 3 == 0) {
        println(s"24-  $K is divisible by either 2 or 3.")
      } else {
        println(s"24-  $K is not divisible by either 2 or 3.")
      }

      // 25)Check for Positive AND Not Divisible by 3:

      val J = 7

      if (J > 0 && J % 3 != 0) {
        println(s"25  $J is positive and not divisible by 3.")
      } else {
        println(s"25  $J is not positive and not divisible by 3.")
      }

      // 26)Eligibility for Senior Discount AND Not a New Customer:

      val age5 = 70
      val isNewCustomer = false

      if (age5 > 65 && !isNewCustomer) {
        println("26-  Eligible for senior citizen discount and not a new customer.")
      } else {
        println("26-  Not eligible for senior citizen discount or is a new customer.")
      }

      // 27)Check for Odd OR Prime Number:
      val H = 11

      // Check if H is odd
      val isOdd = H % 2 != 0

      // Check if H is prime
      val isPrime = if (H > 1) {
        !(2 until Math.sqrt(H).toInt + 1).exists(i => H % i == 0)
      } else {
        false
      }

      // Check if the number is either odd or prime
      val result = isOdd || isPrime

      // Output the result
      println(s"27- Is $H either odd or prime? $result")


      // 28)Eligibility for Discount AND Free Shipping:

      val purchaseAmount2 = 120

      if (purchaseAmount2 > 150) {
        println("Eligible for discount.")
      } else if (purchaseAmount2  > 100) {
        println("28- Qualifies for free shipping.")
      } else {
        println("28-  Not eligible for discount or free shipping.")
      }

      // 29)Check for Non-Negative AND Not Divisible by 7:

      val G = 14

      if (G >= 0 && G % 7 != 0) {
        println(s"29-  $G is non-negative and not divisible by 7.")
      } else {
        println(s"29-  $G is not non-negative or is divisible by 7.")
      }

      // 30)Eligibility for Student Discount OR Free Trial:

      val age7 = 22
      val isFreeTrialEligible = true

      if (age7 < 25) {
        println("30-  Eligible for student discount.")
      } else if (isFreeTrialEligible) {
        println("30- Eligible for free trial.")
      } else {
        println("30-  Not eligible for any benefits.")
      }


      // 31)Check for Divisibility by 4 OR 6:

      val F = 24

      if (F % 4 == 0 || F % 6 == 0) {
        println(s"31-  $F is divisible by either 4 or 6.")
      } else {
        println(s"31-  $F is not divisible by either 4 or 6.")
      }


    }
  }