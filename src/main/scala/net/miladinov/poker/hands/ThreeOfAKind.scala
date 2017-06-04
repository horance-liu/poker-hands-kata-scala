package net.miladinov.poker.hands

import net.miladinov.poker.models.Value

object ThreeOfAKind extends CardsOfAKind (3) {
  def buildTitle (v: Value): String = s"Three ${v.plural}"
}
