package net.itspartner.test.n3

/**
 * Description: Application calculates sum of ages of all users and finds the eldest user
 * Task: Refactor, use Kotlin style constructions. Calculate average age of users.
 */
@SuppressWarnings("all")
fun main(args: Array<String>) {

    val u = mutableListOf<User>()
    u.add(User("Pavel", 50))
    u.add(User("Suresh", 50))
    u.add(User("Robin", 50))

    var s = 0
    var j = 0

    for (i in 0..2) {
        if (u[i].age > u[j].age) {
            j = i
        }

        s = s + u[i].age
    }

    println("The eldest user is " + u[j].name)
    println("Sum of all ages is " + s)
}