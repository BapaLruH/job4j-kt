import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MainTest : StringSpec({
    "max between 1 and 2 is 2" {
        max(1, 2) shouldBe 2
    }

    "max between 1 and 2 and 3 is 3" {
        max(1, 2, 3) shouldBe 3
    }

    sortArray(arrayOf("0", null, "2", null, "4", "5")) shouldBe
            arrayOf("0", "2", "4", "5", null, null)
    sortArray(arrayOf("0", null, null, null, "4", "5")) shouldBe
            arrayOf("0", "4", "5", null, null, null)
    sortArray(arrayOf(null, null, null, null, null, null)) shouldBe
            arrayOfNulls(6)
    sortArray(arrayOf("0", "1", "2", "3", "4", "5")) shouldBe
            arrayOf("0", "1", "2", "3", "4", "5")
})