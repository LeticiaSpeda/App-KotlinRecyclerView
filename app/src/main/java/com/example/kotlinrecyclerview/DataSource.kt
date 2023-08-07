package com.example.kotlinrecyclerview

import com.example.kotlinrecyclerview.models.Live

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<Live> {
            val list = ArrayList<Live>()
            list.add(
                Live(
                    "LIVE #001 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Leticia Speda",
                    "https://13.ytimg.com/vi/7jvIJPgpcPs/maxresdefault",
                    "https://www.youtube.com/watch?v=7jvIJPgpcPs"
                )
            )

            list.add(
                Live(
                    "A arte de escrever programas legíveis! + 20 dicas práticas! (PARTE 1)",
                    "Leticia Speda",
                    "https://13.ytimg.com/vi/7jvIJPgpcPs/maxresdefault",
                    "https://www.youtube.com/watch?v=gaLOFIwDFLI&list=PLOf9Wh_GuZZxGM4DQEyu0zwSsjGO5Q8jq&index=2&pp=iAQB"
                )
            )

            list.add(
                Live(
                    " A arte de escrever programas legíveis! + 20 dicas práticas! - (PARTE 2)",
                    "Leticia Speda",
                    "https://13.ytimg.com/vi/7jvIJPgpcPs/maxresdefault",
                    "https://www.youtube.com/watch?v=VBfs42u4QKA&list=PLOf9Wh_GuZZxGM4DQEyu0zwSsjGO5Q8jq&index=3"
                )
            )

            list.add(
                Live(
                    "Desenvolvedor Android Júnior: o que você precisa saber!",
                    "Leticia Speda",
                    "https://13.ytimg.com/vi/7jvIJPgpcPs/maxresdefault",
                    "https://www.youtube.com/watch?v=gLNzLRqHF8c&list=PLOf9Wh_GuZZxGM4DQEyu0zwSsjGO5Q8jq&index=4"
                )
            )

            list.add(
                Live(
                    "Criando e publicando seu primeiro app Android! (Do Zero ao seu App na Loja!)",
                    "Leticia Speda",
                    "https://13.ytimg.com/vi/7jvIJPgpcPs/maxresdefault",
                    "https://www.youtube.com/watch?v=PRmkgeX5pOs&list=PLOf9Wh_GuZZxGM4DQEyu0zwSsjGO5Q8jq&index=5"
                )
            )

            list.add(
                Live(
                    "Dominando o RecyclerView com Kotlin no Android! (Aula COMPLETA 2022)",
                    "Leticia Speda",
                    "https://13.ytimg.com/vi/7jvIJPgpcPs/maxresdefault",
                    "https://www.youtube.com/watch?v=EB32R-u_tac&list=PLOf9Wh_GuZZxGM4DQEyu0zwSsjGO5Q8jq&index=6"
                )
            )

            return list
        }
    }

}