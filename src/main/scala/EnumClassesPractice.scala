@main
def enumClassesPractice():Unit = {
  var currentState = GameState.STARTED
  for (i <- 1 to 12)
    println(currentState)
    currentState = changeState(currentState)
}

enum GameState:
  case STARTED
  case PLAYING
  case GAMEOVER


def changeState(currentState: GameState): GameState =
  currentState match
    case GameState.STARTED => GameState.PLAYING
    case GameState.PLAYING => GameState.GAMEOVER
    case _ => GameState.STARTED