enablePlugins(SbtJsonPlugin)

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.0"

jsonInterpreter := plainCaseClasses
jsValueFilter := allJsValues.exceptEmptyArrays

lazy val root = (project in file("."))
  .settings(
    name         := "casing-json",
    organization := "com.uebercomputing",
    scalaVersion := "2.12.4",
    version      := "0.1.0-SNAPSHOT"
  )
