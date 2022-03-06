class Cinema (

    private val nome: String,
    private val horaAbertura: Byte,
    private val horaFechamento:Byte,

    ){
    private var assentos = mutableListOf<Assento>()
    private var filmes = mutableListOf<Filme>()

    fun listaFilmes() = filmes

    fun addNovoFilme(movie: Filme): Boolean = filmes.add(movie)

    fun RegistrandoAssento(assento: Assento): Boolean = assentos.add(assento)

    fun listaAssentos() = assentos
}