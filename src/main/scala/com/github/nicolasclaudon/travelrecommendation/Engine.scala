package com.github.nicolasclaudon.travelrecommendation

// Use Spark
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/**
  * Created by Nicolas Claudon on 10/12/2015.
  */
class Engine {
  val conf = new SparkConf()
    .setAppName("Travel Recommendation")
    .setMaster("local")
  val sc = new SparkContext(conf)

  def getVersion():String = {
    sc.version
  }
}
