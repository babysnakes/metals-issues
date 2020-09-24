
lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.11.12",
    name := "scalafix-woes",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
