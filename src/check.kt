fun main() {
    check(
        name = "when a given valid IP4 should return true",
        result = isValidIP4("192.168.0.1"), correctResult = true

    )

    check(
        name = "when a given IP4 address have one digit-number in each segment should return true ",
        result = isValidIP4("1.1.0.1"), correctResult = true
    )


    check(
        name = "when a given empty string should return false",
        result = isValidIP4(""), correctResult = false
    )
    check(
        name = "when a given IP4 address has more than four segments should return false",
        result = isValidIP4("192.168.0.1.5"), correctResult = false
    )



    check(
        name = "when a given IP4 address one or more empty segment should return false",
        result = isValidIP4("192.168..1"), correctResult = false
    )

    check(
        name = "when a given IP4 address has less than four segments should return false",
        result = isValidIP4("192.168.0"), correctResult = false
    )

    check(
        name = "when a given IP4 address with a segment having more than one leading zero should return false",
        result = isValidIP4("192.002.3.1"), correctResult = false
    )
    check(
        name = "when a given IP4 address contains letters should return false",
        result = isValidIP4("192.168.a.1"), correctResult = false
    )


    check(
        name = "when a given IP4 address contains special characters should return false",
        result = isValidIP4("192.168.@.1"), correctResult = false
    )






    check(
        name = "when a given IP4 address contains a negative number should return false",
        result = isValidIP4("-1.168.0.1"), correctResult = false
    )


}

/**
 * a simple test function to test some cases based on the returned value from other function,
 * Print "Success" with the [name] param if the  [result] param match the [correctResult] param
 * and "Fail" with the [name] param on the opposite
 * @param name represent one case of cases to test
 * @param result  represent the  returned value of  a given function
 * @param correctResult  represent the result should the function returned based on the input
 *
 */
fun check(name :String, result:Boolean, correctResult:Boolean) {
    if (result == correctResult) {
        println("Success - $name ")
    } else {
        println("Failure - $name ")
    }
}