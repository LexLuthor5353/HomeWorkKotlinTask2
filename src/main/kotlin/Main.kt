fun main() {
    val likes = 211
    val result = if (likes % 100 != 11 && likes % 10 == 1) println("Понравилось ${likes} человеку") else println("Понравилось ${likes} людям")

}