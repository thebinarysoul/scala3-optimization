import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala3-optimization",
    libraryDependencies += "com.storm-enroute" % "scalameter_2.13" % "0.21"
  )



