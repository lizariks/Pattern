namespace BooksPatterns.creational.Abstract;

public class NovelPublisher: IBookPublisher
{
    public IPaperBook createPaperBook()=>new PaperNovel();
    public IElBook createEBook()=>new ElNovel();
}