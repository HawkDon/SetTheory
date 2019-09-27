class Complement<T>(private val complementSet: Set<T>, private val finalList: MutableSet<T> = mutableSetOf()) : BaseSet<T> {
    override fun member(setToCompare: Set<T>, value: T): Boolean {
        return !complementSet.contains(value)
    }

    override fun compareTo(set: Set<T>): List<T> {
        for (setElement in set) {
            if(member(set, setElement)) {
                finalList.add(setElement)
            }
        }
        if(finalList.isEmpty()) {
            throw (Throwable("Set is Empty!"))
        }
        return finalList.toList()
    }

}