import mill._, scalalib._


trait AppModule extends ScalaModule{
  def scalaVersion = "2.13.1"
  def ivyDeps = Agg[Dep](
    ivy"org.xerial:sqlite-jdbc:3.18.0",
    ivy"io.getquill::quill-jdbc:3.4.10",
    ivy"com.lihaoyi::scalatags:0.8.4",
  )

  object test extends Tests{
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.3",
      ivy"com.lihaoyi::requests::0.5.0",
    )
  }
}