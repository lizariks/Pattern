namespace BooksPatterns.creational.Factory;

public class HistoryBookFactory:BookFactory
{
    public override IBook createBook()=>new HistoryBook();
}