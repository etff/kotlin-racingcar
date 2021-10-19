package racingcar.view

class InputView {

    fun askNamesOfCars(): String {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        return readLine() ?: throw IllegalArgumentException("입력값은 null을 허용하지 않습니다.")
    }

    fun askTryCount(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readLine()?.toInt()
            ?: throw IllegalArgumentException("입력값은 null을 허용하지 않습니다.")
    }
}
