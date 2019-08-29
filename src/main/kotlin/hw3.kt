fun main(){
    println(timeInSecondsToString(30))
    println(timeInSecondsToString(60))
    println(timeInSecondsToString(130))
    println(timeInSecondsToString(360))
    println(timeInSecondsToString(3_600))   //one hour
    println(timeInSecondsToString(7_200))
    println(timeInSecondsToString(30_000))
    println(timeInSecondsToString(86_400))  //one day
    println(timeInSecondsToString(2_548_800))   //about one mounth
    println(timeInSecondsToString(30_000_000))  //more than one year
    println(timeInSecondsToString(100_000_000)) //some years
}

fun timeInSecondsToString(sec : Long) : String {
    val oneMinute = 60
    val oneHour = oneMinute*60
    val oneDay = oneHour*24
    val oneMounth = oneDay*30
    val oneYear = oneMounth*12
    val publishedAgo: String = when{
        (sec>oneYear*2) -> "Some years ago"
        (sec>oneYear) -> "One year ago"
        (sec>=oneMounth*2) -> ""+(sec/oneMounth)+" months ago"
        (sec>=oneMounth) -> "One month ago"
        (sec>=oneDay*2) -> ""+(sec/oneDay)+" days ago"
        (sec>=oneDay) -> "One day ago"
        (sec>=oneHour*2) -> ""+(sec/oneHour)+" hours ago"
        (sec>=oneHour) -> "One hour ago"
        (sec>=oneMinute*2) -> ""+(sec/oneMinute)+" minutes ago"
        (sec>=oneMinute) -> "One minute ago"
        else -> "less than a minute ago"
    }
    return publishedAgo
}