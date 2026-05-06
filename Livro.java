public class Livro {

    String titulo;
    String autor;
    int paginas;
    boolean disponivel;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponivel = true;
    }

    public void exibirInformacoes() {
        System.out.print("Título: "+ titulo);
        System.out.print("Autor: "+ autor);
        System.out.print("Páginas: "+ paginas);
    }
    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado");
        } else {
            System.out.println("Livro não disponível");
        }
    }
} 
