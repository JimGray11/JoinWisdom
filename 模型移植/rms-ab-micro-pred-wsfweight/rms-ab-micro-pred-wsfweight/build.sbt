name := "rms-ab-micro-pred-wsfweight"

version := "1.3"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.5.1" % "provided",
  "joda-time" % "joda-time" % "2.9"
)