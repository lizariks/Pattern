namespace BooksPatterns.creational.Abstract;

public interface IBookPublisher
{
    IPaperBook createPaperBook();
    IElBook createEBook();
}