object ParenBalance {
  def balance(char: List[Char]): Boolean = {
    def balLoop(char: List[Char], bal: Int): Int = {
      if (char.isEmpty || bal < 0) {
        bal
      } else {
        balLoop(char.tail, bal + (if(char.head == '(') 1 else if(char.head == ')') -1 else 0))
      }

      balLoop(char, 0) == 0
    }
  }
}
