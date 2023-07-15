name := """scala-play-realworld"""
organization := "com.klxsolutions"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.11"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test

libraryDependencies ++= Seq(
  filters,
  evolutions,
  ws,
  ehcache,
  cacheApi,
  "com.typesafe.play" %% "play-json" % "2.8.1",
  "org.julienrf" %% "play-json-derived-codecs" % "7.0.0",
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0",
  "commons-validator" % "commons-validator" % "1.6",
  "com.github.slugify" % "slugify" % "2.4",
  "com.h2database" % "h2" % "1.4.200",
  "org.mindrot" % "jbcrypt" % "0.4",
  "org.apache.commons" % "commons-lang3" % "3.9",

  "com.softwaremill.macwire" %% "macros" % "2.3.3" % "provided",

  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % "test",
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.klxsolutions.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.klxsolutions.binders._"
