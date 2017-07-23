lazy val root = (project in file(".")).
settings(
    inThisBuild(List(
        organization    := "liquidarmour",
        scalaVersion    := "2.12.2"
    )),
    name := "play-time",
    libraryDependencies ++= Seq(
      "joda-time" % "joda-time" % "2.9.9",
      "org.scalatest"     %% "scalatest"         % "3.0.1"         % Test,
      "org.mockito" % "mockito-all" % "1.9.5" % Test,
      "org.pegdown" % "pegdown" % "1.5.0" % Test,
      "org.hamcrest" % "hamcrest-all" % "1.3" % Test
    )
)