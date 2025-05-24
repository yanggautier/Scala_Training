import scala.collection.mutable.ArrayBuffer

@main
def caseClassesChallenge():Unit = {
  val articles = ArrayBuffer[Blog]()
  articles.addOne(Blog("title1", "content 1", 2))
  articles.addOne(Blog("title2", "content 2", 3))

  val newArticles = ArrayBuffer[Blog]()
  for (article <- articles)
    newArticles.addOne(article.copy(title=article.title + " for my blog"))

  articles.addAll(newArticles)
  articles.foreach(println)
}

case class Blog(
               title: String,
               content: String,
               readers: Int
               )

