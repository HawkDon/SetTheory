class SubSets<T>(private val set: Set<T>, private val subSet: Set<T>){

    fun run(): Int {

        if(subSet.containsAll(set)) {
            return -1
        }

        if(set == subSet) {
            return 0
        }

        if(set.containsAll(subSet)) {
            return 1
        }

        if(!set.containsAll(subSet) || !subSet.containsAll(set)) {
            return -2
        }

        return 2
    }
}