package pq.khanh.vn.trackandroidnew.model

/**
 * Created by khanhpq on 2/9/18.
 */
object DumpData {
    fun createUserList(): MutableList<User> {
        var users: MutableList<User> = mutableListOf()
        users.add(User("A1", IMAGE_URL, "la", 15, 2))
        users.add(User("Ha2", IMAGE_URL, "la", 28, 1))
        users.add(User("afijfa", IMAGE_URL, "la", 18, 3))
        users.add(User("tsefea", IMAGE_URL, "la", 35, 0))
        users.add(User("jfaiejf", IMAGE_URL, "la", 20, 12))
        users.add(User("afijfa", IMAGE_URL, "la", 17, 21))
        users.add(User("i9i9i", IMAGE_URL, "la", 40, 16))
        users.add(User("genbgte", IMAGE_URL, "la", 30, 1))
        return users
    }

    fun createAUser(): User {
        return User("afijfa", IMAGE_URL, "la", 15, 2)
    }

    const val IMAGE_URL = "https://cdn-images-1.medium.com/max/1600/1*zMUV6foMMwgciC44zkP3Vg.png"
}