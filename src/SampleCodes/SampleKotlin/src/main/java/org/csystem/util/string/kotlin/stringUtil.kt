package org.csystem.util.string.kotlin

fun changeCase(s: String) : String
{
    val sb = StringBuilder(s.length)

    for (c in s)
        if (c.isUpperCase())
            sb.append(c.lowercaseChar())
        else
            sb.append(c.uppercaseChar())

    return sb.toString()
}


fun getFirstLongestPalindrome(s: String) : String
{
    TODO()
}

fun getLastLongestPalindrome(s: String) : String
{
    TODO()
}

fun getFirstShortestPalindrome(s: String) : String
{
    TODO()
}

fun getLastShortestPalindrome(s: String) : String
{
    TODO()
}

fun isIsogram(s: String, alphabet: String) : Boolean
{
    TODO()
}

fun isIsogramTR(s: String) = isIsogram(s, "abcçdefgğhıijklmnoöprsştuüvyz")

fun isIsogramEN(s: String) = isIsogram(s, "abcdefghijklmnopqrstuvwxyz")

fun isPalindrome(s: String) : Boolean
{
    TODO()
}

fun isPangramTR(s: String) = isPangram(s, "abcçdefgğhıijklmnoöprsştuüvyz")

fun isPangramEN(s: String) = isPangram(s, "abcdefghijklmnopqrstuvwxyz")

fun isPangram(s: String, alphabet: String) : Boolean
{
    for (c in alphabet)
        if (!s.contains(c, true))
            return false

    return true
}