import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MainTest : StringSpec({
    "max between 1 and 2 is 2" {
        max(1, 2) shouldBe 2
    }

    "max between 1 and 2 and 3 is 3" {
        max(1, 2, 3) shouldBe 3
    }
})