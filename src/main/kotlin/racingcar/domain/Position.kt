package racingcar.domain

import kotlin.math.max

@JvmInline
value class Position private constructor(val value: Int) {
    init {
        require(value >= 0)
    }

    fun move(newPosition: Int): Position {
        return Position(value + newPosition)
    }

    fun getMaxPosition(comparePosition: Int): Int {
        return max(comparePosition, value)
    }

    fun isMaxPosition(maxPosition: Int): Boolean {
        return value == maxPosition
    }

    companion object {
        private val ZERO = Position(value = 0)

        fun valueOf(value: Int): Position {
            if (value == 0) return ZERO
            return Position(value)
        }
    }
}
