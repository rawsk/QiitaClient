package sample.qiitaclient

import sample.qiitaclient.model.Article
import sample.qiitaclient.model.User
import sample.qiitaclient.view.ArticleView

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articleView = ArticleView(applicationContext)

        articleView.setArticle(Article(id = "123",
                title = "Kotlin",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "ほげ", profileImageUrl = "http://www.example.com/img")))

        setContentView(articleView)
    }
}
