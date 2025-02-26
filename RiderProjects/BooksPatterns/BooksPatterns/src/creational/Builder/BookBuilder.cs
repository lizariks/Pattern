namespace BooksPatterns.creational.Builder;

public class BookBuilder : IBookBuilder
{
    private readonly Book book1 = new();

    public IBookBuilder setTitle(string title)
    {
        book1.Title = title;
        return this;
    }

    public IBookBuilder setAuthor(string author)
    {
        book1.Author = author;
        return this;
    }

    public IBookBuilder setPages(int pages)
    {
        book1.Pages = pages;
        return this;
    }

    public Book Build() => book1;
}