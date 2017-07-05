import kotlinx.html.button
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import kotlin.browser.document

fun main (args: Array<String>) {

    val rootDiv = document.getElementById("root")
    rootDiv?.innerHTML = "<h1>Hello Spring, from KotlinJS</h1>"

    val label = document.createElement("div")


    val div = document.create.div {
        h1 { +"Hello, Spring from Kotlin-HTML-JS" }
        button { +"Click Me"
            onClickFunction = { label.innerHTML = "Clicked"}
        }
    }

    rootDiv?.appendChild(div)
    rootDiv?.appendChild(label)

}