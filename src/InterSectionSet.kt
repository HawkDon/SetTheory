class InterSectionSet<T>(private val interSectionSet: Set<T>, private val finalList: MutableSet<T> = mutableSetOf()) : BaseSet<T> {
    override fun member(set: Set<T>, value: T): Boolean {
        if(interSectionSet.contains(value) && set.contains(value)) {
            return true
        }
        return false
    }

    override fun compareTo(set: Set<T>): List<T> {

        for (outerElement in interSectionSet) {
            if(member(set, outerElement)) {
                finalList.add(outerElement)
            }
        }
        if(finalList.isEmpty()) {
            throw(Throwable("Set is empty!"))
        }
        return finalList.toList()
    }
}