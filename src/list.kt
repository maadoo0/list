fun main(args: Array<String>) {
    val users = ArrayList<String>(10)
        for (x in 0..10)
        {
            print("Enter Name of user$x : ")
            val y = readLine()
                 if (y != null)
                 {
                    users.add(y)
                 }
        }
    print("Names of users is :$users")
}
