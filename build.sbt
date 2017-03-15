name := "HiCI"

version := "1.0"

scalaVersion := "2.12.0"

val scalazVersion = "7.2.8"

mainClass in (Compile,run) := Some("test")

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.1"

libraryDependencies += "org.scala-lang.modules" % "scala-parser-combinators_2.12" % "1.0.5"

libraryDependencies += "org.scala-lang.modules" % "scala-java8-compat_2.12" % "0.8.0"

