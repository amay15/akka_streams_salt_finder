name := "saltfinder"

version := "0.1"

scalaVersion := "2.13.4"

idePackagePrefix := Some("com.amay15.saltfinder")

val AkkaVersion = "2.6.12"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-log4j12" % "1.7.30",
  "log4j" % "log4j" % "1.2.17",
  "com.github.scopt" %% "scopt" % "4.0.0",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test,
  "junit" % "junit" % "4.13.1" % Test,
  "org.scalatest" %% "scalatest" % "3.2.3" % Test
)
