ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "hashla",
    idePackagePrefix := Some("com.niiadoteitech.hashla")
  )
