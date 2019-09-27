class UnionSet<T>(private val unionSet: Set<T>) : BaseSet<T> {
    override fun member(setToCompare: Set<T>, value: T): Boolean {
        if(unionSet.contains(value) || setToCompare.contains(value)) {
            return true
        }
        return false
    }

    override fun compareTo(set: Set<T>): List<T> {
        val values = unionSet.plus(set).toList();

        if(values.isEmpty()) {
            throw(Throwable("Empty array"))
        }
        return values
    }
}