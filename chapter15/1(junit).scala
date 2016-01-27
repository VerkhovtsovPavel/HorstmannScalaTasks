import org.junit.Test

class Tested() {

  @Test def plus(): Unit ={ assert(1+1==2) }

  @Test(timeout =0, expected = classOf[NullPointerException]) def minus() { assert(2-1==1); throw new NullPointerException}
}