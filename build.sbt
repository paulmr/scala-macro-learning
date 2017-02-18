scalaVersion in ThisBuild := "2.12.1"

// need two separate projects for macros
lazy val macros = (project in file("macros"))
  .settings(
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.1"
  )

lazy val root = (project in file(".")).dependsOn(macros)
