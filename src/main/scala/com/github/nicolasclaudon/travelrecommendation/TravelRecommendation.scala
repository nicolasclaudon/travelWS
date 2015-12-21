package com.github.nicolasclaudon.travelrecommendation

class TravelRecommendation extends TravelStack {

  val engine = new Engine()

  get("/version") {
    engine.getVersion()
  }

}
