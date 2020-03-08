import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcTest: StringSpec ({
    "1 + 1 = 2" {
        add(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        subtract(1, 1) shouldBe 0
    }

    "1 * 2 = 2" {
        multiple(1, 2) shouldBe 2
    }

    "2 / 2 = 0" {
        divide(2, 2)  shouldBe 1
    }
})