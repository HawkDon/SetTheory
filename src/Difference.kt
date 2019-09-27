class Difference<T>(private val differenceSet: Set<T>, private val finalList: MutableSet<T> = mutableSetOf()) : BaseSet<T> {
    override fun member(setToCompare: Set<T>, value: T): Boolean {
        if(differenceSet.contains(value) && !setToCompare.contains(value)) {
            return true
        }
        return false
    }

    override fun compareTo(set: Set<T>): List<T> {
        for (setElement in set) {
            if(member(set, setElement)) {
                finalList.add(setElement)
            }
        }
        if(finalList.isEmpty()) {
            throw(Throwable("Set is Empty!"))
        }
        return finalList.toList()
    }

}