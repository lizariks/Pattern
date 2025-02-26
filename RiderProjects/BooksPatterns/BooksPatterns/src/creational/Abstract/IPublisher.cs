namespace BooksPatterns.creational.Abstract;

public class IPublisher
{
    IPaperBook createPaperBook();
    IElBook createIElBook();
}