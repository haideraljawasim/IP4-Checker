fun main() {
    println("valid IP4 address")

}
/**
 * a simple function take an IP address [ip] as string  and check if valid IP4 or not
 * @param ip represent the ip address as a string
 * @return true if it valid and false if not a valid IP4 address
 */
fun isValidIP4(ip: String): Boolean {
    if (ip.isEmpty()) return false // return false if the ip string was empty


    val segments = ip.split(".")  // split the ip address into 4 segment

    if (segments.size != 4) return false


    for (segment in segments) {

        // convert each segment to int if all its chars numbers and to null if its have a char or any spatial characters

        val num = segment.toIntOrNull() ?: return false
        when {
            segment.isEmpty() || segment.length > 3 -> return false
            segment.length > 1 && segment.startsWith("0") -> return false
            num !in 0..255 -> return false
        }
    }

    return true// return true if didn't match any one from the above condition

}