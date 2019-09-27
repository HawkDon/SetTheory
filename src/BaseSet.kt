interface BaseSet<T> {
    fun member(setToCompare: Set<T>, value: T): Boolean
    fun compareTo(set: Set<T>): List<T>
}