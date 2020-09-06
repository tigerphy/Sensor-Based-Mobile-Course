package fi.metropolia.retrofitapp

/**
 * Created by Jarkko on 12.2.2017.
 */

class President(var name: String, var startDuty: Int, var endDuty: Int, var description: String) : Comparable<President> {

    override fun compareTo(other: President): Int {
        return Integer.compare(this.startDuty, other.startDuty)
    }

    override fun toString(): String {
        return "$name $startDuty $endDuty"
    }
}
