object Pascal {
  def pascal(c: Int, r: Int): Int = {
    factorial(c) / (factorial(r) * factorial(c - r))
  }

  def factorial(n: Int): Int = {
    def factLoop(cur: Int, tot: Int): Int = {
      if (cur < 1) {
        tot
      } else {
        factLoop(cur - 1, tot * cur)
      }
    }

    factLoop(n, 1)
  }
}
