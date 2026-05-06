public class Livro {

    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes() {
        System.out.print("Título: "+ titulo);
        System.out.print("Autor: "+ autor);
        System.out.print("Páginas: "+ paginas);
    }
    
} 
