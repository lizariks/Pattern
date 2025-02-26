namespace BooksPatterns.creational.Factory;

public class FictionBookFactory:BookFactory
{
    public override IBook createBook() => new Fiction();
}