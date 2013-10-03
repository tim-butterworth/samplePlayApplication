name := "sampleApp"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.mongodb" % "mongo-java-driver" % "2.11.1",
  "com.google.inject" % "guice" % "3.0",
  "org.mockito" % "mockito-all" % "1.9.5",
  "com.google.code.gson" % "gson" % "2.2.4",
  "commons-codec" % "commons-codec" % "1.7",
  "com.manta.utils" % "common-utils" % "0.0.1-SNAPSHOT",
  "org.apache.commons" % "commons-lang3" % "3.1",
  "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "1.36"
  )    

resolvers += (
  "Local Maven Repository" at "file:///"+Path.userHome.absolutePath+"/.m2/repository"
)

resolvers += (
  "FlapDoodle" at "http://oss.sonatype.org/content/repositories/snapshots"
)

playJavaSettings
