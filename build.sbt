name := """scala-failsafe"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "net.jodah" % "failsafe" % "0.9.2",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0-RC3",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
