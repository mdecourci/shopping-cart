
name := "shopping-cart"

version := "1.0"

scalaVersion := "2.11.5"

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"

libraryDependencies += "org.scalamock" % "scalamock-specs2-support_2.11" % "3.2.1"

libraryDependencies += "org.threeten" % "threetenbp" % "1.2"

